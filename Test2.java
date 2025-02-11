import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");

        ArrayList al2 = new ArrayList();
        al2.add("bbb");
        al2.add("ccc");
        al2.add("eee");

        System.out.println("Initial ArrayList al: " + al);
        System.out.println("Initial ArrayList al2: " + al2);

        System.out.println("Index of 'bbb': " + al.indexOf("bbb"));
        System.out.println("Index of 'zzz': " + al.indexOf("zzz"));

        al.add("aaa");
        System.out.println("Last index of 'aaa': " + al.lastIndexOf("aaa"));

        System.out.println("Element at index 2: " + al.get(2));

        al.set(1, "xxx");
        System.out.println("Updated ArrayList al after setting index 1 to 'xxx': " + al);

        al.retainAll(al2);
        System.out.println("ArrayList al after retainAll (common elements with al2): " + al);

        al.removeAll(al2);
        System.out.println("ArrayList al after removeAll (removes elements found in al2): " + al);
        System.out.println("ArrayList al2 remains unchanged: " + al2);

        al.clear();
        System.out.println("ArrayList al after clear(): " + al);
    }
}


//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


//  Output 

  /*
  
  Initial ArrayList al: [aaa, bbb, ccc]
Initial ArrayList al2: [bbb, ccc, eee]
Index of 'bbb': 1
Index of 'zzz': -1
Last index of 'aaa': 3
Element at index 2: ccc
Updated ArrayList al after setting index 1 to 'xxx': [aaa, xxx, ccc, aaa]
ArrayList al after retainAll (common elements with al2): [ccc]
ArrayList al after removeAll (removes elements found in al2): []
ArrayList al2 remains unchanged: [bbb, ccc, eee]
ArrayList al after clear(): []

  */
