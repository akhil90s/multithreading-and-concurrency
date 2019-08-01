package multithreading;


public class DeadLockBetweenTwoThreads {
    String strone = "HAI";
    String strtwo = "HELLO";
    
    Thread t1 = new Thread("Thread One"){
        public void run(){
			while(true){
                synchronized(strone){
                	try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("In Deadlock");
						e.printStackTrace();
					}
                    synchronized(strtwo){
                        System.out.println(strone + strtwo);
                    }
                }
            }
        }
    };
   
    Thread t2 = new Thread("Thread Two"){
        public void run(){
            while(true){
                synchronized(strtwo){
                	System.out.println("In Deadlock");
                    synchronized(strone){
                        System.out.println(strtwo + strone);
                    }
                }
            }
        }
    };
     
    public static void main(String a[]){
        DeadLockBetweenTwoThreads obj = new DeadLockBetweenTwoThreads();
        obj.t1.start();
        obj.t2.start();
    }
}