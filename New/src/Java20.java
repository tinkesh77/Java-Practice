public class Java20 {
    public static void main(String[] args) {
//        try{
//            System.out.println(10/0);
//        }
//        catch (ArithmeticException e){
//            String tinkesh = "Tinkesh";
//            System.out.println(tinkesh.charAt(29));
//        }
//        finally {
//            int[] a = {1,2,3,4};
//            System.out.println(a[10]);
//        }
        try{
            int i;

        }
        catch (ArithmeticException e){
            System.out.println("Catah Block");
        }
        finally {
            System.out.println("Finallly");
        }
    }
}