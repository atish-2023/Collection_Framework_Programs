import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test6listitrdemo {

	public static void main(String args[]) {
		List l = new ArrayList();

		l.add(0);
		l.add("deepak");
		l.add(1);
		l.add("akshay");

		System.out.println(l);

		System.out.println("by using list iterator : ");

		ListIterator litr = l.listIterator();

		while (litr.hasNext()) {
			System.out.println(litr.next());
		}
		
		l.remove("deepak");
		System.out.println("after removing deepak :" + l);
		
		System.out.println("by using list iterator in backward direction  : ");

		ListIterator litr1 = l.listIterator();
		
		

		while (litr1.hasPrevious()) {
			System.out.println(litr1.previous());
		}
		
		litr1.add(100);
		System.out.println(l);
		
		l.set(1,5);
		System.out.println(l);
		
		System.out.println("using for loop in backward direction ");
		for(int i=l.size()-1; i>=0;i--)
		{
			System.out.println(l.get(i));
		}
	}

}
