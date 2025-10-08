package NumberPattern;

public class NumberPattern {

	public static void main(String[] args) {
		numberPattern();
		numberPattern2();
	}

	public static void numberPattern() {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
	}
	public static void numberPattern2() {
		for(int i=0;i<=5;i++) {
			for(int j=0;j<=5-i;j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
	}
	public static void numberPattern3() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" "+j+" ");
			}
			System.out.println();
		}
	}
	
}
