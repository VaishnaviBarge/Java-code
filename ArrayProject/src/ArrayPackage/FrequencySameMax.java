package ArrayPackage;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencySameMax {
	public static void main(String[] args) {
		int[] arr={1,2,3,2,4,3,6,5,6,5,4};
		FindSameMaxFrequency(arr);
	}
	public static void FindSameMaxFrequency(int[] arr) {
		HashMap<Integer, Integer> freqMap=new HashMap<Integer, Integer>();
		
		for(int num:arr) {
			freqMap.put(num,freqMap.getOrDefault(num, 0)+1);
		}
		
		int maxFreq=0;
		for(int value:freqMap.values()) {
			if(value>maxFreq) {
				maxFreq=value;
			}
		}
		
		ArrayList<Integer> result=new ArrayList<Integer>();
		for(int key:freqMap.keySet()) {
			if(freqMap.get(key)==maxFreq) {
				result.add(key);
			}
		}
		System.out.println("Elements with max frequency (" + maxFreq + "): " + result);
	}
}
