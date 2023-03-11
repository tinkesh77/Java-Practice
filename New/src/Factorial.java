public class Factorial {
    public class factorical {
        public static void main(String[] args) {
            fac f = new fac();
            System.out.println(f.Factorial(2));

        }
    }

    static class fac{
        public int Factorial(int num){
            int sum = 0;
            for (int i = 0; i<num; i++){
                sum = sum * 1;
            }
            return sum;
        }
    }



}

