package ch10;

class Test1 {
    public Test1() {                     //构造方法
        //SomeSentence
    }

    protected void doSomething() {       //成员方法
        //SOmeSentence
    }
    protected Test1 dolt(){              //方法返回值类型是Test类型
        return new Test1();
    }
}
class Test2 extends Test1{              //继承父类
    public Test2(){                     //构造方法
        super();                        //调用父类构造方法
        super.doSomething();            //调用父类成员方法
    }
    public void doSomethingnew(){       //新增方法
        //SOmeSentence
    }
    public void doSomething(){          //重写父类方法，将方法权限改成public
        //SomeSentence
    }
    protected Test2 dolt(){             //重写父类方法，方法返回值类型为Test2类型
        return new Test2();
    }
}

