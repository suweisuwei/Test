package ch10;

class V{

}
public class OverWriteEquals {
    public static void main(String[] args) {
        String s1 = "123";
        String s2 = "123";
        System.out.println(s1.equals(s2));      //使用equals（）方法调用
        V v1 = new V();                         //实例化两个V类对象
        V v2 = new V();
        System.out.println(v1.equals(v2));      //使用equals（）方法比较v1和v2对象
    }
}


