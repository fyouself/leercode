package ArrayAndString;

import java.util.ArrayList;

public class IntroductionToArray {
    /**
     * Пример 1:
     * <p>
     * Ввод: nums = [1,7,3,6,5,6]
     * Вывод: 3
     * Пояснение:
     * Индекс пивота равен 3.
     * Левая сумма = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
     * Правая сумма = nums[4] + nums[5] = 5 + 6 = 11
     */
    public int pivotIndex(int[] nums) {

        ArrayList<Integer> leftSum = new ArrayList<>();
        leftSum.add(0);
        ArrayList<Integer> rigthSum = new ArrayList<>();
        rigthSum.add(0);

        for (int i = 0; i < nums.length; i++) {
            leftSum.add(leftSum.get(i) + nums[i]);
            rigthSum.add(rigthSum.get(i) + nums[nums.length-1 -i]);
        }

        for(int j = 0; j < nums.length; j++){
            if(leftSum.get(j) == rigthSum.get(nums.length-j)){
                return j;
            }
        }

        return -1;
    }



}
