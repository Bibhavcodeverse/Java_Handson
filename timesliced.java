class ThreadA extends Thread {
    String name;
    int i = 0; // Initialize i to 0

    public ThreadA(String name) {
        this.name = name;
    }



    public void run() {
        System.out.println(name + " is playing");
        while (i < 4) {
            System.out.println(name+" scores " + i);
            i++;
            try {
                Thread.sleep(1000); // Sleep for 2 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

 class ThreadB implements Runnable{
    public void run(){
        System.out.println("Thanku");
    }




 }

public class timesliced {
    public static void main(String[] args) {
        ThreadA t1 = new ThreadA("Bibhav");
        ThreadA t2 = new ThreadA("Yogesh");
        ThreadA t3 = new ThreadA("Vivek");
        ThreadA t4 = new ThreadA("Panakj");
        ThreadA t5 = new ThreadA("Ayush Singh");
        ThreadA t6 = new ThreadA("Raj verma");
        t1.setPriority(10);
        t2.setPriority(8);
        t3.setPriority(5);
        t6.setPriority(1);
        t5.setPriority(1);
        t4.setPriority(1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
            t6.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        ThreadB B1=new ThreadB();
        Thread b1=new Thread(B1);

        b1.start();
       
        
        

        

        


        
    }
}
