import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test3listdemo {

	public static void main(String[] args) {

		List l = new ArrayList();
		// l.add(1,3); // it gives exception indexoutofbound in a list it follow index
		// based structure

		l.add(0, 10);
		l.add(1, 11);
		l.add(3);

		l.add(5);
		l.add(null);
		l.add(3);
		l.add(null);

		System.out.println(l);

		System.out.println("by using iterator : ");

		Iterator itr = l.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("by using list iterator : ");

		ListIterator litr = l.listIterator(l.size());

		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
		

	}

}
