
 class Java15 {
    public static void main(String[] args) {

        try {
            demo D = new demo();
//        float h = 433232.32323;
            String a = "abc";
            String b = "abc";
            try{
                int aw[] = {12,3,5,6};
                System.out.println(aw[6]);
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("index is not prsent in array"+e);
            }
            System.out.println(24 / 0);


        }

        catch (ArithmeticException e){
            System.out.println("invalid"+e);
        }
    }
}
