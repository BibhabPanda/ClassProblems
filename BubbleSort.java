package ClassProblems;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {43,21,76,12,63,90,11};
		for(int i=arr.length-2;i>=0;i--) {
			for(int j=0;j<=i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int b : arr) {
			System.out.print(b+" ");
		}
	}

}
