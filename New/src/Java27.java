public class Java27 {
    public void main(String[] args) {
//        Angstrom ca = new Angstrom();
        int arr[] = {1,2,3};
//        ca.plusOne(arr);
        Angstrom an = new Angstrom();

    }
class Angstrom {

    public boolean Asgstrom(int num) {
        int sum = 0;
        int rem = 0;
        int temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem * rem * rem;
            num = num / 10;
        }
//       System.out.println(sum);
        if (temp == sum)
            return true;
        else
            return false;
    }

    public boolean Palindreom(int num2) {
        int rem = 0;
        int sum = 0;
        int temp = num2;
        do {
            rem = num2 % 10;
            sum = sum * 10 + rem;
            num2 = num2 / 10;
        }
        while (num2 > 0);
        if (sum == temp) {
            return true;
        } else {
            return false;
        }
    }

    public int HowManyPalindeomNo() {
        int count = 0;
        for (int j = 0; j < 10; j++) {
            int rem = 0;
            int sum = 0;
            int temp = j;
            while (j > 0) {
                rem = j % 10;
                sum = sum * 10 + rem;
                j = j / 10;
            }
            if (sum == temp) {
                count++;
            }
            System.out.println();
        }
        return count;
    }

    public String Revrse(String str) {
        int le = str.length() - 1;
        String re = "";
        for (int i = 0; i < str.length(); i++) {
            re = re + str.charAt(le);
            le--;
        }
        return re;
    }

    public int[][] transpose(int[][] matrix) {
        int k = 0;
        for (int i = 0; i < matrix.length; i++) {
            int h = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (j == k) {
                    matrix[i][h] = matrix[i][j];
                    h++;
                }
            }
            k++;
        }
        return matrix;
    }

    public int plusOne(int[] digits) {
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum = sum * 10 + digits[i];
        }
        return sum;
    }
}
}
