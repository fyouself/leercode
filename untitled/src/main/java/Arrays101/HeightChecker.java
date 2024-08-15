package Arrays101;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int k = 0;
        int [] copySortArr =  Arrays.copyOf(heights, heights.length);
        Arrays.sort(copySortArr);
       for (int i = 0; i < heights.length; i++){
           if (heights[i] != copySortArr[i]) {
               k++;
           }
       }

        return k;
    }
}
