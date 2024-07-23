package Arrays101;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 *
 * Example 1:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 *
 * Example 2:
 * Input: nums = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */

public class Squares_of_a_Sorted_Array {

    public static void main(String[] args) {
        int [] arr = {-7,-3,10,2,3,1};
        sortedSquares2(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] sortedSquares1(int[] nums) {
        for( int i =0;i <nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }
//        Arrays.sort(nums);


        return nums;
    }

    public static int[] sortedSquares2(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        int i = 0, j = n - 1;
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
                System.out.println(Arrays.toString(result));
            }
        }
        return result;
    }
}
