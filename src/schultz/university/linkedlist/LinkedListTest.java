package schultz.university.linkedlist;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		
		System.out.println(list);
		
		list.removeFirst();
		
		System.out.println(list);
		
		list.removeFirst();
		
		System.out.println(list);
		
		list.removeFirst();
		
		System.out.println(list);

	}

}
