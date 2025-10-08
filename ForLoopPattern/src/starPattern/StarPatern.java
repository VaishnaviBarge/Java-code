package starPattern;

public class StarPatern {
	public static void main(String[] args) {
		basicSquarePattern();
		System.out.println();
		leftTrianglePattern();
		System.out.println();
		leftInverseTriangle();
		System.out.println();
		rightTrianglePattern();
		System.out.println();
		rightTriangleInverse();
		System.out.println();
		butterflyPattern();
	}
	
	public static void basicSquarePattern() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
			System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	public static void leftTrianglePattern() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	public static void leftInverseTriangle() {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void rightTrianglePattern() {
		for(int i=1;i<=5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print("   ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	public static void rightTriangleInverse() {
		for(int i=1;i<=5;i++) {
			for(int j=2;j<=i;j++) {
				System.out.print("   ");
			}
			for(int j=i;j<=5;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	public static void butterflyPattern() {
		for(int i=1; i<5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			for(int j=5;j>i;j--) {
				System.out.print("   ");
			}
			for(int j=5;j>i;j--) {
				System.out.print("   ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for(int j=i;j<=5;j++) {
				System.out.print(" * ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print("   ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print("   ");
			}
			for(int j=i;j<=5;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	
}
