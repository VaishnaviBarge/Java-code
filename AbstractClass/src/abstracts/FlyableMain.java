package abstracts;

public class FlyableMain {

	public static void main(String[] args) {
		Flyable farr[]=new Flyable[3];
		farr[0]=new Birds();
		farr[1]=new Helicopter();
		farr[2]=new Kite();
		
		display(farr);
	}
	public static void display(Flyable farr[]) {
		for(Flyable f:farr) {
			if(f instanceof Birds) {
				f.fly();
			}
			if(f instanceof Helicopter) {
				f.fly();
			}
			if(f instanceof Kite) {
				f.fly();
			}
		}
	}

}
