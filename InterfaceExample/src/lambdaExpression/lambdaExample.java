package lambdaExpression;

public class lambdaExample {

	public static void main(String[] args) {
//		A obj=new A() {
//			public void show() {
//				System.out.println("in show");
//			}
//		};
//		obj.show();
		
//		int i=0;
		// after suger cotting the code 
		
		A obj = (i, j) -> i+j ;

		System.out.println(obj.show(2,2));
	}

}
