package ArrayAndString;

import java.util.Arrays;

public class LargestNumberAtLeastTwiceOfOthers {

    /**
     * Вам дан массив целых чисел nums, где наибольшее целое число является уникальным .
     *
     * Определите , является ли наибольший элемент массива по крайней мере вдвое больше любого другого числа в массиве. Если это так, верните индекс наибольшего элемента или верните -1в противном случае .
     *
     *
     *
     * Пример 1:
     *
     * Ввод: nums = [3,6,1,0]
     *  Вывод: 1
     *  Пояснение: 6 — наибольшее целое число.
     * Для любого другого числа в массиве x, 6 по крайней мере в два раза больше x.
     * Индекс значения 6 равен 1, поэтому мы возвращаем 1.
     */

    public int dominantIndex(int[] nums) {
        int indexMax = 0;
        int maxBig = -1;
        int maxLit = -1;
        for( int i = 0; i < nums.length; i++){
            if(nums[i] > maxBig){
                maxLit=maxBig;
                maxBig = nums[i];
                indexMax = i;

            }
        }

        if (maxLit ==0 && maxLit == -1){
            return -1;
        } else if (maxBig/maxLit > 0) {
            return indexMax;
        }

        return -1;    }

}
