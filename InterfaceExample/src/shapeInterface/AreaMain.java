package shapeInterface;

public class AreaMain {
	public static void main(String[] args) {
		Shape s=null;
		s=new Circle(1.4);
		s.findArea();
		s.sayThanks();
		s=new Triangle(2.3,5.3);
		s.findArea();
		s.sayThanks();
	}
}
