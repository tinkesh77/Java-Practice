import java.awt.desktop.QuitEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GfGProgramsa {
    public static void main(String[] args) {
//         int[] arr = {4,2,-3,1,6};
//        Question.findsum(arr);
//        System.out.println(Question.factorial(5));
//        System.out.println(Question.String("a."));
//        Question.String("a.");
//        int[] s1 = {"ab", "c"};
//       int[] s2 = {"a", "bc"};
//        int[][] arr = {
//                {1,3},
//                {2,6},
//                {8,10},
//                {15,18}
//        };
//        String s1 = "geek";
//        String s2 = "kege";
//        Question.Anagram(s1 , s2);
        int[] arr = {1,2,3,3,4,6,7,8,9,9,9,9,9,9,10};
//        Question.String2(s1 , s2);
//        Question.merge(arr);
//        Question.sellStock(arr);
//        System.out.println(Question.getPairsCount(arr , 2));
//        System.out.println(Question.revrese(9115));
//        System.out.println(Question.minDist(arr , 10 , 10));
//        System.out.println(Arrays.toString(Question.searchRange(arr , 9)));
        String[] s = {"a" ,"bc"};
        String[] s1 = {"ab" ,"c"};
        Question.string(s, s1);
    }
}
class Question{
    static void string(String[] word1 , String[] word2){

         String wor1 = "";
        String wor2 = "";
        for(int i = 0; i<=word1.length-1; i++){
            wor1 = wor1 + word1[i];
        }
        for(int i = 0; i<=word2.length-1; i++){
            wor2 = wor2 + word2[i];
        }
        if (wor2.equals(wor1)){
            System.out.println("ej");
        }
        else {
            System.out.println("NO");
        }
    }
     static public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums == null || nums.length == 0) {
            return result;
        }
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        if (nums[left] != target) {
            return result;
        }
        result[0] = left;
        right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2 + 1;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid;
            }
        }
        result[1] = right;
        return result;
    }
    static int[] PeakIndes(int[]nums , int target){
        int start = 0;
        int end = nums.length-1;
        int[] result = {-1,-1};
        while (start<end){
            int mid = start + (end - start)/2;
            if (nums[mid]<target){
                start = mid + 1;
            }
            else {
                end = mid;
            }
//            if (start==arr[mid]){break;}
        }
        if (nums[start] != target) return result;
        result[0] = start;
        while (start<end){
            int mid = start + (end - start)/2+1;
            if (nums[mid]>target){
                end = mid - 1;
            }
            else {
               start  = mid;
            }
//            if (end==arr[mid]){break;}
        }
       result[1] = end;
        return result;
    }
  static   int minDist(int a[], int x, int y) {
        // code here
        int temp = 0 , temp1 = 0;
        for(int i = 0 ,  j = 0; i<a.length; i++, j++){

                if(a[i]==x){
                    temp = i;
                }
                if(a[i]==y){
                    temp1 = j;
                }

        }
      if(temp==0&&temp1==0) return -1;
        return temp1 - temp;
    }
    static int revrese(int n){
        for(int i = 0 ,  j = 0; i<n; i++, j++){

        }
        int temp = 0;
        int count = 0;
        while (n>0){
            int rem = n%10;
            if (rem ==0) {
                rem = 5;
                count++;
            }
            temp = temp*10 + rem;
            n = n/10;
        }
        return temp;
    }
   static int getPairsCount(int[] arr, int h) {
       int hh = 0;
        // code here
        for(int i = 0; i<=arr.length-1; i++){
            for (int j = i+1; j<= arr.length-1; j++){
                if((i != j)&&arr[i]+arr[j] ==  h){
                 hh++;
                }
            }
        }
        return hh;
    }
    public static void sellStock(int[] prices){
        int min = -999999;
        int sum = 0;
        for(int i = 0; i<=prices.length-1; i++){
            for(int j = i+1; j<prices.length; j++){
                sum = prices[j] - prices[i];
                if(sum>min){
                    min = sum;

                }
            }
        }
    }
    public static void Anagram(String word1 , String word2){
        int[] count = new int[26];

        int len1 = word1.length();
        int len2 = word2.length();

//        if (len1 != len2) {
//            return false;
//        }

        for (int i = 0; i < len1; i++) {
            count[word1.charAt(i) - 'a']++;
            count[word2.charAt(i) - 'a']--;
        }

        for (int i = 0; i <26; i++) {
            if (count[i] != 0) {
//                return false;
            }
        }
    }
   static public int[][] merge(int[][] intervals) {
       int temp = 0;
       int store = 0;
        for(int i = 0; i<= intervals.length-1; i++){
            if(i != 0){
                store = intervals[i][0];
            }
            if (temp>store){

            }
            for(int j = 0; j<=intervals[i].length-1; j++){
                temp = intervals[i][j];

            }
        }
        return intervals;
    }
    static void String2(String[] s1 , String[] s2){
      String s3 = "";
      String s4 = "";
      for (int i = 0; i<s1.length; i++){

 s3 = s3 + s1[i];
      }
        for (int i = 0; i<s2.length; i++){

            s4 = s4 + s1[i];
        }
        System.out.println(s3);
        System.out.println(s4);
        int[] alp = new int[26];
        for(int i = 0; i<= alp.length; i++){
        }
    }

    static boolean findsum(int arr[])
    {
        //Your code here
        long maxSum = Integer.MIN_VALUE, Sum
                = 0;

        for (int i = 0; i <arr.length; i++) {

            Sum = Sum + arr[i];

            if (maxSum < Sum){
                maxSum = Sum;
            }
            if(maxSum==0){
                return true;
            }
            if (Sum < 0){
                Sum = 0;
            }

        }
        return false;
    }
    static ArrayList<Integer> factorial(int N){
        //code here
        int j = 1;
        int i = 1;
        while(N-1>0){
            i = i + j*i;
            j++;
            N--;
        }
        ArrayList list = new ArrayList();
        list.add(i);
        return list;
    }
    static boolean String(String s) {
        String lowerCase = s.toLowerCase();
        String df = lowerCase.replaceAll(" +", "");
        String n = df.replaceAll(",", "");
        String n1 = n.replaceAll(":", "");
        String n2 = n1.replaceAll("\\.", "");
        System.out.println(n2);
        int le = n1.length() - 1;
        int st = 0;
while (st<le){
    if (n1.charAt(st) != n1.charAt(le)) return false;
    st++;
    le--;

}
        return true;
    }
    }

