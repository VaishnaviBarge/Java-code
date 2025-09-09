package ArrayPackage;

import java.util.HashMap;
import java.util.Map;

public class FrequencyMaximum {

	public static void main(String[] args) {
		int[] arr= {1,2,33,2,4,2,33,9,9};
		findMaxFrequency(arr);
	}
	public static void findMaxFrequency(int[] arr) {
		HashMap<Integer,Integer> freqMap=new HashMap<>();
		for(int num:arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0)+1);
		}
		int maxFreq=0;
		int maxElement=arr[0];
		for(Map.Entry<Integer, Integer> entry: freqMap.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		for(int key:freqMap.keySet()) {
			if(freqMap.get(key)>maxFreq) {
				maxFreq=freqMap.get(key);
				maxElement=key;
			}
		}
		
		System.out.println("Max Element : "+maxElement+" Max Frequency : "+maxFreq);
	}

}
