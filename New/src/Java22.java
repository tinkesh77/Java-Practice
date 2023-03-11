public class Java22 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int nums[] = {1,2,1};
//        System.out.println(s.getConcatenation(nums).toSt?
    }
}
class Solution45 {
    public int[] getConcatenation(int[] nums) {
        int k = nums.length;
        int j = 0;
        int[] ans = new int[k*2];
        for(int i =0; i<nums.length*2; i++){
            if(i>=k){
                ans[i] = nums[j];
                j++;
            }
            else{
                ans[i] = nums[i];
            }
        }
        return ans;
    }
}
