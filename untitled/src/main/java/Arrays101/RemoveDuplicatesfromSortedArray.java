package Arrays101;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        int iSort = 0;
        for(int i =0; i < nums.length; i++){
            if(nums[i] != nums[iSort]){
                iSort++;
                nums[iSort] = nums[i];
                k++;
            }
        }
        return k;




    }
}
