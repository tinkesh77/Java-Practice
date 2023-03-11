import java.util.ArrayList;
import java.util.List;

public class java42 {
    public static void main(String[] args) {
//        StarPattern.Simple(5);
//        StarPattern.UpperPrimid(5);
//        StarPattern.UpperPrimidDiff(5);
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6};
//        System.out.println(StarPattern.Super(8));
//        char a = 'a';
//        char b = 'b';
//        if (a<b){
//            System.out.println("Tinkeh");
        int[] arr = {2,3,4,7,11};
//        System.out.println(StarPattern.nextGreater(arr , 'c'));
         StarPattern.kth(arr);
//        }

    }
}
//class Solution {
//    public boolean isPerfectSquare(int num) {
//        long start = 1;
//        long end = num;
//        while(start <= end){
//            long mid = (start + end)/2;
//            if(mid * mid == num){
//                return true;
//            }
//            else if(mid * mid > num){
//                end = mid-1;
//            }
//            else{
//                start = mid+1;
//            }
//        }
//        return false;
//    }
//}
class StarPattern
{
public static void Simple(int n){
            for (int i = 1; i<=n; i++){
                for(int j = 1; j<=n; j++){
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    public static void UpperPrimid(int n){
        for (int i =n; i>=1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void UpperPrimidDiff(int n){
        for (int i =1; i<=n; i++){
            for(int j = i; j>=1; j--){
                System.out.print(j);
            }

            System.out.println();
        }
    }

    public static long VaildSquare(int num){
        long start = 1;
        long end = num;
       while (start<=end)
       {
           long mid = (start+end)/2;
           if (mid*mid==num)
           {
               return mid;
           }
           if (mid*mid<num)
           {
               start = mid + 1;
           }
           else
           {
               end = mid -1;
           }
       }
       return -1;
    }
    public static int Super(int n)
    {
        int row = 1;
        int count = 0;
        while (n>0)
        {
            if ('a'>'b')
            {
                n = n - row;
                row++;
                count++;
            }
            else {
                n--;
            }
        }
        return count;
    }
    public static char nextGreater(char[] letters , char target){
         char j = 0;
    for(int i =0; i<letters.length; i++){
            if(target<letters[i]){
                 j = letters[i];
                List list = new ArrayList();
                 return letters[i];
            }
        }
        return j;
    }
    public static void kth(int[] arr)
    {
        List list = new ArrayList();
        int j = 1;
        int i =0;
        while(0<=0){
            if(arr[i]==j)
            {

            }
            else
            {
                list.add(j);

            }

            j++;
        }
    }
}
