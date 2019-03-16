package ch08;

public class Charac {
    public static void main(String[] args) {
        String str = Integer.toString(456);    //获取数字的十进制表示
        String str2 = Integer.toBinaryString(456);     //获取数字的二进制表示
        String str3 = Integer.toHexString(456);        //获取数字的十六进制表示
        String str4 = Integer.toOctalString(456);      //获取数字的八进制表示
        System.out.println("456的十进制表示为："+ str);
        System.out.println("456的二进制表示为："+ str2);
        System.out.println("456的十六进制表示为："+ str3);
        System.out.println("456的八进制表示为："+ str4);
    }
}
