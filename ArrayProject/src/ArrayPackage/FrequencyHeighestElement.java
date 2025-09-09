package ArrayPackage;

import java.util.Arrays;
import java.util.HashMap;

public class FrequencyHeighestElement {

	public static void main(String[] args) {
		int[] arr= {1,2,3,3,5,5,5,8,7};
		frequencyElement(arr);
	}
	public static void frequencyElement(int[] arr) {
		Arrays.sort(arr);
		HashMap<Integer, Integer> freq=new HashMap<Integer, Integer>();
		
		int i=0;
		
		while(i<arr.length) {
			int count=1;
			while(i+1<arr.length && arr[i]==arr[i+1]) {
				count++;
				i++;
			}
			freq.put(arr[i],count);
			i++;
		}

		for(Integer key: freq.keySet()) {
			System.out.println(key+"->"+freq.get(key));
			
		}
		
		int maxFreq = 0;
        int maxKey = 0;

        for (Integer key : freq.keySet()) {
            if (freq.get(key) > maxFreq) {
                maxFreq = freq.get(key);
                maxKey = key;
            }
        }

        System.out.println("Element with highest frequency: " + maxKey + " (Frequency: " + maxFreq + ")");
    }

}
