import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSetAlgorithm {

    /**
     * The first implementation will use binary logic and
     * the fact that the powerset of a set is has size
     * ps(n) = 2^n
     *
     * If we take for example array = [1, 2, 3]. If we use the index of the array
     * as the position of the binary number it would represent, where 1 means we pick the number
     * and 0 we don't pick the number, we would end up with the following combinations
     *
     * 000 = 0 = []
     * 001 = 1 = [1]
     * 010 = 2 = [2]
     * 011 = 3 = [1, 2]
     * 100 = 4 = [3]
     * 101 = 5 = [1, 3]
     * 110 = 6 = [2, 3]
     * 111 = 7 = [1, 2, 3]
     * @param array
     * @return
     */
    public static List<List<Integer>> powerset(List<Integer> array) {
        List<List<Integer>> finalList = new ArrayList<>();
        //Always add the empty list
        finalList.add(Collections.emptyList());
        double powerSetSize = Math.pow(2, array.size());

        for(int counter = 0; counter < powerSetSize; counter++){
            List<Integer> thisList = new ArrayList<>();
            for(int j = 0; j < array.size(); j++){
                if((counter & (1 << j)) > 0){
                    thisList.add(array.get(j));
                }
            }
            if(!thisList.isEmpty())
                finalList.add(thisList);
        }
        return finalList;
    }

    public static List<List<Integer>> powersetIterative(List<Integer> array) {
        List<List<Integer>> allSubSetsList = new ArrayList<>();
        allSubSetsList.add(Collections.emptyList());

        for(int i = 0; i < array.size(); i++){
            int size = allSubSetsList.size();
            for(int j = 0; j < size; j++){
                List<Integer> thisSubsetList = new ArrayList<>(allSubSetsList.get(j));
                thisSubsetList.add(array.get(i));
                allSubSetsList.add(thisSubsetList);
            }
        }
        return allSubSetsList;
    }

    /**
     * This is the recursive implementation based on the recursive video explanation on the
     * algo experts video expl section.
     *
     */
    public static List<List<Integer>> powersetRecursive(List<Integer> array) {
        return powersetRecursive(array, null);
    }

    /**
     * * This is the recursive implementation based on the recursive video explanation on the
     * algo experts video expl section.
     * #
     * array = [1, 2, 3, 4]
     * idx = null -> 3
     * elementToAdd = 4
     * allSubSetsList = powerSetRecursive (array = [1, 2, 3, 4], idx = 3)
     *
     * ##
     * array = [1, 2, 3, 4]
     * idx = null -> 3
     *      * elementToAdd = 4
     *      * allSubSetsList = powerSetRecursive (array = [1, 2, 3, 4], idx = 3)
     */
    public static List<List<Integer>> powersetRecursive(List<Integer> array, Integer idx) {

        if(array.isEmpty()) {
            List<List<Integer>> initialSubSetsList = new ArrayList<>();
            initialSubSetsList.add(new ArrayList<>());
            return initialSubSetsList;
        }

        if(idx == null){
            idx = array.size() - 1;
        } else if (idx < 0) {
            List<List<Integer>> initialSubSetsList = new ArrayList<>();
            initialSubSetsList.add(new ArrayList<>());
            return initialSubSetsList;
        }
        Integer elementToAdd = array.get(idx);
        List<List<Integer>> allSubSetsList = powersetRecursive(array, idx - 1);

        int size = allSubSetsList.size();
        for(int j = 0; j < size; j++){
            List<Integer> thisSubsetList = new ArrayList<>(allSubSetsList.get(j));
            thisSubsetList.add(elementToAdd);
            allSubSetsList.add(thisSubsetList);
        }
        return allSubSetsList;
    }
}
