package ArrayPackage;

public class elementAppearsOnce {

	public static void main(String[] args) {
		int[] arr= {2,2,3,5,4,4,5,6,6};
//		int n=arr.length;
		int result=0;
		for(int num: arr) {
			result^=num;
		}
		System.out.println(result);

	}

}
