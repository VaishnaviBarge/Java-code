package MathBasic;

import java.util.ArrayList;

public class MathInfo {
	
	public int CountDigit(int n) {
		int count=0;
		while(n>0){
            int lastDig=n%10;
            n=n/10;
            count++;
        }
        return count;
	}
	
	public int ReverseDigit(int n) {
		int lastDig;
		int rev=0;
		while(n>0) {
			lastDig=n%10;
			n=n/10;
			rev=(rev*10)+lastDig;
		}
		return rev;
	}
	
	public boolean checkIfPalintrom(int n) {
		int lastDig;
		int rev=0;
		int temp=n;
		while(n>0) {
			lastDig=n%10;
			n=n/10;
			rev=(rev*10)+lastDig;
		}
		if(temp==rev) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean Armstrong(int n) {
    int sum = 0;
    int temp = n;
    int lastDig;
    int digits = 0;
    
    int numCopy = n; 
    while (numCopy > 0) {
        numCopy /= 10;
        digits++;
    }

    while (n > 0) {
        lastDig = n % 10;
        int power = 1;
        for (int i = 0; i < digits; i++) {
            power *= lastDig;  
        }
        sum += power;
        n /= 10;
    }

    return sum == temp;
}

	public ArrayList<Integer> AllDivisionNumber(int n) {
//		int[] nums=new int[n]; 
		ArrayList<Integer> nums=new ArrayList<Integer>();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				nums.add(i);
			}
			else continue;
		}
		return nums;
	}
	
	public ArrayList<Integer> AllDivisionNumber2(int n) {
		double m=Math.sqrt(n);
		ArrayList<Integer> nums=new ArrayList<Integer>();
		for(int i=1;i<=m;i++) {
			if(n%i==0) {
				nums.add(i);
				if((n/i)!=i) {
					nums.add(n/i);
				}
			}
			else continue;
		}
		return nums;
	}
	
	public boolean IsPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) return true;
		else return false;
	}
	
	public boolean IsPrime2(int n) {
		int count=0;
		double m=Math.sqrt(n);
		for(int i=1;i<=m;i++) {
			if(n%i==0) {
				count++;
				if((n/i)!=i) {
					count++;
				}
			}
		}
		if(count==2) return true;
		else return false;
	}
	
	public int GCDLCF(int m,int n) {
		int k=Math.min(n,m);
		int a;
		for(int i=k;i<=1;i++) {
			if(m%i==0&&n%i==0) {
				return i;
			}
			
		}
		return 1;
		
	}
}
