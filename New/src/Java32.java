import java.util.ArrayList;

public class Java32 {
    public static void main(String[] args) {
       String str[] = {"alic3","bob","3","4","00000"};
        Solut4ion4 s = new Solut4ion4();
        System.out.println(s.maximumValue(str));

    }
}
class Solut4ion4 {
    public int maximumValue(String[] strs) {
        int count = 0;
        for(int i = 0; i<strs.length; i++){
            if(strs[i].charAt(0)==0){
                return 1;
            }
            else{
                int max = strs[i].length();
                if(max>count){
                    count =max;
                }
            }
        }
        return count;
    }
}
