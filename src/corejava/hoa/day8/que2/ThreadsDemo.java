package corejava.hoa.day8.que2;

public class ThreadsDemo implements Runnable {	      
		     public void run() {
	            for(int i = 1; i <= 3; i++) {
	            try {
	              Thread.sleep(500);
	             } 
	            catch (Exception e) {
	              
	             }	
	           System.out.println(Thread.currentThread() + " is: " +i); 
	            }
	          }
	         public static void main(String[] args) {
	        	 ThreadsDemo t1 = new ThreadsDemo();
	             Thread th1 = new Thread(t1, "First Child Thread");

	             ThreadsDemo t2 = new ThreadsDemo();
	             Thread th2 = new Thread(t2, "Second Child Thread");

	             th1.start();
	             th2.start();
	          }
	    }