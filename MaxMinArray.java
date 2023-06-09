package ClassProblems;
import java.util.Scanner;
public class MaxMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5,6,7};
		
		//reverse code
		for(int i=0;i<arr.length/2;i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		}
		
		//main code
		int j = arr[arr.length-1];
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i];
			arr[i]=j;
			j=temp;
		}
		
		for(int b : arr) {
			System.out.print(b+" ");
		}
	}
}
