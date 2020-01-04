package johnny.leetcode.algorithm;

/**
 * 1041. Robot Bounded In Circle
 * On an infinite plane, a robot initially stands at (0, 0) and faces north.  The robot can receive one of three instructions:
 * <p>
 * "G": go straight 1 unit;
 * "L": turn 90 degrees to the left;
 * "R": turn 90 degress to the right.
 * The robot performs the instructions given in order, and repeats them forever.
 * <p>
 * Return true if and only if there exists a circle in the plane such that the robot never leaves the circle.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: "GGLLGG"
 * Output: true
 * Explanation:
 * The robot moves from (0,0) to (0,2), turns 180 degrees, and then returns to (0,0).
 * When repeating these instructions, the robot remains in the circle of radius 2 centered at the origin.
 * Example 2:
 * <p>
 * Input: "GG"
 * Output: false
 * Explanation:
 * The robot moves north indefinitely.
 * Example 3:
 * <p>
 * Input: "GL"
 * Output: true
 * Explanation:
 * The robot moves from (0, 0) -> (0, 1) -> (-1, 1) -> (-1, 0) -> (0, 0) -> ...
 * <p>
 * <p>
 * Note:
 * <p>
 * 1 <= instructions.length <= 100
 * instructions[i] is in {'G', 'L', 'R'}
 *
 * @author Johnny
 */
public class SolutionA1041 {
    public boolean isRobotBounded(String instructions) {
        return false;
    }
}
