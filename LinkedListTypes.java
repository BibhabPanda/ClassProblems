package ClassProblems;

 class LinkedListTypes {
	Node head;
	public class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			return;
		}
		Node curr = head;
		while(curr.next!=null) {
			curr = curr.next;
		}
		curr.next = newNode;
	}
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		head = head.next;
	}
	
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		if(head.next==null) {
			head=null;
			return;
		}
		Node LastNode = head.next;
		Node SecondLast = head;
		while(LastNode.next!=null) {
			LastNode = LastNode.next;
			SecondLast = SecondLast.next;
		}
		SecondLast.next = null;
	}
	
	public void printList() {
		if(head==null) {
			System.out.println("List is empty");
		}
		Node curr = head;
		while(curr!=null) {
			System.out.print(curr.data+"->");
			curr = curr.next;
		}
		System.out.println("null");
	}
	
	public void ReverseList() {
		Node a = head;
		Node b = head.next;
		Node c = head.next.next;
		a.next=null;
		while(c.next!=null) {
			b.next=a;
			a=b;
			b=c;
			c=c.next;
		}
		b.next=a;
		c.next=b;
		head = c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListTypes ll = new LinkedListTypes();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.printList();
		
	}

}
