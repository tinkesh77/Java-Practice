public class Java17 {
    public static void main(String[] args) {
        test t = new test();
        t.setMthod(100);
        System.out.println(t.getMethod());
        System.out.println((int)Math.random());
    }
    private Java17(){

    }
}
class test{

    private int x;
    void setMthod(int x){
        this.x = x;
    }
    int getMethod(){
        return x;
    }
}
