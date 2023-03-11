import java.util.Arrays;

public class Java25 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            int  a = (int)Math.floor(Math.random()*10);
            arr[i] = a;
        }
        System.out.println(Arrays.toString(arr));
    }
}
class Javatest{

}

