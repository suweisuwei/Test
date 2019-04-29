package ch17;
import static java.lang.System.out;

public class ShowEnum {
    enum Constants2{            //将常量放置在枚举类型中
        Constants_A,Constants_B
    }
    //循环由values()方法返回的数值
    public static void main(String[] args) {
        for (int i = 0;i<Constants2.values().length;i++){
            //将枚举成员变量打印
            out.println("枚举类型成员变量:"+Constants2.values()[i]);
        }
    }
}
