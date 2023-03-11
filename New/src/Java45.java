import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java45 {
    public static void main(String[] args) {
        int[] num1 = {0,4,3,0,4};
        int[] num2 = {2};
//        System.out.println(Arrays.toString(  Solution46.nextGreatestLetter( num1 , num2 )));
//        System.out.println(Solution46.spicalArray(num1));
//        int ans[] = {5,7,7,8,8,10};
//        Solution46.binary( ans,8 );
//        ArrayList list = new ArrayList();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        list.add(40);
//        Integer ans[] = new Integer[4];
//         for (int i = 0; i<list.size(); i++){
//             ans[i] = (Integer) list.get(i);
//         }
//         for (int i = 0; i<ans.length; i++){
//             System.out.print(ans[i]);
//         }
        int a[] = {1 ,2 ,3 ,4 ,5};
        int b[] = {1,2,3};
//        System.out.println(a.length +" "+b.length);
//        System.out.println(Solution46.doUnion(a , b));
//        Solution46.rotate(a , 1);
        System.out.println(1%7);
        int Arr[] = {1 ,3 ,2, 3, 1};
        Solution46.sort012(Arr);
    }
}
class Solution46 {
    public static void sort012(int a[])
    {
        int h = 0;
//        int ans[] = new int[a.length];
        for(int i = 0; i<a.length; i++){
            for (int j = i+1; j<a.length; j++){
                if (a[i]>=a[j]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    public static int binary(int nums[],int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid =  start + (end - start) / 2;
            if(nums[mid] < target){
                start = mid + 1;
            }
            else if(nums[mid]>=target){
                end = mid - 1;
            }
        }
        return -1;
    }
//    public static void rotate(int[] nums, int k) {
//
//        int n = nums.length;
//        k = k%n;
//        revrese(nums , 0 , n-1);
//        revrese(nums , 0 , k-1);
//        revrese(nums , k , n-1);
//    }

//    private static void revrese(int[] nums, int i, int i1) {
//        for(int i = start , int  j = end; i<j; i++ , j--){
//            int temp = nums[i];
//            nums[i]  = nums[j];
//            nums[j] = temp;
//        }
//    }

    public static int doUnion(int a[],  int b[])
    {
        //Your code here
        int count  = 0;
        for(int  i =0; i<a.length; i++){
            for(int  j = 0; j<b.length; j++){
                if(a[i]==b[j]){
                    count++;
                }
            }
        }
        int temp  = (a.length + b.length) - count;
        return temp;
    }
    public static void rotate(int arr[])
    { int[] ans = new int[arr.length];
        for(int i = 0; i<arr.length-1; i++){
            if (i == 0) ans[i] = arr[arr.length -1];
           ans[i + 1] = arr[i];
        }
    }
    public static int spicalArray(int[] nums){
        int length = 0;
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>0){
                length++;
            }
        }
        if(length == 0) return -1;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>=length) count++;
        }
        return count;
    }
    public static int[] nextGreatestLetter(int[] num1 , int num2[]) {
       int count = 0;
       int sum = 0;
       for (int i = 0; i<num1.length; i++)
       {
           for (int j = 0; j< num2.length; j++)
           {
               if(num1[i]==num2[j])
               {
                   count++;
                   if(count==1)
                   {
                       int temp = num1[j];
                       if (temp == num1[i]) {
                           sum++;
                       }

                   }
               }
           }
           count = 0;
       }
       int ans[]  = new int[sum];
       int k = 0;
        for (int i = 0; i<num1.length; i++)
        {
            for (int j = 0; j< num2.length; j++)
            {
                if(num1[i]==num2[j])
                {
                    count++;
                    if(count==1)
                    {
                        ans[k] = num1[i];
                        sum++;
                        k++;
                    }
                }
            }
            count = 0;
        }
        return ans;
    }
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int num = k-1;
        int j = n-1;
        for(int i =num; i<0; i++)
        {

        }
        System.out.println(arr);

    }

}
