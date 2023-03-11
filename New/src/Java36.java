import java.util.HashSet;
import java.util.Set;

public class Java36 {
    public static void main(String[] args) {
        Ss s = new Ss();
        int[] arr = {1,2,3,4,4};
        System.out.println(s.containsDuplicate(arr));
    }
}
class Ss{
    public boolean containsDuplicate(int[] nums) {
        int count = nums.length;
        Set s= new HashSet();
        for (int i = 0; i<nums.length; i++){
            s.add(nums[i]);
        }
        if (count == s.size()) return true;
        else return false;
    }
}
