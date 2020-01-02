package johnny.lintcode.algorithm;

import johnny.lintcode.algorithm.LengthOfLastWord;
import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class LengthOfLastWordTest {

    public LengthOfLastWordTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of lengthOfLastWord method, of class LengthOfLastWord.
     */
    @Test
    public void testLengthOfLastWord() {
        System.out.println("lengthOfLastWord");
        LengthOfLastWord instance = new LengthOfLastWord();
        assertEquals(0, instance.lengthOfLastWord(""));
        assertEquals(5, instance.lengthOfLastWord("Hello World"));
        assertEquals(8, instance.lengthOfLastWord("Hello LintCode"));
        assertEquals(4, instance.lengthOfLastWord("Jack"));
    }
}