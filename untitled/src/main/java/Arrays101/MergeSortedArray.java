package Arrays101;

import java.util.Arrays;

public class MergeSortedArray {
    /**
     * Example 1:
     * <p>
     * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * Output: [1,2,2,3,5,6]
     * Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
     * The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
     * Example 2:
     * <p>
     * Input: nums1 = [1], m = 1, nums2 = [], n = 0
     * Output: [1]
     * Explanation: The arrays we are merging are [1] and [].
     * The result of the merge is [1].
     * Example 3:
     * <p>
     * Input: nums1 = [0], m = 0, nums2 = [1], n = 1
     * Output: [1]
     * Explanation: The arrays we are merging are [] and [1].
     * The result of the merge is [1].
     * Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(n==0){
            return;
        } else if (m==0) {
            nums1 = Arrays.copyOf(nums2,n);
        }

        int i = m-1;
        int j = n -1;
        int f = m+n-1;
      while (j>=0){
          if (i>=0 && nums1[i]>= nums2[j]){
              nums1[f] = nums1[i];
              f--;
              i--;
          } else {
              nums1[f] = nums2[j];
              f--;
              j--;
          }
      }


//
//        int[] arr = new int[nums1.length];
//        int j = 0;
//        int a = 0;
//        for(int i =0; i < arr.length ; i++){
//            if(nums2[j]<=nums1[a]){
//              arr[i]= nums2[j];
//              j++;
//            } else if (nums1[a]< nums2[j] && nums1[a]!=0 ) {
//                arr[i] = nums1[a];
//                a++;
//            }
//            else {arr[i]= nums2[j];
//                j++;}
//
//        }
//
//        for (int q = 0; q < arr.length; q++) {
//            nums1[q] = arr[q];
//        }


    }
}
