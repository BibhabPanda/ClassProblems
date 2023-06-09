package ClassProblems;
import java.util.*;
public class StockPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the number of days");
//		int n = sc.nextInt();
//		int a[] = new int[n];
//		System.out.println("Enter the prices");
//		for(int i=0;i<n;i++) {
//			a[i] = sc.nextInt();
//		}
//		System.out.println("Enter the curr index");
//		int k = sc.nextInt();
//		
//		//maincode
//		int count = 0;
//		int j = a[k];
//
//		while(k>=0) {
//			if(k>=0 && a[k]<=j) {
//			count++;
//			}
//			k--;
//		}
//		System.out.println(count-1);
		Stack<Integer> s = new Stack<>();
		s.push(20);
		s.push(17);
		s.push(6);
		s.push(10);
		s.push(17);
		s.push(9);
		System.out.println(s);
		int curr = 4;
		int curr1 = s.get(curr);
		int i = s.size()-1;
		while(i>curr) {
			s.pop();
			i--;
		}
		System.out.println(s);
		int count = 0;
		while(s.peek()<=curr1) {
			s.pop();
			count++;
		}
		System.out.println(count-1);
	}

}
