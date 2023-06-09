package ClassProblems;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> LL = new LinkedList<Integer>();
		LL.addFirst(4);
		LL.addLast(2);
		LL.addLast(1);
		LL.addLast(3);
		System.out.println(LL);
		LL.sort(null);
		System.out.println(LL);
		
		//reverse list
		for(int i=0;i<LL.size();i++) {
			LL.addFirst(LL.get(i));
			LL.remove(i+1);
		}
		System.out.println(LL);
		
		//bubble sort
		for(int i=LL.size()-1;i>=0;i--) {
			for(int j=0;j<LL.size()-1;j++) {
				if(LL.get(j)>LL.get(j+1)) {
					int x = LL.get(j);
					LL.set(j, LL.get(j+1));
					LL.set(j+1,x);
				}
			}
		}
		System.out.println(LL);
		
		
		for(int i=0;i<LL.size();i++) {
			
		}
	}

}
 