package Singleton.com.becks.entity;

public class Singleton {
	private Singleton() {
	}

	private static final Singleton single = new Singleton();

	// 静态工厂方法
	public static Singleton getInstance() {
		return single;
	}
}
/**
 * 饿汉式单例类.在类初始化时，已经自行实例化. 
 * 饿汉式在类创建的同时就已经创建好一个静态的对象供系统使用，以后不再改变，所以天生是线程安全的。
 * Singleton通过将构造方法限定为private避免了类在外部被实例化，在同一个虚拟机范围内，
 * Singleton的唯一实例只能通过getInstance()方法访问。
 */