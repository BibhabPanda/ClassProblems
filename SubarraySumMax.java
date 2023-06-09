package ClassProblems;
import java.util.Scanner;
public class SubarraySumMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		
		//array input
		System.out.println("Enter the array");
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		//main code
		int maxFar = 0;
		int maxEnd=0;
		for(int i=0;i<n;i++) {
			maxEnd+=arr[i];
			if(maxEnd<0) {
				maxEnd=0;
			}
			if(maxFar<maxEnd) {
				maxFar = maxEnd;
			}
		}
		System.out.println("Max sum is "+maxFar);
	}

}
