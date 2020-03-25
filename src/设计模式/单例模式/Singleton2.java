package 设计模式.单例模式;

public class Singleton2 {
    private static volatile Singleton2 singleton2;

    private Singleton2() {
    }

    //线程安全的
    public static synchronized Singleton2 getInstance() {
        if (singleton2 == null)
            singleton2 = new Singleton2();

        return singleton2;
    }
}
