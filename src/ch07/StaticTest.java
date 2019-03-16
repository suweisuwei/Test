package ch07;

public class StaticTest {
    static double PI = 3.1415;          //在类中定义静态常量
    static int id;                      //在类中定义静态变量

    public static void method1(){       //在类中定义静态方法
        System.out.println("running method1");
    }

    public void method2(){
        System.out.println(StaticTest.PI);      //调用静态常量
        System.out.println(StaticTest.id);      //调用静态变量
        StaticTest.method1();                   //调用静态方法
    }

//    public static StaticTest method3(){         // 在类中定义一个静态方法
//        method2();                              //调用非静态方法
//        return this;                            //在return语句中使用this关键字
//    }
}
