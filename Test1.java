import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add("Atish");
        al.add('c');

        System.out.println("Initial ArrayList al: " + al);
        System.out.println("Adding 'ppp': " + al.add("ppp"));
        System.out.println("Updated ArrayList al: " + al);

        System.out.println("Does al contain 500? " + al.contains(500));

        ArrayList al2 = new ArrayList();
        al2.add("aaa");
        al2.add("bbb");
        al2.add("ccc");

        System.out.println("ArrayList al2: " + al2);
        System.out.println("Does al contain all elements of al2? " + al.containsAll(al2));

        al.addAll(al2);
        System.out.println("ArrayList al after adding al2: " + al);

        System.out.println("Is al empty? " + al.isEmpty());
        System.out.println("Size of al2: " + al2.size());

        // al.remove(100);  // This would cause an exception (IndexOutOfBoundsException)
        al.remove(0); // Correct way to remove by index
        System.out.println("ArrayList al after removing element at index 0: " + al);

        al2.remove("bbb"); // Correct way to remove by value
        System.out.println("ArrayList al2 after removing 'bbb': " + al2);
    }
}





//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx


  // Output
/*
Initial ArrayList al: [10, Atish, c]
Adding 'ppp': true
Updated ArrayList al: [10, Atish, c, ppp]
Does al contain 500? false
ArrayList al2: [aaa, bbb, ccc]
Does al contain all elements of al2? false
ArrayList al after adding al2: [10, Atish, c, ppp, aaa, bbb, ccc]
Is al empty? false
Size of al2: 3
ArrayList al after removing element at index 0: [Atish, c, ppp, aaa, bbb, ccc]
ArrayList al2 after removing 'bbb': [aaa, ccc]

  */

