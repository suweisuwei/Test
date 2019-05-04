package ch18;

public class OverrideTest {
    public static void main(String[] args) {
        Student xhx = new Student();
        xhx.name = "xhx";
        xhx.introduce();
    }
}


class Person{
    String name;

    public void introduce() {
        System.out.println("Hi, I'm " + name + ", a person");
    }
}

class Student extends Person{
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Hi, I'm " + name + ", a student");
    }

}