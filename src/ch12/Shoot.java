package ch12;

public class Shoot {
    static void pop()throws NegativeArraySizeException{
        //定义方法并抛出NegativeArrySizeException异常
        int[] arr = new int[-3];
    }

    public static void main(String[] args) {
        try{
            pop();
        }catch (NegativeArraySizeException e){
            System.out.println("pop()方法抛出的异常");
        }
    }
}
