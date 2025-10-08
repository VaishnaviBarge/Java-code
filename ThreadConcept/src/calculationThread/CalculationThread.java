package calculationThread;

public class CalculationThread extends Thread {
	private int n1;
	private int n2;
	
	public CalculationThread(int n1, int n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public void run() {
		getSum();
		getDiff();
		getMulti();
		getDiv();
	}
	public void getSum() {
		int add=n1+n2;
		System.out.println("Add is "+add);
	}
	public void getDiff() {
		int diff=n1-n2;
		System.out.println("diff is "+diff);
	}
	public void getMulti() {
		int multi=n1-n2;
		System.out.println("multi is "+multi);
	}
	public void getDiv() {
		int div=n1-n2;
		System.out.println("div is "+div);
	}
}
