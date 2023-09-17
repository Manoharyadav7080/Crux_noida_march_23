package Lec10;

public class Revarsal_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int k = 3;
		for(int i=0; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}
	public static void rotate(int arr[], int k) {
		int n =arr.length;
		k=k%n;
		
//		for n-k arr
		reverse(arr,0, n-k-1);
		
//		for k-1 arr
		reverse(arr,n-k, n-1);
//		all reverse arr
		reverse(arr,0, n-1);
	}
	public static void reverse(int[]arr ,int i , int j ) {
//		int i = 0;
//		int j = arr.length-1;
		while (i<j) {
			int temp = arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}

}
