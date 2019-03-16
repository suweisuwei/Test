package ch07;

public class AngThing {
    public AngThing(){                      //定义无参构造方法
//        this("this调用有参构造方法");   //使用this调用有参构造方法
//        System.out.println("无参构造方法");
    }
//
    public AngThing(String name){          //定义有参构造方法
        System.out.println("有参构造方法");
    }
    public static void main(String[] args) {
        new AngThing();
        new AngThing("nhun");
    }
}


