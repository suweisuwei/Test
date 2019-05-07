package ch18;

public class ThreadSafeTest implements Runnable{
    int num = 10;
    public void run() {
        while (true) {
            if (num > 0) {
                synchronized ("") {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("tickets" + --num);
                }
            }
        }
    }
    public static void main(String[] args) {
        ThreadSafeTest t = new ThreadSafeTest();
        Thread tA = new Thread(t);
        Thread tB = new Thread(t);
        Thread tC = new Thread(t);
        Thread tD = new Thread(t);
        tA.start();
        tB.start();
        tC.start();
        tD.start();

    }
}
