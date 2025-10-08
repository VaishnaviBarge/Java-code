package arithmaticExample;

public class ArithmaticThread extends Thread {
	
	ArithmaticOperation arithOperation;
	public ArithmaticThread(ArithmaticOperation arithOperation) {
		
		this.arithOperation = arithOperation;
		Thread t=new Thread(this);
		t.start();
	}
	
	public void run() {
		arithOperation.getSum();
		arithOperation.getDiff();
		arithOperation.getDiv();
		arithOperation.getMulti();
	}
	
	
	
}
