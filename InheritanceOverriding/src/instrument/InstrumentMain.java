package instrument;

public class InstrumentMain {

	public static void main(String[] args) {
		
		Instrument inst;
		inst=new gitar();
		inst.play();
		inst=new Piyino();
		inst.play();
		inst= new fluet();
		inst.play();
		
	}

}
