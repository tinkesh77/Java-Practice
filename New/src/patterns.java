public class patterns {
    public static void main(String[] args) throws InterruptedException {
//        questions.ouestion1();
//        questions.question2();
//        questions.question3();
//        questions.question4();
//        questions.question5();
//        questions.question6();
//        questions.question7();
//        questions.question8();
//        questions.question9();
//        questions.question10();
//        questions.question11();
//        questions.question12();
//        questions.question13();
//        questions.question14();
//        questions.question15();
//        int[] arrr = {1,1,3,3,4,4,6,6,7};
//        System.out.println(questions.singleNonDuplicate(arrr));
//        questions.question16();
//        questions.question17();
//        questions.question18();
//        questions.question19();
//        System.out.println(questions.armstrongNumber(153));
//        for(int i = 0; i<=5; i++){
////            Thread.sleep();
//            System.out.println(i);
//        }
//        questions.question21();
//        questions.question22();
//        questions.question22();

    }
}
class questions{
    static void question23(){
        int n = 144;

    }
    static void question22(){
        int rem = 0 ,sum = 0;
        int n = 123;
        int temp = n;
        while (n>0)
        {
            rem = n%10;
            sum = sum*10 + rem;
            n = n/10;
        }
        if (temp==sum) System.out.println("Palindrom");
        else System.out.println("Not Pailndrom");
    }
    static void question21(){
        int j = 1;
        int count = 0;
        int  i = 1;
        while (i<=100){
           for ( j = 1; j<=i; j++){
               if (i%j==0){
                   count++;
               }
           }
           j=1;
            if (count==2) System.out.println("Number is Primne ");
            else System.out.println("Not Prime");
         i++;
        }
    }
    static String armstrongNumber(int n){
        // code here
        int rem = 0 , sum = 0 , temp = n;
        while(n>0){
            rem = n%10;
            sum = sum + rem*rem*rem;
            n = n/10;
        }
        if(sum==n) {return "Yes";}
        else return "No";
    }
    static public void question19(){
//        54321
//        54322
//        54333
//        54444
//        55555
        for (int i = 1; i<=5; i++){
            for (int j = 5; j>=1; j--){
                if (j<=i) System.out.print(i);
                else  System.out.print(j);
            }

            System.out.println();
        }
    }
    static public void question18(){
//        12345
//        22345
//        33345
//        44445
//        55555
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=5; j++){
                if (j<=i) System.out.print(i);
                else  System.out.print(j);
            }

            System.out.println();
        }
    }
