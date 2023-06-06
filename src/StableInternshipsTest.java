import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StableInternshipsTest {

    @Test
    public void TestCase1() {
        int[][] interns = new int[][] {{0, 1}, {1, 0}};
        int[][] teams = new int[][] {{1, 0}, {1, 0}};
        int[][] expected = new int[][] {{0, 0}, {1, 1}};
        var actual = new StableInternships().stableInternships(interns, teams);
        assertTrue(expected.length == actual.length);
        assertTrue(containsMatch(expected, actual));
    }

    @Test
    public void TestCase2() {
        int[][] interns = new int[][] {{0, 1}, {1, 0}};
        int[][] teams = new int[][] {{0, 1}, {1, 0}};
        int[][] expected = new int[][] {{0, 0}, {1, 1}};
        var actual = new StableInternships().stableInternships(interns, teams);
        assertTrue(expected.length == actual.length);
        assertTrue(containsMatch(expected, actual));
    }

    @Test
    public void TestCase3() {
        int[][] interns = new int[][] {{0, 1}, {0, 1}};
        int[][] teams = new int[][] {{0, 1}, {1, 0}};
        int[][] expected = new int[][] {{0, 0}, {1, 1}};
        var actual = new StableInternships().stableInternships(interns, teams);
        assertTrue(expected.length == actual.length);
        assertTrue(containsMatch(expected, actual));
    }

    @Test
    public void TestCase4() {
        int[][] interns = new int[][] {{0, 1, 2}, {2, 1, 0}, {1, 2, 0}};
        int[][] teams = new int[][] {{2, 1, 0}, {0, 1, 2}, {0, 2, 1}};
        int[][] expected = new int[][] {{0, 0}, {1, 2}, {2, 1}};
        var actual = new StableInternships().stableInternships(interns, teams);
        assertTrue(expected.length == actual.length);
        assertTrue(containsMatch(expected, actual));
    }

    @Test
    public void TestCase5() {
        int[][] interns = new int[][] {{0, 1, 2, 3}, {2, 1, 3, 0}, {0, 2, 3, 1}, {3, 1, 0, 2}};
        int[][] teams = new int[][] {{1, 3, 2, 0}, {0, 1, 2, 3}, {1, 2, 3, 0}, {3, 0, 2, 1}};
        int[][] expected = new int[][] {{0, 1}, {1, 2}, {2, 0}, {3, 3}};
        var actual = new StableInternships().stableInternships(interns, teams);
        assertTrue(expected.length == actual.length);
        assertTrue(containsMatch(expected, actual));
    }

    @Test
    public void TestCase6() {
        int[][] interns = new int[][] {{0, 1, 2, 3}, {0, 1, 3, 2}, {0, 2, 3, 1}, {0, 2, 3, 1}};
        int[][] teams = new int[][] {{1, 3, 2, 0}, {0, 1, 2, 3}, {1, 2, 3, 0}, {3, 0, 2, 1}};
        int[][] expected = new int[][] {{0, 1}, {1, 0}, {2, 2}, {3, 3}};
        var actual = new StableInternships().stableInternships(interns, teams);
        assertTrue(expected.length == actual.length);
        assertTrue(containsMatch(expected, actual));
    }

    private static boolean containsMatch(int[][] expected, int[][] actual){
        boolean containsMatch = false;
        for (int[] match : expected) {

            for (int[] actualMatch : actual) {
                if (actualMatch[0] == match[0] && actualMatch[1] == match[1]) {
                    containsMatch = true;
                }
            }
            assertTrue(containsMatch);
        }
        return containsMatch;
    }
}
