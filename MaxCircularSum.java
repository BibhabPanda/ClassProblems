package ClassProblems;

public class MaxCircularSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		int maxsum=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int k=0;k<arr.length;k++) {
				sum+=arr[k]*(k+1);
			}
			if(maxsum<sum) {
				maxsum=sum;
			}
			
			for(int b : arr) {
				System.out.print(b+" ");
			}
			System.out.println(" "+sum);
			sum=0;
			int temp=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
			
		}
		System.out.println("\nMaximum sum is "+maxsum);
	}

}
