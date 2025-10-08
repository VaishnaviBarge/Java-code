package arithmaticExample;

public class ArithmaticMainThread {

	public static void main(String[] args) {
		ArithmaticOperation arithOp=new ArithmaticOperation(20, 40);
		ArithmaticThread ath=new ArithmaticThread(arithOp);
		
	}

}
