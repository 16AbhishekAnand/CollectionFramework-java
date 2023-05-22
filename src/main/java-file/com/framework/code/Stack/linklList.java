import java.util.LinkedList;
//import java.util.*;
import java.util.ListIterator;

import javax.naming.LinkLoopException;
import javax.swing.text.html.HTMLDocument.Iterator;

public class linklList {
    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        System.out.println("intail size "+ll);
        
        ll.push("454");
        ll.push("453");
        ll.push("452");
        ll.push("451");
        ll.push("450"); // at 0th index.
        ll.add(5,"560");
        System.out.println(ll);
        
        System.out.println("*** Traversal through iterator");
            java.util.Iterator itr = ll.iterator();
                //System.out.println(itr);
        while(itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println("*****pop the element in queue*******\n");
        ll.pop();ll.pop();
        System.out.println(ll);
        System.out.println("**** Traversal through listIterator****\n");
        ListIterator itl = ll.listIterator();
        while(itl.hasNext()) {
            System.out.println(itl.next());
        }
        System.out.println("*** Traversing in opposite direction***\n");
        while(itl.hasPrevious()) {
            System.out.println(itl.previous());
        }
        System.out.println("*****linklist as Dequeue*****");
        LinkedList lq = new LinkedList<>(ll);
        lq.add("one"); lq.add("two");lq.add("three");
        System.out.println(lq);    
        lq.addFirst("number 1st");
        lq.addLast("number last");
        System.out.println(lq);
        System.out.println("linklist as stack");
        LinkedList ls = new LinkedList();
        ls.push(7);ls.push(71);ls.push(17);ls.push(70);
        System.out.println(ls);
        ls.pop();ls.pop();
        System.out.println(ls);

    }
}
