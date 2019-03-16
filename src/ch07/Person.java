package ch07;
import java.applet.Applet;
import java.util.Date;

/**
 * 人类的 class
 */
public class Person {
    /** 人类的学名 */
    static String bioName;

    /** 静态代码块，初始化static成员 */
    static {
        bioName = "人类";
    }
    /** static 方法，获取人类学名的名称 */
    static void printBioName() {
        System.out.println("学名：" + bioName);
    }
    /** String类型的成员 */
    String name;
    int age;
    Date birthday;
    char gender;
    void printName() {
        System.out.println("人名：" + name);
    }

    public static void main(String[] args) {
        Person.bioName = "人类";
        Person.printBioName();
        Person xiaoming = new Person();
        xiaoming.name = "xiaoming";
        xiaoming.printName();
        Point point1 = new Point();
        point1.x = 1;
        point1.y = 2;
        Point origin = new Point();
        origin.x = 0;
        origin.y = 0;
        Vector a = new Vector();
        a.x = 10;
        a.y = 10;
        a.length();

        Circle circle1 = new Circle(5.0, origin);
        System.out.println(circle1.getArea());
//        Point pointA = new Point(1, 2);

        int[] test = new int[2];
        System.out.println(test[-1]);

    }
}

class Point {
    Point() {

    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int x;
    int y;
}

class Vector {
    int x;
    int y;

    double length() {
        return Math.sqrt(x * x + y * y);
    }

}

class Circle {
    Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;

    }

    double radius;
    Point center;

    double getArea() {
        return radius * radius * Math.PI;
    }
}