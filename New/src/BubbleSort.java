import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {9,8,6,0,1,6,5,9,3};
//        int j = 1;
//        int l = 0;
//        int k = 0;
//        while(l<=arr.length-1){
//            for (int i = 0; i <= (arr.length-2)-k; i++) {
//                if (arr[i] > arr[j]) {
    //                    int temp = arr[i];
    //                    arr[i] = arr[j];
    //                    arr[j] = temp;
//                }
//                j++;
//            }
//            k++;
//            j = 1;
//            l++;
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(Questions44.SelectionSort()));
//        int[] arr= {2,2,1,1,1,1,1,1,1,1,1,2,2,2,2};
//        Questions44.mj(arr);
        LinkedList l = new LinkedList();
        l.add("f");
        System.out.println(l);
        ArrayList list = new ArrayList();
        Set se = new HashSet();

        Set<Integer> seen = new HashSet<>();
    }
}
class Questions44 {
    public static void mj(int[] nums) {

        int max = 0;
        int Duplicate = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            int count = 0;
            for (int j = 0; j <= nums.length - 1; j++) {
                if (nums[i] == nums[j] && i != j) {
                    count++;
                }
                if (max < +count) {
                    max = count;
                    Duplicate = nums[i];
                }
            }
        }
        System.out.println(max);
        System.out.println(Duplicate);
//        public static int[] SelectionSort () {
//            int[] arr = {9, 8, 6, 0, 1, 6, 5, 9, 3};
//            int j = 1;
//            int l = 0;
//            int k = 0;
//            int n = arr.length - 1;
//            while (n > 0) {
//                for (int i = 0; i <= (arr.length - 1) - k; i++) {
//                    if (max < arr[i]) {
//                        max = arr[i];
//                        max = l;
//                    }
//                }
//
//                int temp = arr[n];
//                arr[n] = arr[l];
//                arr[l] = temp;
//
//                max = 0;
//                n--;
//                k++;
//                j = 1;
//                l++;
//            }
//
//        }
//    }
    }
}
