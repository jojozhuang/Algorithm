package johnny.leetcode.algorithm;

/**
 * 803. Bricks Falling When Hit
 * We have a grid of 1s and 0s; the 1s in a cell represent bricks.  A brick will not drop if and only if it is directly connected to the top of the grid, or at least one of its (4-way) adjacent bricks will not drop.
 * <p>
 * We will do some erasures sequentially. Each time we want to do the erasure at the location (i, j), the brick (if it exists) on that location will disappear, and then some other bricks may drop because of that erasure.
 * <p>
 * Return an array representing the number of bricks that will drop after each erasure in sequence.
 * <p>
 * Example 1:
 * Input:
 * grid = [[1,0,0,0],[1,1,1,0]]
 * hits = [[1,0]]
 * Output: [2]
 * Explanation:
 * If we erase the brick at (1, 0), the brick at (1, 1) and (1, 2) will drop. So we should return 2.
 * Example 2:
 * Input:
 * grid = [[1,0,0,0],[1,1,0,0]]
 * hits = [[1,1],[1,0]]
 * Output: [0,0]
 * Explanation:
 * When we erase the brick at (1, 0), the brick at (1, 1) has already disappeared due to the last move. So each erasure will cause no bricks dropping.  Note that the erased brick (1, 0) will not be counted as a dropped brick.
 * <p>
 * <p>
 * Note:
 * <p>
 * The number of rows and columns in the grid will be in the range [1, 200].
 * The number of erasures will not exceed the area of the grid.
 * It is guaranteed that each erasure will be different from any other erasure, and located inside the grid.
 * An erasure may refer to a location with no brick - if it does, no bricks drop.
 *
 * @author Johnny
 */
public class Solution803 {
    /*
}
    public int[] hitBricks(int[][] grid, int[][] hits) {
        int[][] g = grid;
        int m = grid.length;
        int n = grid[0].length;
        
        int[] ans = new int[hits.length];
        
        for (int i = 0; i < hits.length; ++i)
          ans[i] = hit(m, n, hits[i][1], hits[i][0]);
        
        return ans;
    }
      
      private int hit(int m , int n, int x, int y) {
        if (x < 0 || x >= n || y < 0 || y >= m || g[y][x] == 0) return 0;
        g[y][x] = 0;
        int ans = 0;
        for (int i = 0; i < 4; ++i) {
          ++seq;      
          count = 0;
          if (!fall(x + dirs[i], y + dirs[i + 1], false)) continue;
          ans += count;
          ++seq;
          fall(x + dirs[i], y + dirs[i + 1], true);
        }
        return ans;
      }
      
      private boolean fall(int x, int y, boolean clear) {
        if (x < 0 || x >= n || y < 0 || y >= m) return true;
        if (g[y][x] == seq || g[y][x] == 0) return true;
        if (y == 0) return false;
        g[y][x] = clear ? 0 : seq;
        ++count;
        for (int i = 0; i < 4; ++i)
          if (!fall(x + dirs[i], y + dirs[i + 1], clear)) return false;
        return true;
      }
      */

    public int[] hitBricks(int[][] grid, int[][] hits) {
        if (hits.length == 0 || hits[0].length == 0) return null;
        removeHitBrick(grid, hits);
        markRemainBricks(grid);
        return searchFallingBrick(grid, hits);
    }

    private void markRemainBricks(int[][] grid) {
        for (int i = 0; i < grid[0].length; i++) {
            deepSearch(grid, 0, i);
        }
    }

    private void removeHitBrick(int[][] grid, int[][] hits) {
        for (int i = 0; i < hits.length; i++) {
            grid[hits[i][0]][hits[i][1]] = grid[hits[i][0]][hits[i][1]] - 1;
        }
    }

    private int[] searchFallingBrick(int[][] grid, int[][] hits) {
        int[] result = new int[hits.length];
        for (int i = hits.length - 1; i >= 0; i--) {
            if (grid[hits[i][0]][hits[i][1]] == 0) {
                grid[hits[i][0]][hits[i][1]] = 1;
                if (isConnectToTop(grid, hits[i][0], hits[i][1])) {
                    result[i] = deepSearch(grid, hits[i][0], hits[i][1]) - 1;
                } else {
                    result[i] = 0;
                }
            }
        }
        return result;
    }

    private boolean isConnectToTop(int[][] grid, int i, int j) {
        if (i == 0) return true;

        if (i - 1 >= 0 && grid[i - 1][j] == 2) {
            return true;
        }
        if (i + 1 < grid.length && grid[i + 1][j] == 2) {
            return true;
        }
        if (j - 1 >= 0 && grid[i][j - 1] == 2) {
            return true;
        }
        if (j + 1 < grid[0].length && grid[i][j + 1] == 2) {
            return true;
        }
        return false;
    }

    private int deepSearch(int[][] data, int row, int column) {
        int arrayRow = data.length;
        int arrayLine = data[0].length;
        int effectBricks = 0;
        if (row < 0 || row >= arrayRow) return effectBricks;
        if (column < 0 || column >= arrayLine) return effectBricks;
        if (data[row][column] == 1) {
            data[row][column] = 2;
            effectBricks = 1;
            effectBricks += deepSearch(data, row + 1, column);
            effectBricks += deepSearch(data, row - 1, column);
            effectBricks += deepSearch(data, row, column + 1);
            effectBricks += deepSearch(data, row, column - 1);
        }
        return effectBricks;
    }
}
