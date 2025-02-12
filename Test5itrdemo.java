
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test5itrdemo {

	public static void main(String[] args) {
		
		
		List l = new ArrayList();
		
		l.add(0);
		l.add("deepak");
		l.add(1);
		
		System.out.println(l);
		
		
		System.out.println("by using iterator : ");

		Iterator itr = l.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
