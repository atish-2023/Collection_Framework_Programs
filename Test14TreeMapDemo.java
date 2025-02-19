import java.util.TreeMap;

public class Test14TreeMapDemo {

	public static void main(String[] args) {
		
		
		TreeMap trmp = new TreeMap();
		trmp.put(106,"deepak");
		trmp.put(103,"amit");
		trmp.put(107,"kamal");
		trmp.put(102,"deepesh");
		trmp.put(108,"rahul");
		trmp.put(101,"ravi");
		
		System.out.println(trmp);
		

		TreeMap trmp1 = new TreeMap();
		trmp1.put("deepak",106);
		trmp1.put("amit",103);
		trmp1.put("kamal",107);
		trmp1.put("deepesh",102);
		trmp1.put("rahul",108);
		trmp1.put("ravi",101);
		
		System.out.println(trmp1);
		
		System.out.println(trmp.ceilingEntry(102));
		System.out.println(trmp.ceilingEntry(104));
		
		System.out.println(trmp.ceilingKey(104));  // just only return key
		
		trmp1.clear();
		System.out.println(trmp1);
		
		System.out.println(trmp.firstEntry());
		
		System.out.println(trmp.floorEntry(104));
		
		System.out.println(trmp.get(103));
		
		System.out.println(trmp.headMap(103));
		
		System.out.println(trmp.higherEntry(103));
		
		System.out.println(trmp.keySet());
		
		System.out.println(trmp.values());
		
		System.out.println(trmp.pollFirstEntry());
		System.out.println(trmp.pollLastEntry());
		
		trmp.remove(102);
		
		System.out.println(trmp);
		
		trmp.replace(103, "atish");
		System.out.println(trmp);
		
		System.out.println(trmp.size());
		
		
		

	}

}
