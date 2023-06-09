package ClassProblems;
import java.util.*;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	class mystack{
		int a[];
		int top;
		int capacity;
		public mystack(int capacity) {
			this.capacity=capacity;
			top=-1;
			a=new int[capacity];
			
		}
		public void push(int x) {
			if(top==capacity-1) {
				System.out.println("stack bhar gaya");
				return;
			}
			else {
				top++;
				a[top]=x;
			}
		}
		public int pop() {
			if(top==-1) {
				System.out.println("stack khali hai");
				return 0;
			}
			else {
				int x=a[top];
				top--;
				return x;
			}
					
		}
		public void display() {
			if(top==-1) {
				System.out.println("stack is empty");
			}
			else {
				
			}
		}
	}

}
