package ch10;

class Parent {
    Parent(){
        System.out.println("调用父类的parent()构造方法");
    }
}

class SubParent extends Parent{
    SubParent(){
        System.out.println("调用子类的SubParent()构造方法");
    }
}

public class Subroutine extends SubParent{
    Subroutine(){
        System.out.println("调用子类的Subroutine()构造方法");
    }

    public static void main(String[] args) {
        Subroutine s = new Subroutine();        //实例化子类对象
    }
}

