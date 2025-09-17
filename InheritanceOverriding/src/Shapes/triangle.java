package Shapes;

public class triangle extends shape {
	private float l;
	private float b;
	
	public triangle(float l, float b) {
		this.l=l;
		this.b=b;
	}

	@Override
	public void area() {
		float ta=0.5f*l*b;
		System.out.println("The area of triangle is :"+ ta);
	}
	
}
