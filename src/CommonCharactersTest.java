import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class CommonCharactersTest {

    @Test
    public void TestCase1() {
        String[] input = new String[] {"abc", "bcd", "cbad"};
        String[] expected = new String[] {"b", "c"};
        String[] actual = new CommonCharacters().commonCharacters(input);
        Arrays.sort(actual);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < actual.length; i++) {
            assertTrue(expected[i].equals(actual[i]));
        }
    }

    @Test
    public void TestCase2() {
        String[] input = new String[] {"a"};
        String[] expected = new String[] {"a"};
        String[] actual = new CommonCharacters().commonCharacters(input);
        Arrays.sort(actual);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < actual.length; i++) {
            assertTrue(expected[i].equals(actual[i]));
        }
    }

    @Test
    public void TestCase3() {
        String[] input = new String[] {"a", "b", "c"};
        String[] expected = new String[]{};
        String[] actual = new CommonCharacters().commonCharacters(input);
        Arrays.sort(actual);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < actual.length; i++) {
            assertTrue(expected[i].equals(actual[i]));
        }
    }

    @Test
    public void TestCase4() {
        String[] input = new String[] {"abcde", "aa", "foobar", "foobaz", "and this is a string", "aaaaaaaa", "eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeea"};
        String[] expected = new String[] {"a"};
        String[] actual = new CommonCharacters().commonCharacters(input);
        Arrays.sort(actual);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < actual.length; i++) {
            assertTrue(expected[i].equals(actual[i]));
        }
    }

    @Test
    public void TestCase5() {
        String[] input = new String[] {"abcdef", "fedcba", "abcefd", "aefbcd", "efadbc", "effffffffffffbcda", "eeeeeffffffbbbbbaaaaaccccdddd", "**************abdcef************"};
        String[] expected = new String[] {"a", "b", "c", "d", "e", "f"};
        String[] actual = new CommonCharacters().commonCharacters(input);
        Arrays.sort(actual);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < actual.length; i++) {
            assertTrue(expected[i].equals(actual[i]));
        }
    }

    @Test
    public void TestCase6() {
        String[] input = new String[] {"ab&cdef!", "f!ed&cba", "a&bce!d", "ae&fb!cd", "efa&!dbc", "eff!&fff&fffffffbcda", "eeee!efff&fffbbbbbaaaaaccccdddd", "*******!***&****abdcef************", "*******!***&****a***********f*", "*******!***&****b***********c*"};
        String[] expected = new String[] {"!", "&"};
        String[] actual = new CommonCharacters().commonCharacters(input);
        Arrays.sort(actual);
        assertTrue(expected.length == actual.length);
        for (int i = 0; i < actual.length; i++) {
            assertTrue(expected[i].equals(actual[i]));
        }
    }




}
