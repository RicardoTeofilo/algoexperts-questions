import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class ClassPhotosTest {

    @Test
    public void TestCase1() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 3, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(6, 9, 2, 4, 5));
        boolean expected = true;
        boolean actual = new ClassPhotos().classPhotos(redShirtHeights, blueShirtHeights);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase2() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(6, 9, 2, 4, 5, 1));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 8, 1, 3, 4, 9));
        boolean expected = false;
        boolean actual = new ClassPhotos().classPhotos(redShirtHeights, blueShirtHeights);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase3() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(6));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(6));
        boolean expected = false;
        boolean actual = new ClassPhotos().classPhotos(redShirtHeights, blueShirtHeights);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase4() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6));
        boolean expected = true;
        boolean actual = new ClassPhotos().classPhotos(redShirtHeights, blueShirtHeights);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase5() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(5, 6, 7, 2, 3, 1, 2, 3));
        boolean expected = false;
        boolean actual = new ClassPhotos().classPhotos(redShirtHeights, blueShirtHeights);
        assertTrue(expected == actual);
    }

    @Test
    public void TestCase6() {
        ArrayList<Integer> redShirtHeights = new ArrayList<Integer>(Arrays.asList(19, 2, 4, 6, 2, 3, 1, 1, 4));
        ArrayList<Integer> blueShirtHeights = new ArrayList<Integer>(Arrays.asList(21, 5, 4, 4, 4, 4, 4, 4, 4));
        boolean expected = false;
        boolean actual = new ClassPhotos().classPhotos(redShirtHeights, blueShirtHeights);
        assertTrue(expected == actual);
    }
}
