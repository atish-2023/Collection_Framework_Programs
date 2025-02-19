import java.util.HashMap;
import java.util.Map;

public class test12MapDemo {

	public static void main(String[] args) {
		
		Map mp = new HashMap();
		mp.put(101, "atish");
		mp.put(102, "kiran");
		mp.put(104, "manoj");
		mp.put(103, "akshay");
		
		mp.put(101, "vinod");
		mp.put(null, null);
		mp.put(null, null);
		
		
		System.out.println(mp);
		
		System.out.println(mp.containsKey("kiran"));  // false
		System.out.println(mp.containsKey(102));
		
		System.out.println(mp.containsValue("akshay"));
		
		
		System.out.println(mp.entrySet());
		
		System.out.println(mp.get(101));	
		
		mp.remove(103);
		System.out.println(mp);
		
		mp.replace(101, "ravi");
		System.out.println(mp);
		
		System.out.println(mp.size());
		
		
	}

}
