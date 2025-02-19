import java.util.Vector;

public class test9VectorDemo {

	public static void main(String[] args) {
		
		
//		Vector v = new Vector();  //initial capacity 10
		
		Vector v = new Vector();
		v.add("deepak");  // collection method
		v.add(1,"rahul");   // list method
		v.addElement("manoj"); // vector method
		v.addElement("deepak");
		v.addElement(null);;
		v.addElement(null);
		v.add(100);
		v.add(10.2);
		v.add('g');
		
		
		
		
		
		System.out.println(v);
		
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		System.out.println(v.removeElement("deepak"));
		System.out.println(v);
		
		v.removeElementAt(3);
		System.out.println(v);
		
		System.out.println(v.capacity());
		
		v.setElementAt("kiran", 2);
		System.out.println(v);
		
		v.removeAllElements();
		System.out.println(v);
	}

}
