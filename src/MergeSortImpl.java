public class MergeSortImpl {

    public static int[] mergeSort(int[] array) {

        //base case here
        if(array.length == 1)
            return array;

        int midIndex = array.length / 2;
        int[] leftArray = new int[midIndex];
        int[] rightArray = new int[array.length - midIndex];

        for(int i = 0; i < midIndex; i++){
            leftArray[i] = array[i];
        }
        for(int i = 0; i < rightArray.length; i++){
            rightArray[i] = array[midIndex];
            midIndex++;
        }

        mergeSort(leftArray);
        mergeSort(rightArray);

        mergeSort(array, leftArray, rightArray);
        // Write your code here.
        return array;
    }

    public static void mergeSort(int[] array, int[] leftArray, int[] rightArray){

        int mainIndex = 0, leftIndex = 0, rightIndex = 0;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length){
            if (leftArray[leftIndex] <= rightArray[rightIndex]){
                array[mainIndex] = leftArray[leftIndex];
                mainIndex++;
                leftIndex++;
            }else{
                array[mainIndex] = rightArray[rightIndex];
                mainIndex++;
                rightIndex++;
            }
        }
        while(leftIndex < leftArray.length){
            array[mainIndex] = leftArray[leftIndex];
            mainIndex++;
            leftIndex++;
        }
        while(rightIndex < rightArray.length){
            array[mainIndex] = rightArray[rightIndex];
            mainIndex++;
            rightIndex++;
        }
    }
}
