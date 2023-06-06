/**
 *<div class="html">
 * <h2>Three Number Sort</h2>
 * <p>
 *   You're given an array of integers and another array of three distinct
 *   integers. The first array is guaranteed to only contain integers that are in
 *   the second array, and the second array represents a desired order for the
 *   integers in the first array. For example, a second array of
 *   <span>[x, y, z]</span> represents a desired order of
 *   <span>[x, x, ..., x, y, y, ..., y, z, z, ..., z]</span> in the first array.
 * </p>
 * <p>
 *   Write a function that sorts the first array according to the desired order in
 *   the second array.
 * </p>
 * <p>
 *   The function should perform this in place (i.e., it should mutate the input
 *   array), and it shouldn't use any auxiliary space (i.e., it should run with
 *   constant space: <span>O(1)</span> space).
 * </p>
 * <p>
 *   Note that the desired order won't necessarily be ascending or descending and
 *   that the first array won't necessarily contain all three integers found in the
 *   second array—it might only contain one or two.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span class="CodeEditor-promptParameter">array</span> = [1, 0, 0, -1, -1, 0, 1, 1]
 * <span class="CodeEditor-promptParameter">order</span> = [0, 1, -1]
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>[0, 0, 0, 1, 1, 1, -1, -1]
 * </pre>
 * </div>
 */

public class ThreeNumberSort {

    /**
     * This implementation uses a double for loop
     * Linear O(n) time | O(1) space
     */
    public int[] threeNumberSort(int[] array, int[] order) {

        int firstNumber = order[0];
        int thirdNumber = order[2];
        int firstNumberIndex = 0;
        int thirdNumberIndex = array.length - 1;

        for(int i = 0; i < array.length; i++){
            if(array[i] == firstNumber){
                swap(i, firstNumberIndex, array);
                firstNumberIndex++;
            }
        }
        for(int j = array.length - 1; j >= firstNumberIndex; j--){
            if(array[j] == thirdNumber){
                swap(j, thirdNumberIndex, array);
                thirdNumberIndex--;
            }
        }
        return array;
    }

    /**
     * This implementation uses a single for loop
     * With three pointers:
     * i the cursor
     * firstNumberIndex to mark the position of the first number
     * thirdNumberIndex to mark the position of the third number
     *
     * Linear O(n) time | O(1) space
     */
    public int[] threeNumberSortSingleLoop(int[] array, int[] order) {

        int firstNumber = order[0];
        int thirdNumber = order[2];
        int firstNumberIndex = 0;
        int thirdNumberIndex = array.length - 1;
        int i = 0;

        while(i <= thirdNumberIndex){
            if(array[i] == firstNumber && i != firstNumberIndex){
                swap(i, firstNumberIndex, array);
                firstNumberIndex++;
            } else if (array[i] == thirdNumber && i != thirdNumberIndex) {
                swap(i, thirdNumberIndex, array);
                thirdNumberIndex--;
            }else{
                i++;
            }
        }
        return array;
    }

    public static void swap(int i, int j, int[] array){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
