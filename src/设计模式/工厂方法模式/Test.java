package 设计模式.工厂方法模式;

public class Test {

    public static void main(String[] args) {
        HumanFactory manFactory=new ManFactory();
        Human man = manFactory.createHuman();
        man.hair();


        HumanFactory womanFactory=new WomanFactory();
        Human woman = womanFactory.createHuman();
        woman.hair();

    }
}
