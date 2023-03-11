public class Java12 {
    public static void main(String[] args) {

        System.out.println("Maon");
honda h1 = new honda();

    }
    static {
        System.out.println("Hello without 1interfiting");
    }
    static {
        System.out.println("Hello without 2interfiting");
    }
}
class honda{
  static int a =10;

  int b = 20;

  void meth1(){
      System.out.println(a+" "+b);
  }

   static void meth2    (){
        System.out.println(a);
    }
    static {
        System.out.println("Hello without 3interfiting");
    }
}
