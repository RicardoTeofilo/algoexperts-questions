import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MissingNumbers {
    public int[] missingNumbers(int[] nums) {

        ArrayList<Integer> missingNumbers = new ArrayList<>();

        Set<Integer> numsSet = IntStream.of(nums).boxed().collect(Collectors.toSet());
        for(int i = 1; i < nums.length + 3; i++){
            if(!numsSet.contains(i)){
                missingNumbers.add(i);
            }
        }

        int[] missingNumbersArray = missingNumbers.stream().mapToInt(i -> i).toArray();
        return missingNumbersArray;
    }

    public int[] missingNumbersUsingMath(int[] nums) {

        ArrayList<Integer> missingNumbers = new ArrayList<>();

        Set<Integer> numsSet = IntStream.of(nums).boxed().collect(Collectors.toSet());
        for(int i = 1; i < nums.length + 3; i++){
            if(!numsSet.contains(i)){
                missingNumbers.add(i);
            }
        }

        int[] missingNumbersArray = missingNumbers.stream().mapToInt(i -> i).toArray();
        return missingNumbersArray;
    }

}
