package ArrayPackage;

public class PositiveNigativeCount {

	public static void main(String[] args) {
		
		int arr[]= {3,5,-3,0,-2,4,5};
		int positive=0;
		int negative=0;
		int zero=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				positive++;
			}
			if(arr[i]<0) {
				negative++;
			}
			if(arr[i]==0) {
				zero++;
			}
		}
		System.out.println("Positive : "+ positive);
		System.out.println("Negative : "+ negative);
		System.out.println("Zero : "+ zero);
	}

}
