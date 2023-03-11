import java.util.*;

public class Java29 {
    public static void main(String[] args) {
        ArrayList<Integer> ref = new ArrayList<>();
        int i[] = {10,'x',3};
        ArrayList f = new ArrayList();
        f.add(0,67);
        f.add("TInkesj");
        f.add('f');
        f.add(123);
        f.add(123);
        f.add(123);
        f.add(123);
        f.add(123);

        Set s = new HashSet();
                             s.add(2);
                             s.add(2);
                             s.add(3 );
                             s.add(2);s.add(2);
//        ListIterator ite1 = s.listIterator();
//                     while (ite1.hasNext()){
//                         System.out.println(ite1.next());
//                     }
                              Iterator itr = s.iterator();
                                          while(itr.hasNext()){
                                              System.out.println(itr.next());
                                          }                                           


    }
}
