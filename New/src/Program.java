import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        Progrsms.Progrma1();
        Progrsms.Progrma2();
        Progrsms.Program3();
        Progrsms.Program4();
        Progrsms.Progra5();
        Progrsms.Program6();
        Progrsms.Program7();
        Progrsms.Program8();
        Progrsms.Program9();
        Progrsms.Program10();
//            Progrsms.PrimeNunber();
//            Progrsms.Program11();
//        System.out.println(Arrays.toString( Progrsms.PrimeNunber()));
//        String str =  "t.ineks";
//        String ans;
//        for (int i = 0; i<=str.length(); i++){
//            char j = str.charAt(i);
//            if (){
//
////            }
//        }
//        System.out.println(str.charAt(0));
//        int arr[] = {2,3,1,2,3};
//        int n = 5;
//        int count = 0;
//        HashSet set = new HashSet();
//        for(int i = 0; i<=n-1; i++){
//            for(int j = 0; j<=n-1; j++){
//                if(arr[i]==arr[j]&&i != j) {
//                    set.add(arr[i]);
//                    count++;
//                }
//            }
//        }
//        ArrayList list = new ArrayList(set);
//        System.out.println(list);
//        Progrsms.Program11();
//         char s[] =  {'h' , 'e' , 'l' , 'l' ,'0'};
//         String str = "abc";
////         Progrsms.reverseString(s);
//          Progrsms.isPalindrome(str);
        int[] arr = {-1,-2,-3,-4};
        Progrsms.maxSubarraySum(arr);
    }
}
class Progrsms {
    public static void Progrma1() {
//        12345
//        *****
//        12345
//        *****
//        12345

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i % 2 != 0) System.out.print(j);
                else System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Progrma2() {
//        12345
//        22345
//        33345
//        44445
//        55555
        int q = 1;
        int e = 2;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i >= j) {
                    System.out.print(i);
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }

    public static void Program3() {
//        1
//        10
//        101
//        1010
//        10101
//        101010
//        1010101
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void Program4() {
//        1
//        01
//        101
//        0101
//        10101
//        010101
//        1010101
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void Progra5() {
//        1010101
//        101010
//        10101
//        1010
//        101
//        10
//        1
        for (int i = 7; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void Program6() {
//        1010101
//        010101
//        10101
//        0101
//        101
//        01
//        1
        for (int i = 7; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 != 0) {
                    if (j % 2 != 0) {
                        System.out.print("1");
                    } else {
                        System.out.print("0");
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print("0");
                    } else {
                        System.out.print("1");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void Program7() {
//        1
//        22
//        333
//        4444
//        55555
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void Program8() {
//        5
//        44
//        333
//        2222
//        11111
        int h = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(h);
            }
            h--;
            System.out.println();
        }
    }

    public static void Program9() {
//1
//23
//456
//78910
        int h = 1;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(h);
                h++;
            }
            System.out.println();
        }
    }

    public static void Program10() {
//        0
//        1 1
//        2 3 5
//        8 13 21 34
        int n1 = 1;
        int n2 = 1;
        for (int i = 1; i <= 4; i++) {
            int n3;
            for (int j = 1; j <= i; j++) {
                if (i == 1) {
                    System.out.print("0 ");
                }
                if (i == 2) {
                    System.out.print("1 ");
                } else if (i >= 3) {
                    n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                    System.out.print(n3 + " ");
                }
            }
            System.out.println();
        }
    }

    public static int[] PrimeNunber() {
        int primrArray[] = new int[15];
        int n = 43;
        int count = 0;
        int f = 0;
        for (int j = 1; j <= n; j++) {
            count = 0;
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    if (j == 1) {
                        count++;
                    }
                    count++;
                }
            }
            if (count == 2) {
                primrArray[f] = j;
                f++;
            }
        }
        return primrArray;
    }

    public static void Program11() {
        int k = 0;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println(PrimeNunber());
            }
            System.out.println();
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void reverseString(char[] s) {
        int j = 0; // 0
        int n = s.length - 1; //4

        while (j < n) {
            char temp = s[j];
            s[j] = s[n];
            s[n] = temp;
            j++;
            n--;
        }

    }

    static int isPalindrome(String S) {
        // code here ABCD
        StringBuilder string = new StringBuilder(S);
        int start = 0;
        int end = S.length() - 1;
        while (start < end) {
            if (S.charAt(start) != S.charAt(end)) {
                return 0;
            } else {
                start++;
                end--;
            }
        }
        return 1;
    }

    static long maxSubarraySum(int arr[]) {

        // Your code here
        long sum = 0;
        long maxSum = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            sum = sum + arr[i];
            if (sum > 0) {
                maxSum = sum;
            }
            if (maxSum<0){
                maxSum = -1;
            }
            if (sum < maxSum) {
                sum = 0;
            }
        }
        if (maxSum==0){
            maxSum = -1;
        }
        return maxSum;
    }
}