package schultz.university.linkedlist;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public int first() {
		return head.getElement();
	}
	
	public int last() {
		return tail.getElement();
	}
	
	public Node getHead() {
		return head;
	}
	
	public void addFirst(int element) {
		head = new Node(element, head);
		
		if(isEmpty())
			tail = head;
		
		size++;
	}
	
	public void addLast(int element) {
		Node newNode = new Node(element, null);
		
		if(isEmpty())
			head = newNode;
		
		else
			tail.setNext(newNode);
		
		tail = newNode;
		
		size++;
	}
	
	public int removeFirst() {
		if(isEmpty())
			return -1;
		
		int element = head.getElement();
		head = head.getNext();
		size--;
		
		if(isEmpty())
			tail = null;
		
		return element;
	}
	
	public String toString() {
		if(isEmpty())
			return "Linked list is empty!";
		
		String result = "";
		
		Node current = head;
		
		for(int i = 0; i < size - 1; i++) {
			result += current.getElement() + " -> ";
			
			current = current.getNext();
		}
		result += current.getElement();
		
		return result;
	}
}
