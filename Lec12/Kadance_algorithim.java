package Lec12;

import java.util.Scanner;

public class Kadance_algorithim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int arr[] = {-1,-1,-1,-1,-1};
		System.out.println( Maxsum(arr));

	}
	public static int Maxsum(int [] arr) {
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i<=arr.length; i++) {
			int sum=0;
			for(int j =i ; j<= arr.length-1; j++) {
				sum += arr[j];
				ans = Math.max(ans,sum);
				if(sum<0) {
					sum=0;
					
				}
				
				
			}
		}
		return ans;
	}

}
