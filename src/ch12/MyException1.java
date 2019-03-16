package ch12;

public class MyException1 extends Exception {       //创建自定义异常类
    String message;
    public MyException1(String ErrorMessage){       //父类方法
        message = ErrorMessage;
    }
    public String getMessage(){         //覆盖getMessage()方法
        return message;
    }
}
