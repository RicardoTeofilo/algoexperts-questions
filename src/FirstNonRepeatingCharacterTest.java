import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class FirstNonRepeatingCharacterTest {

    @Test
    public void TestCase1() {
        String input = "abcdcaf";
        int expected = 1;
        var actual = new FirstNonRepeatingCharacter().firstNonRepeatingCharacter(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase2() {
        String input = "faadabcbbebdf";
        int expected = 6;
        var actual = new FirstNonRepeatingCharacter().firstNonRepeatingCharacter(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase3() {
        String input = "a";
        int expected = 0;
        var actual = new FirstNonRepeatingCharacter().firstNonRepeatingCharacter(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase4() {
        String input = "ababacc";
        int expected = -1;
        var actual = new FirstNonRepeatingCharacter().firstNonRepeatingCharacter(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase5() {
        String input = "lmnopqldsafmnopqsa";
        int expected = 7;
        var actual = new FirstNonRepeatingCharacter().firstNonRepeatingCharacter(input);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase6() {
        String input = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxy";
        int expected = 25;
        var actual = new FirstNonRepeatingCharacter().firstNonRepeatingCharacter(input);
        assertTrue(expected == actual);
    }
}
