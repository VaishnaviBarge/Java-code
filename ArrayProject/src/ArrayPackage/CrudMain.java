package ArrayPackage;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CrudMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr = {1, 2, 3, 4, 5};
		
		while (true) {
			System.out.println("\n\n--- Array Operations ---");
            System.out.println("1. Display");
            System.out.println("2. Update");
            System.out.println("3. Insert");
            System.out.println("4. Delete by Index");
            System.out.println("5. Delete by Value");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
            case 1:
            	System.out.print("Array: ");
                ArrayOperations.Display(arr);
                break;
            case 2:
            	int n=arr.length;
        		System.out.println("Enter index where to update element (0 to"+(n-1)+") : ");
        		int updateIndex=sc.nextInt();
        		System.out.println("Enter the updated Value :");
        		int newValue=sc.nextInt();
        		ArrayOperations.Update(arr, updateIndex, newValue);
        		break;
            case 3:
            	System.out.println("Enter the position to insert new element in Array :");
        		int pos=sc.nextInt();
        		System.out.println("Enter the value to insert :");
        		int valueToInsert=sc.nextInt();
        		arr=ArrayOperations.Insert(arr, pos, valueToInsert);
        		break;
            case 4:
            	System.out.println("Enter the index to delete(0 to"+(arr.length-1)+") : ");
        		int indexToDelete=sc.nextInt();
        		arr=ArrayOperations.DeleteByIndex(arr, indexToDelete);
        		break;
            case 5:
            	System.out.println("Enter the value to delete ( 0 to "+(arr.length-1)+") :");
        		int valueToDelete=sc.nextInt();
        		arr=ArrayOperations.DeleteByValue(arr, valueToDelete);
        		break;
            case 6:
                System.out.println("Exiting...");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice.");
            	
            }
		}
	
	}
}

