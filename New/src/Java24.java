public class Java24 {
    public static void main(String[] args) {
        //[[1,1,0],[1,0,1],[0,0,0]]
        int nums[] = {555,901,482,1771};

            yu u = new yu();

        System.out.println(u.Factorial(9));

    }
}
class yu{
    public int Factorial(int num){
        int sum = 1;
        for (int i =1; i<=num; i++){
            sum = i*sum;

        }
        return sum;
    }
    public int findNumbers(int[] nums) {

        int even = 0;
        for(int i=0; i<nums.length; i++){
            int count =0;
            while(nums[i]>0){
                nums[i] = nums[i]/10;
                count++;
            }
            if (count%2==0){
                even++;
            }
        }
        return even;
    }
}
class sub extends yu{
    sub(){
        super();
    }
}