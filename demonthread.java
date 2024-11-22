class BackgroundTask extends Thread {
    public void run(){
       while(true){       //Continuous task
          try{
             System.out.println("Background task running...");
             Thread.sleep(2000); //Sleep for 2 seconds
          }catch(InterruptedException e){
             e.printStackTrace();
          }
       }
    }
 }
 class MainClass {
    public static void main(String[] args) {
       BackgroundTask bt = new BackgroundTask();                
       bt.setDaemon(true); //Setting the thread as a daemon             
       bt.start();         //Starting the daemon thread
       System.out.println("Main thread finished."); 
    }
 }