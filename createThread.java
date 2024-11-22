class ThreadA extends Thread {
    public void run(){
       System.out.println("ThreadA is running...");
    }
 }
 class ThreadB implements Runnable {
    public void run(){
       System.out.println("ThreadB is running...");
    }
 }
 class MainClass {
    public static void main(String[] args) {
       ThreadA t1 = new ThreadA();
       t1.start();
 
       ThreadB obj = new ThreadB();
       Thread t2 = new Thread(obj);
       t2.start();
    }
 }
 