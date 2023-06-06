import java.util.HashSet;

/**
 * <div class="html">
 *   <h2>Zero Sum SubArray</h2>
 *   <p>
 *     You're given a list of integers <span>nums</span>. Write a function that
 *     returns a boolean representing whether there exists a zero-sum subarray of
 *     <span>nums</span>.
 *   </p>
 *
 *   <p>
 *     A zero-sum subarray is any subarray where all of the values add up to zero.
 *     A subarray is any contiguous section of the array. For the purposes of this
 *     problem, a subarray can be as small as one element and as long as the
 *     original array.
 *   </p>
 * <h3>Sample Input</h3>
 * <pre><span class="CodeEditor-promptParameter">nums</span> = [-5, -5, 2, 3, -2]</pre>
 * <h3>Sample Output</h3>
 * <pre>True <span class="CodeEditor-promptComment">// The subarray [-5, 2, 3] has a sum of 0
 * </span>
 * </pre></div>
 */
public class ZeroSumSubarray {
    public boolean zeroSumSubarray(int[] nums) {
        HashSet<Integer> sums = new HashSet<Integer>();
        sums.add(0);
        int currentSum = 0;

        for(int i = 0; i < nums.length; i++){
            currentSum += nums[i];
            if(sums.contains(currentSum)){
                return true;
            }
            sums.add(currentSum);
        }
        return false;
    }
}
