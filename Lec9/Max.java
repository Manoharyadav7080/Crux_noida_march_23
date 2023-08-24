package Lec9;


import java.util.Scanner;
public class Max {
	public static int Search(int arr[], int largest) {
		for(int i = 0; i<arr.length ; i++) {
			if (largest <= arr[i]) {
				largest = arr[i];
				
			}
		}
		return largest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,30,4,5};
		
		int largest = Integer.MIN_VALUE;
		int number = Search(arr,largest);
		System.out.println(number);
		
	
	}

}
