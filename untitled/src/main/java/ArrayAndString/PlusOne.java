package ArrayAndString;

import java.util.Arrays;

public class PlusOne {
    /**
     * Plus One
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Incrementing by one gives 123 + 1 = 124.
     * Thus, the result should be [1,2,4].
     * Example 2:
     * <p>
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     * Incrementing by one gives 4321 + 1 = 4322.
     * Thus, the result should be [4,3,2,2].
     * Example 3:
     * <p>
     * Input: digits = [9]
     * Output: [1,0]
     * Explanation: The array represents the integer 9.
     * Incrementing by one gives 9 + 1 = 10.
     * Thus, the result should be [1,0].
     */
    public static void main(String[] args) {
        int[] arr1 = {9,8,7,6,1,2,1,3,1,3,1};
        int[] arr2 = plusOne(arr1);
        System.out.println(Arrays.toString(arr2));

    }

    public static int[] plusOne(int[] digits) {
        String str ="";
        for (int n :
                digits) {
            str = str + n;
        }
        System.out.println(str);
        long n = Long.parseLong(str);
        n++;
        str = Long.toString(n);
        int[] arr = new int[str.length()];
        for (int i =arr.length-1; i >= 0; i--){
            arr[i] = (int) (n%10);
            n= n/10;
        }


        return arr;
    }
}

