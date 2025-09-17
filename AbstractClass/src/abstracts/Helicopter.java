package abstracts;

public class Helicopter extends Flyable{

	@Override
	public void fly() {
		System.out.println("A helicopter is an aircraft that uses spinning blades,"
				+ " called rotors, to generate lift and thrust, allowing it to take"
				+ " off and land vertically, hover, and fly in any direction");
	}

}
