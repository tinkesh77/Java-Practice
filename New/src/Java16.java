







abstract class A
{
    int i;
    abstract void display();
}
class B extends A
{
    int j;
    void display()
    {
        System.out.println(j);
    }
}
class Java16
{
    public static void main(String args[])
    {
        B obj = new B();
        obj.j=2;
        obj.display();
    }
}
//import java.sql.SQLOutput;
//
//public class Java16 {
//    public static void main(String[] args) {
//        test1 t1 = new test1();
//        System.out.println(t1.c);
//    }
//}
//class test{
//    int c =10;
//}
// class test1 extends test{
//
//}
//abstract class Tv{
//    void meth1(){
////        SQLOutput
//        System.out.println("I dont Konw");
//    }
//    abstract void meth2();
//    abstract  void meth3();
//}
//class Box extends Tv{
//    void meth2(){
//
//    }
//    void meth3(){
//
//
//    }}
//
