package 设计模式.原型模式;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Child child=new Child();
        child.setString("123");
        Man man=new Man();
        man.setChild(child);

        System.out.println(man);

        Man man1=  man.clone();

        man1.setX(2);
        man1.getChild().setString("5555");


        System.out.println(man1);
        System.out.println(man);

        System.out.print(man.hashCode()+"####"+ man1.hashCode());



    }
}
