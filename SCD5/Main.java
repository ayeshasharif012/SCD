package lab2;
public class Main extends Thread {
    private static boolean stopThreads = false;
    public void run() {
        for (int i = 1; i <= 26; i++) {
            char randomChar = (char) ('A' + (int) (Math.random() * 26))
            try {
                Thread.sleep((long) (Math.random() * 400 + 100));
                System.out.println(Thread.currentThread().getName() + " - " + randomChar)
                if (stopThreads) {
                    System.out.println(Thread.currentThread().getName() + " is stopped.");
                    return;
                }
            } catch (InterruptedException e) {
                System.out.println(e);
            }}}
    public static void main(String[] args) {
        Main t1 = new Main();
        Main t2 = new Main();
        Main t3 = new Main();
        t1.start();
        t2.start();
        t3.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        stopThreads = true;
        System.out.println("Stop flag is set. Thread t3 will stop.");
    }}
