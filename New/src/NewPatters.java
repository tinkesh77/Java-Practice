public class NewPatters {
    public static void main(String[] args) {
//Pattern.question1();
        Pattern.question2();
    }
}
class Pattern{
    String h = "Tinkesj";

    static void question2(){
        for (int i = 1; i<=5; i++){
            for (int j = i; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void question1(){
        int n = 5;
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=n; j++){
                System.out.print(j);
            }
            n--;
            System.out.println();
        }
    }
}
