package ArrayPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctElementWindowK {
	public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;

        List<Integer> result = countDistinct(arr, k);
        System.out.println(result);  // Output: [3, 4, 4, 3]
    }
	
	public static List<Integer> countDistinct(int[] arr,int k){
		Map<Integer, Integer> freqMap=new HashMap<Integer, Integer>();
		List<Integer> Result=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			freqMap.put(arr[i],freqMap.getOrDefault(arr[i], 0)+1);
			//When we reach window size
			if(i>=k-1) {
				//count of distinct element 
				Result.add(freqMap.size());
				
				//remove left most element of the window
				int toRemove=arr[i-k+1];
				
				freqMap.put(toRemove, freqMap.get(toRemove)-1);
				if(freqMap.get(toRemove)==0) {
					freqMap.remove(toRemove);
				}
				
			}
		}
		return Result;
	}
}
