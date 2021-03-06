package johnny.leetcode.algorithm;

/**
 * 686. Repeated String Match
 * Given two strings A and B, find the minimum number of times A has to be repeated such that B is a substring of it. If no such solution, return -1.
 * <p>
 * For example, with A = "abcd" and B = "cdabcdab".
 * <p>
 * Return 3, because by repeating A three times (“abcdabcdabcd”), B is a substring of it; and B is not a substring of A repeated two times ("abcdabcd").
 * <p>
 * Note:
 * The length of A and B will be between 1 and 10000.
 *
 * @author Johnny
 */
public class Solution686 {
    public int repeatedStringMatch(String A, String B) {
        if (A == null || A.length() == 0) {
            return -1;
        }
        int count = 0;

        StringBuilder sb = new StringBuilder();
        while (sb.length() < B.length()) {
            sb.append(A);
            count++;
        }
        if (sb.toString().indexOf(B) >= 0) {
            return count;
        }
        sb.append(A);
        count++;
        if (sb.toString().indexOf(B) >= 0) {
            return count;
        }
        else {
            return -1;
        }
    }
    public int repeatedStringMatch2(String A, String B) {
        if (A == null || A.length() == 0) {
            return -1;
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < B.length()) {
            sb.append(A);
            count++;
        }
        if (sb.toString().contains(B)) return count;
        if (sb.append(A).toString().contains(B)) return ++count;
        return -1;
    }
}