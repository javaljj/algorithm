package 设计模式.单例模式;

public class Singleton1 {

    private static Singleton1 singleton1;

    private Singleton1() {
    }

    //多线程不安全.
    public static Singleton1 getInstance() {
        if (singleton1 == null)
            singleton1 = new Singleton1();
        return singleton1;
    }
}
