package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main (String args[]){
        //Non Generic ArrayList
        List arrayList1 = new ArrayList();
        arrayList1.add("String1");
        arrayList1.add(2);
        arrayList1.add(false);
        System.out.println(arrayList1);
        arrayList1.remove(0);
        System.out.println(arrayList1);

        //Non Generic ArrayList
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("String2");
        arrayList2.add(3);
        arrayList2.add(true);
        System.out.println(arrayList2);
        arrayList2.remove(0);
        System.out.println(arrayList2);

        //Generic ArrayList
        List<String> arrayList3 = new ArrayList();
        arrayList3.add("String3");
        arrayList3.add("3");
        arrayList3.add("true");
        System.out.println(arrayList3);
        arrayList3.remove(0);
        System.out.println(arrayList3);

        //Generic ArrayList
        ArrayList<String> arrayList4 = new ArrayList<String>();
        arrayList4.add("String3");
        arrayList4.add("3");
        arrayList4.add("true");
        System.out.println(arrayList4);
        arrayList3.remove(0);
        System.out.println(arrayList4);
    }
}
