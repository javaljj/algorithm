package designmodel.观察者;

public class Test {
    public static void main(String[] args) {
        Observer observer1=new Observer();
        Observer observer2=new Observer();
        Subject subject=new Subject();
        subject.add(observer1);
        subject.add(observer2);
        subject.notifyAll("有星人来了");
    }
}
