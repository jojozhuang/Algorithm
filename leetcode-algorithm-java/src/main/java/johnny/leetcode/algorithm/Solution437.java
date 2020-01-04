package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * Path Sum III
 * <p>
 * You are given a binary tree in which each node contains an integer value.
 * <p>
 * Find the number of paths that sum to a given value.
 * The path does not need to start or end at the root or a leaf, but it must go
 * downwards (traveling only from parent nodes to child nodes).
 * <p>
 * The tree has no more than 1,000 nodes and the values are in the
 * range -1,000,000 to 1,000,000.
 * <p>
 * Example:
 * <p>
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 * <p>
 * 10
 * /  \
 * 5   -3
 * / \    \
 * 3   2   11
 * / \   \
 * 3  -2   1
 * <p>
 * Return 3. The paths that sum to 8 are:
 * <p>
 * {@code 1.  5 -> 3}
 * {@code 2.  5 -> 2 -> 1}
 * {@code 3. -3 -> 11}
 *
 * @author Johnny
 */
public class Solution437 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        return pathSumFrom(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int pathSumFrom(TreeNode node, int sum) {
        if (node == null) {
            return 0;
        }

        int count = node.val == sum ? 1 : 0;
        count += pathSumFrom(node.left, sum - node.val) + pathSumFrom(node.right, sum - node.val);

        return count;
    }
}
