package ClassProblems;

import java.util.Arrays;

public class MinKProduct {

//	static void Min(int a[],int k) {
//		Arrays.sort(a);
//		int product = 1;
//		for(int i=0;i<k;i++) {
//			product*=a[i];
//		}
//		System.out.println(product);
//	}
	
	
	static void Min(int a[],int k) {
		int product = 1;
		int min = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i]<min && a[i]>=0) {
				min = a[i];
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {5,4,3,2,1};
		int k = 5;
		//Min(a,k);
	}

}
