public class Java28 {
    public static void main(String[] args) {
        Meth m = new Meth();
        int arr[] = {9};
        System.out.println(m.plusOne(arr));
    }
}
class Meth{
    public int[] plusOne(int[] digits) {
        int sum =0;
        int[] ans = new int[digits.length];
        for(int i =0; i<digits.length; i++){
            sum = sum*10  + digits[i];
        }
        sum = sum + 1;
        int rem = 0;
        int k = digits.length;
       if (digits.length==1){
           int[] ans0 = new int[digits.length+1];
           for (int j = digits.length; j>=0; j--){
               rem = sum%10;
               ans0[k] = rem;
               sum = sum/10;
               k--;
           }
           return ans0;
       }
       else {
           for (int j = digits.length-1; j>=0; j--){
               rem = sum%10;
               ans[j] = rem;
               sum = sum/10;
           }
       }
        return ans;
    }
}
