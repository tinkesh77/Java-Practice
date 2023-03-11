import java.util.*;

public class Java31
{
    public static void main(String[] args) {
        List li = new ArrayList();
        li.add(10);
        li.add("Tinkesh");
        li.add("Br");
        li.add("c");
        li.add("Hello World");
        ListIterator ls = li.listIterator();
//        Iterator itr = li.iterator();
//        while(ls.hasNext())
//        {
//            System.out.println(ls.next());
//        }
//        System.out.println("++++++++++++++++++++++++++=");
//        while(ls.hasPrevious())
//        {
//            System.out.println(ls.previous());
//        }
        Vector v= new Vector();
        v.add(100);
        v.add(100);
        v.add(100);
        v.add(100);
        Enumeration e= v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
//        System.out.println(v);
    }
}

