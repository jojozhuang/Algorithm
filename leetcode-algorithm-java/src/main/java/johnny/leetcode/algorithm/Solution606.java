package johnny.leetcode.algorithm;

import johnny.algorithm.common.TreeNode;

/**
 * Construct String from Binary Tree
 * <p>
 * You need to construct a string consists of parenthesis and integers from a
 * binary tree with the preorder traversing way.
 * <p>
 * The null node needs to be represented by empty parenthesis pair "()". And you
 * need to omit all the empty parenthesis pairs that don't affect the one-to-one
 * mapping relationship between the string and the original binary tree.
 * <p>
 * Example 1:
 * Input: Binary tree: [1,2,3,4]
 * 1
 * /   \
 * 2     3
 * /
 * 4
 * <p>
 * Output: "1(2(4))(3)"
 * <p>
 * Explanation: Originallay it needs to be "1(2(4)())(3()())",
 * but you need to omit all the unnecessary empty parenthesis pairs.
 * <p>
 * And it will be "1(2(4))(3)".
 * <p>
 * Example 2:
 * Input: Binary tree: [1,2,3,null,4]
 * <p>
 * 1
 * /   \
 * 2     3
 * \
 * 4
 * <p>
 * Output: "1(2()(4))(3)"
 * <p>
 * Explanation: Almost the same as the first example,
 * except we can't omit the first parenthesis pair to break the one-to-one
 * mapping relationship between the input and the output.
 *
 * @author Johnny
 */
public class Solution606 {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }

        String res = String.valueOf(t.val);

        String left = tree2str(t.left);
        String right = tree2str(t.right);

        if (!left.isEmpty() || !right.isEmpty()) {
            res = res + "(" + left + ")";
        }

        if (!right.isEmpty()) {
            res = res + "(" + right + ")";
        }

        return res;
    }
}
