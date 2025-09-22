package shapeInterface;

public class Circle implements Shape {
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public void findArea() {
		double ca=(3.14*r*r);
		System.out.println(ca);
	}

	@Override
	public void sayThanks() {
		System.out.println("Dhanyawad !");
	}
	
	

}
