package ClassProblems;
import java.util.Scanner;
public class TriangularArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n = sc.nextInt();
		
		//array input
		System.out.println("Enter the array");
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		for(int a[] : arr) {
			for(int b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				
				//top right sum
				if(i<=j) {
					sum1+=arr[i][j];
				}
				
				//bottom left
				if(i>=j) {
					sum2+=arr[i][j];
				}
				
				//top left
				if(n-i-1>=j) {
					sum3+=arr[i][j];
				}
				
				//bottom right
				if(n-i-1<=j) {
					sum4+=arr[i][j];
				}
			}
		}
		
		System.out.println("top right sum"+sum1);
		System.out.println("bottom left"+sum2);
		System.out.println("top left"+sum3);
		System.out.println("bottom right"+sum4);
	}

}
