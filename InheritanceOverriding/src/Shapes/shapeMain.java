package Shapes;


public class shapeMain {

	public static void main(String[] args) {
		
		shape s=null;
		
		s=new triangle(2.3f, 4.3f);
		s.area();
		s=new circle(3.5f);
		s.area();
	}

}
