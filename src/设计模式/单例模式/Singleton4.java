package 设计模式.单例模式;

public class Singleton4 {

    private static volatile Singleton4 singleton4;

    private Singleton4() {
    }

    public static Singleton4 getInstance() {

        if (singleton4 == null) {
            synchronized (Singleton4.class) {
                if (singleton4 == null) {
                    singleton4 = new Singleton4();
                }
            }
        }
        return singleton4;
    }
}
