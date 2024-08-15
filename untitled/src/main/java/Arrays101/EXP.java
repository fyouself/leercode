package Arrays101;

public class EXP {
    /**
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * <p>
     * Note that you must do this in-place without making a copy of the array.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     * Example 2:
     * <p>
     * Input: nums = [0]
     * Output: [0]
     *
     * @param nums
     */
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int countZero = 0;
        int notZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[notZero] = nums[i];
                notZero++;
            }
            else countZero++;
        }
        for (int j = nums.length - 1; countZero > 0; countZero--) {
            nums[j] = 0;
            j--;
        }

    }


    /**
     * Sort Array By Parity
     *
     * Solution
     * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
     *
     * Return any array that satisfies this condition.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [3,1,2,4]
     * Output: [2,4,3,1]
     * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
     * Example 2:
     *
     * Input: nums = [0]
     * Output: [0]
     */

    public int[] sortArrayByParity(int[] nums) {
        int[] nums2 = new int[nums.length];
        int head = 0;
        int tail = nums.length-1;
        for (int n : nums){
            if(n%2==0) {
                nums2[head++] = n;
            } else nums2[tail--]=n;
        }
        return nums2;
    }
}
