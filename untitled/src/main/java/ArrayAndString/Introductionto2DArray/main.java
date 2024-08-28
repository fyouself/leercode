package ArrayAndString.Introductionto2DArray;

import java.util.ArrayList;
import java.util.List;

public class main {
    /**
     * Given an m x n matrix mat, return an array of all the elements of the array in a diagonal order.
     * <p>
     * Example 1:
     * Input: mat = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [1,2,4,7,5,3,6,8,9]
     * <p>
     * Example 2:
     * Input: mat = [[1,2],[3,4]]
     * Output: [1,2,3,4]
     */
    public static void main(String[] args) {
        System.out.println(11 % 2);
    }

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m * n];


        return arr;
    }

    /**
     * Spiral Matrix
     * <p>
     * Solution
     * Given an m x n matrix, return all elements of the matrix in spiral order.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * <p>
     * Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     * Output: [1,2,3,6,9,8,7,4,5]
     * Example 2:
     * <p>
     * <p>
     * Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
     * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
     */
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int size = matrix.length * matrix[0].length;
        int r = 0;
        int c = 0;
        int maxr = matrix.length;
        int maxC = matrix[0].length;

        for (int i = 0; i < size; i++) {


        }

        return list;
    }

    /**
     * Pascal's Triangle
     * Input: numRows = 5
     * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
     * Example 2:
     *
     * Input: numRows = 1
     * Output: [[1]]
     *
     */

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i<numRows; i++){
            List<Integer> row = new ArrayList<>();
            for(int j =0; j < i+1; j++){
                if( j==0 || j==i){
                    row.add(1);
                }
                else {
                    row.add(result.get(i).get(j -1) + result.get(i).get(j) );
                }
            }

            result.add(row);


        }


        return result;
    }

}
