package 设计模式.工厂方法模式;

public class WomanFactory implements HumanFactory {
    @Override
    public Human createHuman() {
        return new Woman();
    }
}
