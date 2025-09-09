package ArrayPackage;

public class FrequencyCount {

	public static void main(String[] args) {
		int[] arr= {2,2,3,5,4,5,6};
		int n=arr.length;
		int[] frequency=new int[n+1];
		
		for(int i=0;i<n;i++) {
			frequency[arr[i]]++;
		}
		System.out.print("[");
		for(int i=1;i<=n;i++) {
			System.out.print(i+":"+frequency[i]+", ");
		}
		System.out.print("]");

	}

}
