package Shapes;

public class circle extends shape {
	private float r;
	
	public circle(float r) {
		this.r=r;
	}

	@Override
	public void area() {
		float ca=3.14f*r*r;
		System.out.println("The area of circle is :"+ ca);
	}
	
	
	
	
}
