/**
 * <div class="html">
 * <h2>Kadane's Algorithm</h2>
 * <p>
 *   Write a function that takes in a non-empty array of integers and returns the
 *   maximum sum that can be obtained by summing up all of the integers in a
 *   non-empty subarray of the input array. A subarray must only contain adjacent
 *   numbers (numbers next to each other in the input array).
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span class="CodeEditor-promptParameter">array</span> = [3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4]
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>19 <span class="CodeEditor-promptComment">// [1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1]</span>
 * </pre>
 * </div>
 */

public class KadanesAlgorithm {

    /**
     * O(n) time | O(1) space
     */
    public static int kadanesAlgorithm(int[] array) {

        int maxEndinghere = array[0];
        int maxSoFar = array[0];
        for(int i = 1; i < array.length; i++){
            maxEndinghere = Math.max(array[i], maxEndinghere + array[i]);
            maxSoFar = Math.max(maxSoFar, maxEndinghere);
        }
        return maxSoFar;
    }
}
