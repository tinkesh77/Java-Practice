class Person{
        public void talk(){}

}
public class Java21 {
    public static void main(String[] args) {
        Person P = null;
        try{
            P.talk();
        }
        catch (NullPointerException e){
            System.out.println("Catch Block");
        }
        catch (Exception e){
            System.out.println("Second Catch Block");
        }
        System.out.println("All Ok");
        int ans[] = {1,2,3};
        System.out.println(ans.length);
    }
}
