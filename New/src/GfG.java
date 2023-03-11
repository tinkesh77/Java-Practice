public class GfG {
    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        System.out.println(GeekforGeek.getMinDiff(arr , 5));
    }
}
class GeekforGeek{
   static   int getMinDiff(int[] arr, int k) {
        // code here
        arr[0] = arr[0] + k;
        arr[arr.length-1] = arr[arr.length-1] - k;
        return  arr[arr.length-1] - arr[0];
    }
}
