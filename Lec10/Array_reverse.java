package Lec10;

public class Array_reverse {
	public static void reverse(int arr[]) {
		int i=0;
		int j=arr.length-1;
		
		while (i<j) {
			int temp= arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
			
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {1,2,3,4,5,6};
		reverse( num);
		for(int i=0;i<num.length; i++) {
			System.out.print(num[i] + " ");
		}

	}

}
