import java.util.ArrayList;
import java.util.List;

/**
 * Max Sum Increasing Subsequence
 * <div class="html">
 * <p>
 *   Write a function that takes in a non-empty array of integers and returns the
 *   greatest sum that can be generated from a strictly-increasing subsequence in
 *   the array as well as an array of the numbers in that subsequence.
 * </p>
 * <p>
 *   A subsequence of an array is a set of numbers that aren't necessarily adjacent
 *   in the array but that are in the same order as they appear in the array. For
 *   instance, the numbers <span>[1, 3, 4]</span> form a subsequence of the array
 *   <span>[1, 2, 3, 4]</span>, and so do the numbers <span>[2, 4]</span>. Note
 *   that a single number in an array and the array itself are both valid
 *   subsequences of the array.
 * </p>
 * <p>
 *   You can assume that there will only be one increasing subsequence with the
 *   greatest sum.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span class="CodeEditor-promptParameter">array</span> = [10, 70, 20, 30, 50, 11, 30]
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>[110, [10, 20, 30, 50]] <span class="CodeEditor-promptComment">
 *     // The subsequence [10, 20, 30, 50] is strictly increasing and yields the greatest sum: 110.</span>
 * </pre>
 * </div>
 */
public class MaxSumIncreasingSubsequence {

    public static List<List<Integer>> maxSumIncreasingSubsequence(int[] array) {

        int[] sums = new int[array.length];
        int[] sequences = new int[array.length];
        for(int i = 0; i< array.length; i++){
            sums[i] =  array[i];
            sequences[i] =  Integer.MAX_VALUE;
        }

        int maxSumIdx = 0;
        for(int i = 0; i < array.length; i++){
            int currentNumber = array[i];
            for(int j = 0; j < i; j++){
                if (array[j] < array[i] && (currentNumber + sums[j] > sums[i])){
                    sums[i] = currentNumber + sums[j];
                    sequences[i] = j;
                }
            }
            if(sums[i] > sums[maxSumIdx]){
                maxSumIdx = i;
            }
        }

        Integer idxSequenceValue = maxSumIdx;
        ArrayList<Integer> sequenceValues = new ArrayList<>(array.length);
        while (idxSequenceValue != Integer.MAX_VALUE){
            sequenceValues.add(0, array[idxSequenceValue]);
            idxSequenceValue = sequences[idxSequenceValue];
        }

        ArrayList<List<Integer>> returnList = new ArrayList<>();
        returnList.add(List.of(sums[maxSumIdx]));
        returnList.add(sequenceValues);
        return returnList;
    }
}
