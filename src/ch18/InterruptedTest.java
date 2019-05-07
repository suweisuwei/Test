package ch18;

public class InterruptedTest implements Runnable {
    private boolean isContinue = false;             //设置一个标记变量，默认值为false

    public void run(){
        while (true){

            if(isContinue){
                break;
            }
        }

        }
    public void setContinue(){
        this.isContinue = true;

    }
}
