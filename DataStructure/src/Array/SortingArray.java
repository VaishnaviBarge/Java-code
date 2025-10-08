package Array;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,5,1,6,2,7};
		//Bubble Sort 
//		bubbleSort(arr);
//		selectionSort(arr);
		insertionSort(arr);
		
	}
	
	public static void bubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			boolean swap=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swap=true;
				}
				System.out.println("process array :"+ Arrays.toString(arr));
			}
			if(!swap) break;
		}
		System.out.println("sorted array :"+ Arrays.toString(arr));
	}
	
	public static void selectionSort(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n-1;i++) {
			int minIndex=i;			//min=0 j=1 j=2 j=3 j=4 j=5 j=6
			for(int j=i+1;j<n;j++) {	//2<3 Y min=3 1<2
				if(arr[j]<arr[minIndex]) {
					minIndex=j; //arr[3]
				}
			}
			System.out.println("process array :"+ Arrays.toString(arr));
			int temp=arr[minIndex];	//temp=1 , arr[i]=3
			arr[minIndex]=arr[i];		//{3,2,5,1,6,2,7}
			arr[i]=temp;
//			System.out.println("process array :"+ Arrays.toString(arr));
		}
		System.out.println("sorted array :"+ Arrays.toString(arr));
	}
	
	public static void insertionSort(int[] arr) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;				//{3,2,5,1,6,2,7}
				System.out.println("sorted array :"+ Arrays.toString(arr));
			}
			arr[j+1]=key;
//			System.out.println("sorted array :"+ Arrays.toString(arr));
		}
		System.out.println("sorted array :"+ Arrays.toString(arr));
	}
	
	

}
