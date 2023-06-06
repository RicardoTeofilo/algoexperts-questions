import java.util.Hashtable;
import java.util.Map;

/**
 * <div class="html">
 * <h2>Nth Fibonacci</h2>
 * <p>
 *   The Fibonacci sequence is defined as follows: the first number of the sequence
 *   is <span>0</span>, the second number is <span>1</span>, and the nth number is the sum of the (n - 1)th
 *   and (n - 2)th numbers. Write a function that takes in an integer
 *   <span>n</span> and returns the nth Fibonacci number.
 * </p>
 * <p>
 *   Important note: the Fibonacci sequence is often defined with its first two
 *   numbers as <span>F0 = 0</span> and <span>F1 = 1</span>. For the purpose of
 *   this question, the first Fibonacci number is <span>F0</span>; therefore,
 *   <span>getNthFibRecursive(1)</span> is equal to <span>F0</span>, <span>getNthFibRecursive(2)</span>
 *   is equal to <span>F1</span>, etc..
 * </p>
 * <h3>Sample Input #1</h3>
 * <pre><span class="CodeEditor-promptParameter">n</span> = 2
 * </pre>
 * <h3>Sample Output #1</h3>
 * <pre>1 <span class="CodeEditor-promptComment">// 0, 1</span>
 * </pre>
 * <h3>Sample Input #2</h3>
 * <pre><span class="CodeEditor-promptParameter">n</span> = 6
 * </pre>
 * <h3>Sample Output #2</h3>
 * <pre>5 <span class="CodeEditor-promptComment">// 0, 1, 1, 2, 3, 5</span>
 * </pre>
 * </div>
 */
public class FibonacciFunction {
    /**
     * This is  the worst performant implementation.
     * It uses recursion, but it does not use any caching or
     * memoization technique.
     * @param n
     * @return
     */
    public static int getNthFibRecursive(int n) {
        if(n == 1) {
            return 0;
        }else if(n == 2) {
            return 1;
        }else{
            return getNthFibRecursive(n - 1) + getNthFibRecursive(n -2);
        }
    }

    /**
     * This is the recursive implementation with Caching or
     * memoization technique.
     */
    public static int getNthFibRecursiveWithCaching(int n) {

        Hashtable<Integer, Integer> fibNumbersMap = new Hashtable<>();
        fibNumbersMap.put(1, 0);
        fibNumbersMap.put(2, 1);
        return getNthFibRecursiveWithCaching(n, fibNumbersMap);
    }

    public static int getNthFibRecursiveWithCaching(int n, Map<Integer, Integer> fibNumbersMap) {
        if(fibNumbersMap.containsKey(n)) {
            return fibNumbersMap.get(n);
        } else {
            fibNumbersMap.put(n,
                    (getNthFibRecursiveWithCaching(n-1, fibNumbersMap) +
                    getNthFibRecursiveWithCaching(n-2, fibNumbersMap)));
            return fibNumbersMap.get(n);
        }
    }


    /**
     * This is the iterative solution with Caching. It is the most elegant and
     * performant solution
     */
    public static int getNthFibIterativeWithCaching(int n) {

        Hashtable<Integer, Integer> fibNumbersMap = new Hashtable<>();
        for(int i = 1; i <= n; i++){
            if(i == 1){
                fibNumbersMap.put(1, 0);
            }else if(i == 2){
                fibNumbersMap.put(2, 1);
            }else{
                fibNumbersMap.put(i, (fibNumbersMap.get(i - 1) + fibNumbersMap.get(i - 2)));
            }
        }
        return fibNumbersMap.get(n);
    }
}
