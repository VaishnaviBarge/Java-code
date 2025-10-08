package threadDemos;

public class MyThread extends Thread {
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hello "+i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
