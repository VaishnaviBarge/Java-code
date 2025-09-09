package ArrayPackage;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCountElementInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,4,2,1,5,5,6};
			Map<Integer, Integer> freqMap=new HashMap<>();
			
			for(int num: arr) {
				freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
			}
			
			for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		
	}

}
