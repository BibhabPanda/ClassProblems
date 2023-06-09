package ClassProblems;

import java.util.Scanner;

public class MaxHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,30,8,10,16,50,20,60};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <= i; j++) {
//				if(arr[2*j+1]>arr[j]) {
//					int temp = arr[j];
//					arr[j] = arr[2*j+1];
//					arr[2*j+1] = temp;
//				}
//				else if(arr[2*j+2]>arr[j]) {
//					int temp = arr[j];
//					arr[j] = arr[2*j+2];
//					arr[2*j+2] = temp;
//				}

				int max = arr[j];
				int k = 0;

				if ((2 * j + 1) < arr.length) {
					if (max < arr[2 * j + 1]) {
						max = arr[2 * j + 1];
						k = 2 * j + 1;
					}
				}
				if ((2 * j + 2) < arr.length) {
					if (max < arr[2 * j + 2]) {
						max = arr[2 * j + 2];
						k = 2 * j + 2;
					}
				}
				if (max != arr[j]) {
					int temp = arr[j];
					arr[j] = arr[k];
					arr[k] = temp;
				}

			}

		}
		for (int b : arr) {
			System.out.print(b + " ");
		}
	}
}