//            55555
//            44445
//            33345
//            22345
//            12345
    static public void question17(){
        for (int i = 5; i>=1; i--){
            for (int j = 1; j<=5; j++){
                if (j<=i) System.out.print(i);
                 else  System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void question16()
    {

        int n = 5, i, j, num = 1, gap;

        gap = n - 1;

        for ( j = 1 ; j <= n ; j++ )
        {
            num = j;
            for ( i = 1 ; i <= gap ; i++ )
                System.out.print(" ");

            gap --;

            for ( i = 1 ; i <= j ; i++ )
            {
                System.out.print(num);
                num++;
            }
            num--;
            num--;
            for ( i = 1 ; i < j ; i++)
            {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
    }
   static public int singleNonDuplicate(int[] nums) {

        int left = 0, right = nums.length-1;
        while(left < right){
            int mid = (left + right)/2;
            if( (mid % 2 == 0 && nums[mid] == nums[mid +1]) || (mid %2 == 1 && nums[mid] == nums[mid - 1]) )
                left = mid + 1;
            else
                right = mid;
        }
        return nums[left];
    }
    static void question15(){
//  1 2 3 4 5 6 7 8 9
//   1 2 3 4 5 6 7
//    1 2 3 4 5
//     1 2 3
//       1
        int line = 9;
        int l = 5;
        for (int i = line; i>=0; i--){
            if (i%2 != 0){
                for (int k = 1; k<=i; k++){
                    System.out.print(l+" ");
                }
            }
            else {
                l--;
                System.out.println();
            }
            for (int j = line-i; j>=0; j--){
                System.out.print(" ");
            }
        }
    }
    static void question14(){

//         1
//       2 2 2
//      3 3 3 3 3
//     4 4 4 4 4 4 4
//    5 5 5 5 5 5 5 5 5
        int line = 9;
        int l;
        for (int i = 1; i<=line; i++){
            l = i;
            for (int j = line-i; j>=0; j--){
                System.out.print(" ");
            }
            if (i%2 != 0){
                for (int k = 1; k<=i; k++){
                    System.out.print(l+" ");
                }
            }
            else {
                l++;
                System.out.println();
            }
        }
    }
    static void question13(){

        int line = 9;
        int l , l1= 1;
        for (int i = 1; i<=line; i++){
            l = l1;
            for (int j = line-i; j>=0; j--){
                System.out.print(" ");
            }
            if (i%2 != 0){
                for (int k = 1; k<=i; k++){
                    System.out.print(l+" ");
                    l++;
                }
            }
           else {
                System.out.println();
            }
             l = l -2;
           l1++;
        }
    }
    static void question12(){
        int i, j, row = 6;
//Outer loop work for rows
        for (i=0; i<row; i++)
        {
//inner loop work for space
            for (j=row-i; j>1; j--)
            {
//prints space between two stars
                System.out.print(" ");
            }
//inner loop for columns
            for (j=0; j<=i; j++ )
            {
//prints star
                System.out.print("* ");
            }
//throws the cursor in a new line after printing each line
            System.out.println();
        }
    }
    static void question11(){
//        11111
//        12345
//        33333
//        12345
//        55555
        for (int i = 1; i<=5; i++){
            for (int j =1; j<=5; j++){
                if (i%2==0){
                    System.out.print(j);
                }
                else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
    static void question10(){
//        1 2 3 4 5
//        1 2 3 4 5
//        3 6 9 12 15
//        2 4 6 8 10
//        5 10 15 20 25
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=5; j++){
                if (i==1||i==2) System.out.print(j+" ");
                else {
                    if (i==3)System.out.print(j*3+" ");
                    if (i==4) System.out.print(j*2+" ");
                    if (i==5)System.out.print(j*5+" ");
                }
            }
            System.out.println();
        }
    }
    static void question9(){
//*****
//*234*
//*234*
//*234*
//*****
        for (int  i = 1; i<=5; i++){
            for (int j = 1; j<=5; j++){
                if (i==1||i==5) System.out.print("*");
                else {
                    if (j==1||j==5) System.out.print("*");
                    else System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    static void question8(){
//        12345
//        54321
//        12345
//        54321
//        12345
        int k = 5;
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=5; j++){
                if (i%2 != 0) System.out.print(j);
                else {
                    System.out.print(k);
                    k--;
                    if (k<1) k = 5;
                }
            }
            System.out.println();
        }
    }
//    *********
//     *********
//      *********
//       *********
//    static void question7(){
//        for (int i = 1; i<=6; i++){
//           for (int j =1; j<=12; j++){
//               if (i==1){
//                if (j<=6) System.out.print("*");
//                else System.out.print("0");
//               }
//               if (i==2){
//                   if (j<=6) System.out.print("*");
//                   else System.out.print("0");
//               }
//           }
//            System.out.println();
//        }
//    }
    static public void question6(){
// ***********
// ***********
//***********
// ***********
//***********
// ***********
//***********
// ***********
      for (int i = 1; i<=8; i++){
          for (int j = 1; j<=12; j++){
              if (i%2 != 0){
                  if (j==12) System.out.print(" ");
                  else System.out.print("*");
              }
              else {
                  if (j==1) System.out.print(" ");
                  else System.out.print("*");
              }
          }
          System.out.println();
      }

    }
    static  public void question5(){
//                1*3*5
//                *2*4*
//                1*3*5
//                *2*4*
//                1*3*5
            for(int i = 1; i<=5; i++){
                for (int j = 1; j<=5; j++){
                 if (i%2==0){
                     if (j%2==0){
                         System.out.print(j);
                     }
                     else {
                         System.out.print("*");
                     }
                 }
                 else {
                     if (j%2==0){
                         System.out.print("*");
                     }
                     else {
                         System.out.print(j);
                     }
                 }
                }
                System.out.println();
            }
    }
    static public void question4(){
        //            02345
//            10345
//            12045
//            12305
//            12340
        for (int i = 1; i<=5; i++){
            for (int  j =1; j<=5; j++){
                if (i==j){
                    System.out.print('0');
                }
                else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    static public void question3(){
//        12345
//        AAAAA
//        12345
//        AAAAA
//        12345
        int k = 1;
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=5; j++){
                if (k%2 != 0) System.out.print(j);
                else System.out.print('A');
            }
            k++;
            System.out.println();
        }
    }
    static public void question2(){
        int k = 0;
        for (int i = 1; i<=4; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(k);
                k++;
                if (k>2) k = 0;
            }
            System.out.println();
        }
    }
    static public void ouestion1(){
//        0
//        12
//        340
//        1234
        int k = 0;
        for (int i = 1; i<=4; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(k);
                k++;
                if (k>4) k = 0;
            }
            System.out.println();
        }
    }
}