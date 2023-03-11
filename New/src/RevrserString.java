import java.util.Arrays;

public class RevrserString {
//    System.out.println(super.a);
public static void main(String[] args) {
    try {
        int i=9/0;
        System.out.println(i);
        return;
    } catch (Exception e) {
        System.out.println("exception caught");
        return;
    }
//    System.out.println("task completed");

}
}
abstract class parent{
   int sw;
private void ss(){

}

   abstract public void mry1();

}
interface test24{
    int a = 0;
    default void meth2(){

    }
    private void ss(){

    }
}
interface test23 extends test24{
    int a = 0;
   default void meth2(){

   }
    private void ss(){

    }
}
class Questions45 extends parent{
    public void mry1(){
        System.out.println("Parent");
    }
    int a = 0;


     static void StringResvres(){

        String str = "DivergentClasses";
        char[] temparray = str.toCharArray();
        System.out.println(Arrays.toString(temparray));
        int i = str.length()-1;
        String re = "";
        while(i>=0){
          re = re + str.charAt(i);
          i--;
        }
        System.out.println(re);
    }
}