package ClassProblems;

public class DeletionHeap {

	static void deleteRoot(int arr[],int n) {
		arr[0] = arr[arr.length-1];
		int a = arr.length-1;
		MaxHeap(arr, a);
	}
	
	static void MaxHeap(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				int max = arr[j];
				int k = 0;

				if ((2 * j + 1) < n) {
					if (max < arr[2 * j + 1]) {
						max = arr[2 * j + 1];
						k = 2 * j + 1;
					}
				}
				if ((2 * j + 2) < n) {
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
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {15,30,8,10,16,50,20,60};
		int n = arr.length;
		MaxHeap(arr,n);
		deleteRoot(arr,n);
		for(int i=0;i<n-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
