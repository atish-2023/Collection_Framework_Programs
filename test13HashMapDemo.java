import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test13HashMapDemo {

	public static void main(String[] args) {
		
		
		HashMap<Integer,String> hMap = new HashMap();
		hMap.put(101, "atish");
		hMap.put(102, "rohit");
		hMap.put(103,"rajesh");
		hMap.put(104,"komal");
		hMap.put(107, "shraddha");
		hMap.put(105,"akash");
		hMap.put(106,"shruti");
		
		hMap.put(111, "kiran");
		hMap.put(108,null);
		hMap.put(109,null);
		hMap.put(null,null);
		hMap.put(null,null);
		
		
		System.out.println(hMap);
		
		Set s = hMap.entrySet();
		
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
//			System.out.println(itr.next());
			
			Map.Entry entr = (Map.Entry) itr.next();
			
			System.out.println(entr.getKey() + " -> " + entr.getValue());
		}
		
		System.out.println("in older version -------------------------------------- ^|");
		
		for(Map.Entry me : hMap.entrySet() )
		{
			System.out.println(me.getKey() + " -> " + me.getValue());
			
		}
		
		hMap.remove(102);
		System.out.println(hMap);
		
		System.out.println(hMap.containsKey(102));
		System.out.println(hMap.containsValue("atish"));
		
		System.out.println(hMap.get(104));
		
		System.out.println(hMap.replace(101,"kirthi"));
		System.out.println(hMap);
		
		System.out.println(hMap.size());
		
		System.out.println(hMap.keySet());
		
		System.out.println(hMap.values());
		
		System.out.println(hMap.isEmpty());



		
		
		//properties
		
		// not follow insertion order & sorting

	}

}
