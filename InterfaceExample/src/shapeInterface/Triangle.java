package shapeInterface;

public class Triangle implements Shape {
	private double h;
	private double b;

	public Triangle(double h, double b) {
		this.h = h;
		this.b = b;
	}

	@Override
	public void findArea() {
		double ta=0.5*b*h;
		System.out.println(ta);
	}

	@Override
	public void sayThanks() {
		System.out.println("Mandal Abhariye");
	}

}
