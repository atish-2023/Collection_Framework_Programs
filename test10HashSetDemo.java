import java.util.HashSet;
import java.util.Iterator;

public class test10HashSetDemo {
	public static void main(String args[]) {
		HashSet hs = new HashSet();

		hs.add(10);
		hs.add("atish");
		hs.add(100.4);
		hs.add("xyz");
		hs.add(null);
		hs.add(true);
		hs.add("atish");
		hs.add(null);

		System.out.println(hs);

//		HashSet hs1 = new HashSet(hs);

		HashSet hs1 = new HashSet();
		
		hs1.addAll(hs);
		hs1.add(20);
		hs1.add(10);
		hs1.add(50);
		hs1.add(5);

		System.out.println(hs1);

		Iterator itr = hs1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}
		
		System.out.println(hs1.contains("atish"));
		
		hs1.remove(10);
		System.out.println(hs1); // 10 will be removed

		System.out.println(hs1.isEmpty()); // Output: true or false

		System.out.println(hs1.size()); // Output: number of elements
		
		System.out.println("clone method");

		HashSet clonedSet = (HashSet) hs1.clone();
		System.out.println(clonedSet);
		
		System.out.println(hs1.containsAll(hs)); // Output: true or false
		
		System.out.println(hs1.hashCode());




		// properties

		// hashset does not follow insertion order

		// hashset does not store duplicate

		// hashset does not store multiple null values

		// hashset does not follow insertion and sorting order
		
		

	}

}
