import java.util.ArrayList;
import java.lang.*;
public class Java33 {
    public static void main(String[] args) {
        int[] Arr ={9,9,9,9,9,9,9,9,9,9};
        Demo d = new Demo();
//        System.out.println(d.RE(d.RevresInterger(d.RevresNumber(d.))));
        int ou = d.RevresInterger(Arr,1);
        System.out.println(ou);
        int ou1  = d.RevresNumber(ou);
        System.out.println(ou1);
        System.out.println(d.RE(ou1));

    }
}
class Demo{
    public int RevresNumber(int num){
        int sum = 0;
        int rem = 0;
        while (num>=0){
            rem = num%10;
            sum = sum*10 + rem;
            num = num/10;
        }
        return sum;
    }
    public int RevresInterger(int arr[], int k){
        int sum =0;
        for (int i =0; i< arr.length; i++){
           sum =10*sum +arr[i];

        }
        return sum+k;
    }
    public ArrayList<Integer> RE(int num){
        int rem =0;
        ArrayList<Integer> arrlist = new ArrayList<>();
        while (num>0){
            rem = num%10;
            arrlist.add(rem);
            num = num/10;
        }
        return arrlist;
    }

}