package ClassProblems;
import java.util.*;
public class SlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque <Integer> q = new ArrayDeque<>();
		q.add(11);
		q.add(2);
		q.add(75);
		q.add(92);
		q.add(59);
		q.add(90);
		q.add(55);
		int k = 3;
		System.out.println(q);
		
		//main code
		ArrayDeque <Integer> q1 = new ArrayDeque<>();
		int pointer = 0;
		while(pointer<=q.size()-k-1) {
			int max=0;
			for(int i=0;i<k;i++) {
				if(q.peek()>=max) {
					max = q.peek();
				}
			}
			q.remove();
			System.out.print(max+",");
		}
	}

}
