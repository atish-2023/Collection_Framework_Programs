import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class Test4setdemo {

	public static void main(String[] args) {

		Set s = new HashSet();
		s.add(100);
		s.add(110);
		s.add(120);
		s.add(110);

		s.add(null);
		s.add(null);

		// in set it does not allow to store dupllicate elements
		// it also don't allow to store null values

		System.out.println(s);

		System.out.println("using iterator : ");

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// there is no method of listiterator in set
		

	}

}
