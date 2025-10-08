package threadDemos;

public class ThreadDemo {

	public static void main(String[] args) {
		MyThread thread1=new MyThread();
		
		thread1.setName("Java");
		thread1.start();
		System.out.println(thread1.getName());
		System.out.println("thank You");
	}

}
