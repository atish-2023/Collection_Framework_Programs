import java.util.TreeSet;

public class test11TreeSetDemo {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		ts.add(40);
		ts.add(60);
		ts.add(20);
		ts.add(30);
		ts.add(50);
		ts.add(10);

		System.out.println(ts);
		
		
		System.out.println("Higher than 30: " + ts.higher(30));  
        System.out.println("Lower than 30: " + ts.lower(30));
        
        System.out.println("Ceiling of 35: " + ts.ceiling(35)); 
        System.out.println("Floor of 35: " + ts.floor(35));
        
        System.out.println("HeadSet (less than 40): " + ts.headSet(40)); 
        System.out.println("TailSet (greater than or equal to 30): " + ts.tailSet(30)); 
        System.out.println("SubSet (20 to 50): " + ts.subSet(20, 50));
        
        System.out.println(ts);
        
        System.out.println("PollFirst: " + ts.pollFirst()); 
        System.out.println("PollLast: " + ts.pollLast());  
        System.out.println("TreeSet after poll: " + ts); 
        
        

		TreeSet ts1 = new TreeSet();

		ts1.add("kiran");
		ts1.add("akash");
		ts1.add("manoj");
		ts1.add("rahul");
		ts1.add("sakshi");

		System.out.println(ts1);
		
		 

		// properties
		
		// treeset is not index based data structure 
		// it not follow insertion order
		// it follow sorting order
		// we can't store null values in it

	}

}
