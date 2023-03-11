public class UncheckedExeption {

    class BalanceExeption extends Exception{
        @Override
        public String toString() {
            return "This is throeable String";
//            int a = 10;
        }
    }


    void meth1() throws BalanceExeption {
//        System.out.println(12/0);

            throw new BalanceExeption();


    }
    void meth2() throws BalanceExeption {
meth1();
    }
    void meth3() throws BalanceExeption {
meth2();
    }
    void meth4() throws BalanceExeption {
meth3();
    }

    public static void main(String[] args) {
        UncheckedExeption une = new UncheckedExeption();
        try{
            une.meth4();
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("IT meant to execute");
        }
    }
}
