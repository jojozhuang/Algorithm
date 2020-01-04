package johnny.leetcode.algorithm;

import java.util.HashSet;

/**
 * 822. Card Flipping Game
 * On a table are N cards, with a positive integer printed on the front and back of each card (possibly different).
 * <p>
 * We flip any number of cards, and after we choose one card.
 * <p>
 * If the number X on the back of the chosen card is not on the front of any card, then this number X is good.
 * <p>
 * What is the smallest number that is good?  If no number is good, output 0.
 * <p>
 * Here, fronts[i] and backs[i] represent the number on the front and back of card i.
 * <p>
 * A flip swaps the front and back numbers, so the value on the front is now on the back and vice versa.
 * <p>
 * Example:
 * <p>
 * Input: fronts = [1,2,4,4,7], backs = [1,3,4,1,3]
 * Output: 2
 * Explanation: If we flip the second card, the fronts are [1,3,4,4,7] and the backs are [1,2,4,1,3].
 * We choose the second card, which has number 2 on the back, and it isn't on the front of any card, so 2 is good.
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= fronts.length == backs.length <= 1000.
 * 1 <= fronts[i] <= 2000.
 * 1 <= backs[i] <= 2000.
 *
 * @author Johnny
 */
public class Solution822 {
    public int flipgame(int[] fronts, int[] backs) {
        HashSet<Integer> same = new HashSet<>();
        for (int i = 0; i < fronts.length; ++i) {
            if (fronts[i] == backs[i]) same.add(fronts[i]);
        }
        int res = 3000;
        for (int i : fronts) {
            if (!same.contains(i)) {
                res = Math.min(res, i);
            }
        }
        for (int i : backs) {
            if (!same.contains(i)) {
                res = Math.min(res, i);
            }
        }
        return res % 3000;
    }
}
