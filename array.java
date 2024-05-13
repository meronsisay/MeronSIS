package package1;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		static void search(int[] arr, int search){// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a sequence number ");
		System.out.println("enter a number to search ");
		for(int element: arr) {
			if(element!=search) {
				System.out.println("not found");
			}
			else {
				System.out.println("array[i]");
			}
		}
		
      
	}

}
