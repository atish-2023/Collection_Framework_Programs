import java.util.ArrayList;
import java.util.LinkedList;

public class test8LinkedListDemo {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		
		LinkedList ll = new LinkedList(al);
		
		ll.add(2);
		ll.add(4);
		ll.add(60);
		ll.add(0, 8);
		ll.add(2);
		ll.add(null);
		ll.add(null);
		ll.add("akshay");
		ll.add("vijay");
		
		System.out.println(ll);
		
		ll.addFirst(11);
		System.out.println(ll);
		
		ll.addLast(88);
		System.out.println(ll);
		
		
		System.out.println(ll.getFirst());
		
		
		System.out.println(ll.getLast());
		
		
		ll.removeFirst();
		System.out.println(ll);
		
		ll.removeLast();
		System.out.println(ll);
		
		}

}
