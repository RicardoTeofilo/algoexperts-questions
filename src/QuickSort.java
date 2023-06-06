/**
 * <div class="html">
 * <p>
 *   Write a function that takes in an array of integers and returns a sorted
 *   version of that array. Use the Quick Sort algorithm to sort the array.
 * </p>
 * <p>
 *   If you're unfamiliar with Quick Sort, we recommend watching the Conceptual
 *   Overview section of this question's video explanation before starting to code.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span class="CodeEditor-promptParameter">array</span> = [8, 5, 2, 9, 5, 6, 3]
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>[2, 3, 5, 5, 6, 8, 9]
 * </pre>
 * </div>
 */
public class QuickSort {

    public static int[] quickSort(int[] array) {

        return quickSortRecursive(array, 0, array.length - 1);
    }

    public static int[] quickSortRecursive(int[] array, int lowIdx, int highIdx){

        if(lowIdx == highIdx)
            return array;

        int pivot = array[highIdx];
        int leftIdx = lowIdx;
        int rightIdx = highIdx;

        while (leftIdx < rightIdx){
            while (leftIdx < rightIdx && array[leftIdx] <= pivot){
                leftIdx++;
            }
            while (rightIdx > leftIdx && array[rightIdx] >= pivot){
                rightIdx--;
            }
            if(leftIdx != rightIdx)
                swap(array, leftIdx, rightIdx);
        }
        swap(array, leftIdx, highIdx);

        if(lowIdx != leftIdx)
            quickSortRecursive(array, lowIdx, leftIdx - 1);
        if(leftIdx != highIdx)
            quickSortRecursive(array, leftIdx + 1, highIdx);

        return array;
    }
    private static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * {8, 5, 2, 9, 5, 6, 3};
     * {8, 5, 2, 3, 5, 6, 9};
     */
}
