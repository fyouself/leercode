package Beginner_Guide;

import java.util.ArrayList;
import java.util.List;

/**Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

 Return the running sum of nums.



 Example 1:

 Input: nums = [1,2,3,4]
 Output: [1,3,6,10]
 Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 Example 2:

 Input: nums = [1,1,1,1,1]
 Output: [1,2,3,4,5]
 Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
 Example 3:

 Input: nums = [3,1,2,10,1]
 Output: [3,4,6,16,17]
 **/

public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {

    }

    public int[] runningSum(int[] nums) {
        List<Integer> resList  = new ArrayList();

        for (int i =0 ; i < nums.length ; i++){
          int sumNum = 0;
          sumNum += nums[i];
          resList.add(sumNum);
        }


     int [] resArr = new int[resList.size()];
     for (int i = 0; i <resArr.length;i++){
         resArr[i] = resList.get(i);
     }
        return resArr;
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int sum =0;
        for ( int i = 0; i< nums.length; i++){
            if (nums[i]==0){
                if(sum>max){
                    max = sum;
                }
                sum=0;
            }
            else{
                sum +=nums[i];
            }
        }
        if(sum>max){
            max = sum;
        }
        return max;

    }
}

