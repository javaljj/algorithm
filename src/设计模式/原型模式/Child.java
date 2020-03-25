package 设计模式.原型模式;

public class Child implements Cloneable{
    private String string;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Child{" +
                "string='" + string + '\'' +
                '}';
    }
}
