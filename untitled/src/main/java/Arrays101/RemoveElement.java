package Arrays101;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int [] arr = {0,1,2,2,3,0,4,2};
        removeElement(arr, 2);

        System.out.println(Arrays.toString(arr));
    }
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;

//        int k = 0;
//        int len = nums.length -1;
//        if (nums[len] == val){
//            nums[len] = -1;
//            k++;
//            len--;
//        }
//        for(int i = 0; i < len; i++){
//            if ( nums[i] == val){
//                k++;
//                while (true) {
//                    if ( nums[len] == val){
//                        k++;
//                        len--;
//                    } else {
//                        nums[i] = nums[len];
//                        nums[len] = -1;
//                        len--;
//                        break;
//                    }
//
//                }
//            }
//        }
//        System.out.println(k);
//
//        return k;

    }
}
