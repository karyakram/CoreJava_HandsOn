package corejava.hoa.day8.que1;

class Test extends Thread {
	public void run() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Child Thread is executing!");
				
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("Interrupted exception occured "+e);
		}
	}
}

public class InterruptExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.start();
		
		t.interrupt();
		System.out.println("Main thread executed completely!");
	}

}
