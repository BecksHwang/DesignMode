package Singleton.com.becks.entity;

import java.util.HashMap;
import java.util.Map;

public class Singleton3 {
	private static Map<String, Singleton3> map = new HashMap<String, Singleton3>();
	static {
		Singleton3 single = new Singleton3();
		map.put(single.getClass().getName(), single);
	}

	// 保护的默认构造子
	protected Singleton3() {
	}

	// 静态工厂方法,返还此类惟一的实例
	public static Singleton3 getInstance(String name) {
		if (name == null) {
			name = Singleton3.class.getName();
			System.out.println("name == null" + "--->name=" + name);
		}
		if (map.get(name) == null) {
			try {
				map.put(name, (Singleton3) Class.forName(name).newInstance());
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return map.get(name);
	}

	// 一个示意性的商业方法
	public String about() {
		return "Hello, I am RegSingleton.";
	}

	public static void main(String[] args) {
		Singleton3 single3 = Singleton3.getInstance(null);
		System.out.println(single3.about());
	}
}
/**
 * 登记式单例类
 * 登记式单例实际上维护了一组单例类的实例，将这些实例存放在一个Map（登记薄）中，
 * 对于已经登记过的实例，则从Map直接返回，对于没有登记的，则先登记，然后返回。
 */