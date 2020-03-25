package 设计模式.工厂方法模式;

public class ManFactory implements HumanFactory {
    @Override
    public Human createHuman() {
        return new Man();
    }
}
