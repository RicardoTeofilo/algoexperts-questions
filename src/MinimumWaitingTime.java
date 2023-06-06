import java.util.Arrays;

public class MinimumWaitingTime {


    //O(n Logn) time / O(1) space
    public static int minimumWaitingTime(int[] queries) {

        //First, let's sort the array
        Arrays.sort(queries);

        int totalWaitingTime = 0;
        for(int i = 0; i < queries.length - 1; i++){
            int thisWaitingTime = queries[i];
            totalWaitingTime += (queries.length - 1 - i) * thisWaitingTime;
        }
        return totalWaitingTime;
    }
}
