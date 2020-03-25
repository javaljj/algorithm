package 设计模式.原型模式;

public class Man implements Human,Cloneable {
    public Integer x = 0;

    private Child child;

    @Override
    public void hair() {
        System.out.println("short hair");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    @Override
    protected Man clone() {
        Man man = null;
        try {
            man = (Man) super.clone();
            Child clone = (Child) child.clone();
            man.setChild(clone);
        } catch (CloneNotSupportedException e) {

        }
        return man;
    }

    @Override
    public String toString() {
        return "Man{" +
                "x=" + x +
                ", child=" + child +
                '}';
    }
}
