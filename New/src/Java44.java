public class Java44 {
    public static void main(String[] args) {
           Patrren.Pattern1(5);
    }
}
class Patrren{
    static void Pattern1(int n)
    {
//        for (int i = 5; i>=1; i--){
//            for (int j = 5; j>=i; j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        for (int i = 6; i>=1; i--){
//            for (int j = i; j<=6; j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        int g = 5;
//        int k = 2;
//        for (int i =1; i<=5; i++){
//            int temp = k;
//            for (int j = 1; j<=5; j++){
//                System.out.print(k);
//                k++;
//            }
//            System.out.println();
//            k = temp;
//            k++;
//        }
        for (int i =1; i<=5; i++){
            for (int j = 1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

