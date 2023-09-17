package Lec10;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {5, 3, 1, 4,2};
		SwapArr(arr);
		printArr(arr);
		
	
	}
	public static void SwapArr(int arr[]) {
		for (int i=0; i<=arr.length-2; i++) {
			for (int j=0; j<arr.length-i-1; j++) {
				if (arr[j]> arr[j+1] ) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	public static void printArr(int arr[]) {
		for(int i = 0; i<= arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}


