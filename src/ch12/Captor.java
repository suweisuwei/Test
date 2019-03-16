package ch12;

public class Captor {
    static int quotient(int x,int y) throws MyException{        //定义方法抛出异常
         if (y<0){
             throw new MyException("除数不能是负数");             //异常信息
         }
         return x/y;
    }

    public static void main(String[] args) {
        try{                                                //Try语句包含可能发生异常的语句
            int result = quotient(3,-1);              //调用方法quotient()
        }catch (MyException e){                            //处理自定义异常
            System.out.println(e.getMessage());            //输出异常信息
        }catch (ArithmeticException e){                    //处理ArithmeticException异常
            System.out.println("除数不能为0");               //输出提示信息
        }catch (Exception e){                               //处理其他异常
            System.out.println("程序发生了其他的异常");       //输出提示信息
        }
    }
}
