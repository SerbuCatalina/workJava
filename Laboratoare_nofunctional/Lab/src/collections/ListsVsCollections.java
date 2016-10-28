package collections;

import java.awt.*;
import java.util.*;
import java.util.List;

public class ListsVsCollections {

    public static void main(String[] args){

        /* I LIST */
        /*ordered( => ndex based) , allow duplicates, null elements*/

        //1.ArrayList - most used, popular, dinamically resizing list, no thread-sase
        ArrayList pointsList = new ArrayList<String>();

        pointsList.add("l1");
        pointsList.add("l2");
        pointsList.add("l3");

        //2.LinkedList - doubly-linked list,no thread-sase
        List lnkLst = new LinkedList();
        lnkLst.add("element1");
        lnkLst.add("element2");
        lnkLst.add("element3");
        lnkLst.add("element4");

        //2.Vector - thread-safe
        Vector<String> vectorStrings = new Vector<String>();
        vectorStrings.add("vector1");
        vectorStrings.add("vector2");
        vectorStrings.add("vector3");

        displayAllLArrayist(lnkLst);
        displayAllLinkedList(pointsList);
        displayAllVector(vectorStrings);

        /*II SET */
        /*unordered collection type, no index based, do not allows duplicates, just one NULL elem*/

        //1.HashSet
        //no ordered,no duplicates, uses Hashmap internally key=element( => no duplicates)
        HashSet<String> hashSetStrings = new HashSet<String>();

        hashSetStrings.add("hashset1");
        hashSetStrings.add("hashset2");
        hashSetStrings.add("hashset3");

        displayAllHasSet(hashSetStrings);

        //2.LinkedHashSet
        //ordered
        LinkedHashSet<String> linkedHashSetStrings = new LinkedHashSet<String>();

        linkedHashSetStrings.add("linkedhashset1");
        linkedHashSetStrings.add("linkedhashset2");
        linkedHashSetStrings.add("linkedhashset3");

        displayAllLinkedHashSet(linkedHashSetStrings);




    }
    static void displayAllLArrayist(Collection col) {
        Iterator itr = col.iterator();
        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }
        System.out.println();
    }
    static void displayAllLinkedList(ArrayList col) {
        Iterator itr = col.iterator();
        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }


        System.out.println();
    }

    static void displayAllVector(Vector col) {
        Iterator itr = col.iterator();
        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }


        System.out.println();
    }

    static void displayAllHasSet(HashSet col) {
        Iterator itr = col.iterator();
        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }


        System.out.println();
    }

    static void displayAllLinkedHashSet(LinkedHashSet col) {
        Iterator itr = col.iterator();
        while (itr.hasNext()) {
            String str = (String) itr.next();
            System.out.print(str + " ");
        }


        System.out.println();
    }
}
