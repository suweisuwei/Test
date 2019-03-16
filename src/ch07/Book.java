package ch07;

public class Book {
    private String name;            //定义一个String型的成员变量


    public String getName(){        //定义一个getName()方法
        int id = 0;                 //局部变量
        setName("Java");            //调用类中其他方法
        return id + this.name;      //设置方法返回值
    }

    private void setName(String bookname){       //定义一个 setName()方法
        name = bookname;                    //将参数值赋予类中的成员变量
    }

    public Book getBook(){
        Book javaBook = new Book();
        Book newJavaBook = javaBook.getBook();
        return this;                //返回Book类引用
    }

}
