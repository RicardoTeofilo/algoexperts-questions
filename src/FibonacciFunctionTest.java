import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FibonacciFunctionTest {
    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 0 }, { 2, 1 }, { 3, 1 }, { 4, 2 }, { 5, 3 }, { 6, 5 }, { 7, 8 },
                {8, 13}, {9, 21}, {10,34}, {11,55}, {12,89}, {13, 144}, {14, 233},
                {15, 377}
        });
    }

    @Parameter(0) // first data value (0) is default
    public int fInput;

    @Parameter(1)
    public int fExpected;

    @Test
    public void getNFibonacciRecursive() {
        assertEquals(fExpected, FibonacciFunction.getNthFibRecursive(fInput));
    }

    @Test
    public void getNFibonacciRecursiveWithCaching() {
        assertEquals(fExpected, FibonacciFunction.getNthFibRecursiveWithCaching(fInput));
    }

    @Test
    public void getNFibonacciIterativeWithCaching() {
        assertEquals(fExpected, FibonacciFunction.getNthFibIterativeWithCaching(fInput));
    }

}
