package johnny.leetcode.algorithm;

/**
 * 01 Matrix
 * <p>
 * Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.
 * <p>
 * The distance between two adjacent cells is 1.
 * <p>
 * Example 1:
 * Input:
 * 0 0 0
 * 0 1 0
 * 0 0 0
 * Output:
 * 0 0 0
 * 0 1 0
 * 0 0 0
 * <p>
 * Example 2:
 * Input:
 * 0 0 0
 * 0 1 0
 * 1 1 1
 * Output:
 * 0 0 0
 * 0 1 0
 * 1 2 1
 * <p>
 * Note:
 * 1. The number of elements of the given matrix will not exceed 10,000.
 * 2. There are at least one 0 in the given matrix.
 * 3. The cells are adjacent in only four directions: up, down, left and right.
 *
 * @author Johnny
 */
public class Solution542 {
    public int[][] updateMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return matrix;
        }
        int[][] dis = new int[matrix.length][matrix[0].length];
        int range = matrix.length * matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    dis[i][j] = 0;
                } else {
                    int upCell = (i > 0) ? dis[i - 1][j] : range;
                    int leftCell = (j > 0) ? dis[i][j - 1] : range;
                    dis[i][j] = Math.min(upCell, leftCell) + 1;
                }
            }
        }

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = matrix[0].length - 1; j >= 0; j--) {
                if (matrix[i][j] == 0) {
                    dis[i][j] = 0;
                } else {
                    int downCell = (i < matrix.length - 1) ? dis[i + 1][j] : range;
                    int rightCell = (j < matrix[0].length - 1) ? dis[i][j + 1] : range;
                    dis[i][j] = Math.min(Math.min(downCell, rightCell) + 1, dis[i][j]);
                }
            }
        }

        return dis;
    }
}
