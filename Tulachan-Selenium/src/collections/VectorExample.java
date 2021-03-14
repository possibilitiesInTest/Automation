package collections;

import java.util.Vector;

public class VectorExample {
    public static void main (String args[]){
        // Create vector1
        Vector vector1 = new Vector();
        vector1.add("String2");
        vector1.add(false);
        vector1.add(false);
        System.out.println(vector1);
        System.out.println(vector1.size());
        vector1.remove(0);
        System.out.println(vector1);
        System.out.println(vector1.size());

        //

    }
}
