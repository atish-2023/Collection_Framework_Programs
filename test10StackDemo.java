import java.util.Stack;

public class test10StackDemo {

	public static void main(String[] args) {
		
		
		Stack  s = new Stack();
		s.push("amit");
		s.push("vijay");
		s.push("kiran");
		s.push("rahul");
		s.push(100);
		s.push(20.3);
	
		System.out.println(s);
		
		System.out.println("remove top most element & also it return it : " + s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.search("amit"));  // start from 1
		
		

	}

}
