public class Java19 {
    public static void main(String[] args) {
//        double num[] = {5.5,10.1,11,12,8,56.9,2.5};
//        double result;
//        result =0;
//        for (int i =0; i<6; ++i){
//            result = result + num[i];
//            System.out.println(result/16);
//        int a ,b,c;
//        a = 20/0;
//        b = 0/2;
//        c = 0/0;
//        System.out.println(a);
//        System.out.println(b+"  "+c);

//        double r,pi,a;
//        r = 9.8;
//        pi = 3.14;
//        a = pi*r*r;
//        System.out.println(a);
//             String name = "hello i love Java";
//        System.out.println(name.indexOf('e'));

        StringBuffer c= new StringBuffer("Hello");
        c.delete(0,2);
        System.out.println(c);
        char [] a = new char[10];
         for (int i = 0; i<10; ++i){
             a[i] = 'i';
             System.out.println(a[i]);
         }
    }

}