package FamilyInheritance;

public class Son extends Father{
	private int sage;
	
	public Son(int sage) {
		super(sage+30);
		this.sage=sage;
	}
	public void showAge() {
		super.showAge();
		System.out.println("Son's age is :"+sage);
	}
}
