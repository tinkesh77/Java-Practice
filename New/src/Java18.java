
public class Java18 {
    public static void main(String[] args) {
        Wild w = new Wild(2);
         int c =8;
        System.out.println(++c*3+" "+c);
        String f = "Tinkesh";
        System.out.println(f.length());

    }
}
class Animal{
    Animal(){
        System.out.println("Animal");
    }
  static private int f = 90;
}
class Wild{
    long v = (byte)100;
    byte c = (byte)100l;
    Wild(double c){
        super();
        System.out.println("Wild");
        System.out.println(c);
    }
}