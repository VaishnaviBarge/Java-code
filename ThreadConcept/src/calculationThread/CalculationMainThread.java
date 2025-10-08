package calculationThread;

public class CalculationMainThread {

	public static void main(String[] args) {
		CalculationThread ct=new CalculationThread(30, 20);
		ct.start();
	}

}
