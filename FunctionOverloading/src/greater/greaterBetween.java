package greater;

public class greaterBetween {
	public void greater(int a, int b) {
		if(a>b) {
			System.out.println(a+" is greater then "+b);
		}
		else if (a==b) {
			System.out.println("both "+a+" and "+b+ " are equal");
		}
		else {
			System.out.println(b+"is greater than "+a);
		}
	}
	
	public void greater(float a, float b) {
		if(a>b) {
			System.out.println(a+" is greater then "+b);
		}
		else if (a==b) {
			System.out.println("both "+a+" and "+b+ " are equal");
		}
		else {
			System.out.println(b+"is greater than "+a);
		}
	}
	
	public void greater(char a, char b) {
		if(a>b) {
			System.out.println(a+" is greater then "+b);
		}
		else if (a==b) {
			System.out.println("both "+a+" and "+b+ " are equal");
		}
		else {
			System.out.println(b+"is greater than "+a);
		}
	}
}
