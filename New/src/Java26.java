public class Java26 {
    public static void main(String[] args) {
        Solution2 s2 = new Solution2();
        System.out.println(s2.mySqrt(81));
    }
}
class Solution2 {
    public int mySqrt(int x) {
        int l = 1;
        int r = x;

        while(l <= r){
            int mid = (l + r) / 2;

            if(x / mid == mid){
                return mid;
            } else if(mid > x / mid){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return r;
    }
}
