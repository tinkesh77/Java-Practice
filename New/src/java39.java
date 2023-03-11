import java.util.*;

public class java39 {
    public static void main(String[] args) {
//       int[] arr = {10,20000000,40,10000,1};
//        ArrayList<Integer> l = new ArrayList<>();
//        l.add(1);
//        l.add(2);
//        l.add(3);
//        l.add(4);
//        l.add(5);
//        int n = 5;
//        int k = 3;
//     Iterator s =   l.iterator();
//     while (s.hasNext())
//     {
//         if (n>k)
//         {
//             System.out.println(s.next());
//             String str = "tinkesh";
//             str.charAt(0);
//         }
//         else
//         {
//             System.out.println(s.next());
//         }
//     }
      int[] arr1 = {34,23,45,67,12,5};
         Solution23 s23 = new Solution23();
        Solution23.kthSmallest(arr1,3);

    }
}
class pair
{
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}

class Solution {

    //Function to reverse every sub-array group of size k.
 static  pair reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int num = k-1;
        for(int i =0; i<n; i++)
        {
            if(num>i)
            {
                arr.add(i);
            }
            else
            {
                arr.add(i);
            }
        }
        System.out.println(arr);
        return null;
    }
}
class programs
{


    public  static void mmax(int[] arr, int n )
    {
        int max = 0;
        while (arr.length>0)
        {
            for(int i =0; i<arr.length; i++)
            {
                if(max<arr[i])
                {
                    max = arr[i];
                }

            }

        }
        System.out.println(max);
    }
    public static void min(int[] arr ,int  n)
    {
        int min = arr[0];
        for (int i = 0; i< arr.length; i++)
        {
            if (min>arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println(min);

    }
    public static void Factorial(int n)
    {
        int sum = 1;
        int temp = n;
        for (int i = 1; i<n+1; i++)
        {
            sum = sum * i;
        }
        System.out.println(sum);
    }
    public static void Fabonic(int n)
    {
        int n1 = 1;
        int n2 = 1;
        int n3 = 0;
        int temp = 0;
        for (int i =0; i<n-2; i++)
        {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            temp = n3;
        }
        System.out.println(temp);
    }
    public static int Convert_Linked_listTo_array()
    {
        LinkedList lis = new LinkedList();
        int i =1;
        lis.add(i);
        i++;
        lis.add(i);
        i++;
        lis.add(i);
        i++;
        lis.add(i);
        i++;
        String f= "TINKE";
          f.toLowerCase(Locale.ROOT);
        System.out.println(f);

        lis.add(i);
        int ans[]  = new int[lis.size()];
        return 0;
    }
}

class Solution23 {
    @Override
    public String toString() {
        return "Solution23{}";
    }

    public static int kthSmallest(int[] arr, int k) {
        int ans[] = new int[arr.length];
        int min = arr[0];
        int h = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }

            }
        }
        return 6;
    }
}
