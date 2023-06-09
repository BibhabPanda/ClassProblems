package ClassProblems;

import java.util.*;

public class ChotaBhim {
	
	//Method 2
	static int sum = 0;
	static int counter = 60;
	static int index = 0;

	static void FindEditMax(double a[]) {
		double max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				index = i;
			}
		}
		if (counter > 0 && max > 1) {
			sum+=max;
			counter--;
			a[index] = Math.ceil(a[index]/2);
			FindEditMax(a);
		}
		else {
			sum+=counter;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Method 1
//		double a[] = { 2, 1, 7, 4, 2 };
//		int sum = 0;
//		int counter = 0;
//		while (counter != 2) {
//			Arrays.sort(a);
//			if(a[a.length - 1]!=1) {
//			sum+= a[a.length - 1];
//			a[a.length - 1] = Math.ceil(a[a.length - 1]/2);
//			counter++;
//			continue;
//			}
//			sum+=1;
//			counter++;
//		}
//		System.out.println(sum);

		double a[] = { 2, 1, 7, 4, 2 };
		FindEditMax(a);
		System.out.println(sum);
	}
}
