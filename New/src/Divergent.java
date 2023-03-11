import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Divergent {
    int a = 34;
    public static void main(String[] args) {
        ArrayList ist = new ArrayList();
        ist.add("1");
        ist.add(1);
        ist.add(3);
        ist.add(4);
        Set s = new HashSet(ist);
        System.out.println(s);

    }
}
