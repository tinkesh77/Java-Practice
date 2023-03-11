import java.lang.reflect.Array;
import java.util.Scanner;

public class java38 {
    public static void main(String[] args) {
//        towSum ts = new towSum();
        int[] arr = {2,7,11,15};
//        ts.sum(arr,9);
        Scanner s = new Scanner(System.in);
        int f = s.nextInt();
        if (true||false){
            System.out.println("tes");
        }
        System.out.println(f);
//        System.out.println(ts.sum(arr,9)
    }
}
class towSum{
    @Override
    public String toString() {
        return "towSum{}";
    }

    public int[] sum(int[] num , int target){
        int left = 0;
        int right = num.length-1;
        while (left<=right)
        {
            if (num[left]+num[right]==target){
                return new int[] {left+1,right+1};
            }
            else if (num[left]+num[right]>target)
            {
                right--;
            }
            else
            {
                left++;
            }
        }
        return new int[] {left+1,right+1};
    }
}
