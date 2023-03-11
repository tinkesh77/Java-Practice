public class Java23 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[]as = {2,5,1,3,4,7};
        s.shuffle(as,3);
    }
}
class Solution1 {
    public int[] shuffle(int[] nums, int n) {

        int ans[] = new int[nums.length];
        for(int i =0; i<nums.length; i++){
           if (i%2==0)
               ans[i] = nums[i/2];
           else
               ans[i] = nums[n +i/2];
        }
        return ans;
    }
}
