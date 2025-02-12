import java.util.Enumeration;
import java.util.Vector;

public class Test7enumerationdemo {

	public static void main(String[] args) {
		
		Vector v  = new Vector();
		v.add(1);
		v.add(2);
		v.add(3);
		
		System.out.println(v);
		
		System.out.println("using enumeration "); // it just only use for legacy classes it perform operation like read 
												 // we just only retrieve element at forward direction
		
		Enumeration e = v.elements();
		
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}

}
