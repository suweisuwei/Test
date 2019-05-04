package ch18;

public class Inter {
    public void runAThread() {
        // do sth;
        System.out.println("Another thread.");
    }


    public static void main(String[] args) {
        new AThread().start();
        new Thread(new BThread()).start();

        new Thread(){
            public void run() {
                System.out.println("inner A thread");
            }
        }.start();
        new Thread(new Runnable() {
            public void run() {
                System.out.println("Inner Runnable.");
            }
        }).start();
        new Thread(()-> System.out.println("Inner Runnable with labmda.")).start();
    }
}

class AThread extends Thread {
    public void run() {
        System.out.println("A thread");
    }
}
class BThread implements Runnable {
    public void run() {
        System.out.println("B thread");
    }
}


