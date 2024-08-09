package Arrays101;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int c = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i]) return false;
            else if (arr[i + 1] < arr[i]) {
                break;
            }
            c++;
        }
        for(int j = c ; j<arr.length-1; j++){
            if (arr[j + 1] == arr[j] || arr[j + 1] > arr[j]) return false;
        }

        return true;
    }
}
