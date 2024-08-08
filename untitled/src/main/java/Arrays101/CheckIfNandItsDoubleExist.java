package Arrays101;

public class CheckIfNandItsDoubleExist {
    /**
     * Input: arr = [10,2,5,3]
     * Output: true
     * Explanation: For i = 0 and j = 2, arr[i] == 10 == 2 * 5 == 2 * arr[j]
     * Example 2:
     * <p>
     * Input: arr = [3,1,7,11]
     * Output: false
     * Explanation: There is no i and j that satisfy the conditions.
     */

    public boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[i] == 2 * arr[j]) {
                    return true;
                } else if (arr[j] == 2 * arr[i]) {
                    return true;
                }
            }
        }

        return false;
    }
}
