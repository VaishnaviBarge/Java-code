package inheritanceExample;

public class B extends A {
	int x=20;
	
	public B() {
<<<<<<< HEAD
		super(1);
=======
		super(100);
>>>>>>> 41fa5ee101fe9e698e048f7c865120026c60ca9f
		System.out.println("it's the class B Default constructor");
	}
	
	public void Show() {
		super.Show();
		System.out.println("the value of base class x is :"+ super.x);
		System.out.println("the value of derived class x is :"+x);
		
	}
}
