package mode;

/**
 * @Author create by fgzhong
 * @Date 2018/9/13
 * @Description 单例模式
 */
public class Singleton {

    private Singleton(){}

    // 懒汉模式
    private static Singleton singleton1 = new Singleton();
    public static Singleton getInstance1() {
        return singleton1;
    }

    // 饿汉模式 --  引申问题 volatile、synchronized关键字解析
    private volatile static Singleton singleton2;
    public synchronized static Singleton getInstance2() {
        if (singleton2 == null) singleton2 = new Singleton();
        return singleton2;
    }
    public static Singleton getInstance3() {
        if (singleton2 == null) {
            synchronized (Singleton.class) {
                if (singleton2 == null) singleton2 = new Singleton();
            }
        }
        return singleton2;
    }

    // 静态内部类  -- 引申问题 内部类作用,类加载过程
    private static class InnerObject {
        private static Singleton singleton = new Singleton();
    }
    public static Singleton getInstance4() {
        return InnerObject.singleton;
    }

    // 静态代码块中；内部枚举类
}
