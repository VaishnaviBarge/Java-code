package ArrayPackage;

public class TwoPointerMoveZero {

	public static void main(String[] args) {
		int[] num= {1,0,3,4,0,4,0};
		movezero(num);
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]+"");
		}

	}
	
	public static void movezero(int[] num) {
		
		int i=0;
		for(int j=0;j<num.length;j++) {
			if(num[j]!=0) {
				num[i]=num[j];
				i++;
			}
		}
		for(int j=i;j<num.length;j++) {
				num[j]=0;
		}
	}

}
