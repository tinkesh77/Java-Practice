import java.util.ArrayList;
import java.util.List;

public class Java41 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,10,4,2},
                {9,3,8,7},
                {15,16,14,12}
        };
        ro.arr(arr);
    }
}
class ro{
    public static void arr(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        int minRow[] = new int[matrix.length];
        int maxCol[] = new int[matrix[0].length];
        for(int i = 0; i<matrix.length; i++)
        {
            int min = 99999999;
            for(int j = 0; j<matrix[i].length; j++)
            {
                if(min>matrix[i][j])
                {
                    min = matrix[i][j];
                }
            }
            minRow[i] = min;
        }
        for(int i = 0; i<matrix.length; i++)
        {
            int max = 0;
            for(int j = 0; j<matrix.length; j++)
            {
                if(max<matrix[j][i])
                {
                    max = matrix[j][i];
                }
            }
            maxCol[i] = max;
        }
        for(int i = 0; i<minRow.length; i++)
        {
            for(int j = 0; j<maxCol.length; j++)
            {
                if(minRow[i]==maxCol[j])
                {
                    list.add(minRow[i]);
                }
            }
        }

    }


}

