package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution468Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("validIPAddress");
        Solution468 instance = new Solution468();

        assertEquals("Neither", instance.validIPAddress("20EE:FGb8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("Neither", instance.validIPAddress("00.0.0.0"));
        assertEquals("Neither", instance.validIPAddress("111111111111111111.0.0.0"));
        assertEquals("Neither", instance.validIPAddress("1e1.4.5.6"));
        assertEquals("IPv4", instance.validIPAddress("172.16.254.1"));
        assertEquals("IPv6", instance.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("Neither", instance.validIPAddress("256.256.256.256"));
        assertEquals("Neither", instance.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));

    }
}
