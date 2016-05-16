package Singleton.com.becks.entity;

public class Singleton2 {
	// 私有的默认构造子
	private Singleton2() {
	}

	// 注意，这里没有final
	private static Singleton2 single = null;

	// 静态工厂方法
	public synchronized static Singleton2 getInstance() {
		if (single == null) {
			single = new Singleton2();
		}
		return single;
	}
}
/**
 *懒汉式单例类.在第一次调用的时候实例化
 *懒汉式单例的实现没有考虑线程安全问题，它是线程不安全的，并发环境下很可能出现多个Singleton实例
 *实现线程安全有以下三个方法：
 */
/*
1、在getInstance方法上加同步
public static synchronized Singleton getInstance() {  
    if (single == null) {    
        single = new Singleton();  
    }    
   return single;  
}
*/

/*
2、双重检查锁定
public static Singleton getInstance() {  
        if (singleton == null) {    
            synchronized (Singleton.class) {    
               if (singleton == null) {    
                  singleton = new Singleton();   
               }    
            }    
        }    
        return singleton;   
    }
*/

/*
3、静态内部类
public class Singleton {    
    private static class LazyHolder {    
       private static final Singleton INSTANCE = new Singleton();    
    }    
    private Singleton (){}    
    public static final Singleton getInstance() {    
       return LazyHolder.INSTANCE;    
    }    
}
*/