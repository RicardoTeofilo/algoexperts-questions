import java.util.HashMap;
import java.util.HashSet;

/**
 * <div class="html">
 *   <h3>Common Characters</h3>
 *   <p>
 *     Write a function that takes in a non-empty list of non-empty strings and
 *     returns a list of characters that are common to all strings in the list,
 *     ignoring multiplicity.
 *   </p>
 *
 *   <p>
 *     Note that the strings are not guaranteed to only contain alphanumeric characters. The list
 *     you return can be in any order.
 *   </p>
 *
 *   <h3>Sample Input</h3>
 *   <pre><span class="CodeEditor-promptParameter">strings</span> = ["abc", "bcd", "cbaccd"]
 * </pre>
 *   <h3>Sample Output</h3>
 *   <pre>["b", "c"] <span class="CodeEditor-promptComment">// The characters could be ordered differently.</span>
 * </pre>
 * </div>
 */
public class CommonCharacters {

    public String[] commonCharacters(String[] strings) {

        HashMap<Character, Integer> charsMap = new HashMap<>();
        for(int i = 0; i < strings.length; i++){
            String thisString = strings[i];
            //Using this set for the chars in this string
            //we can eliminate the duplicate chars in the same string
            HashSet<Character> uniqueCharsSet = new HashSet<>();
            char[] chars = thisString.toCharArray();
            for(char thisChar: chars){
                uniqueCharsSet.add(thisChar);
            }

            for(Character thisUniqueChar: uniqueCharsSet){
                if(charsMap.containsKey(thisUniqueChar)){
                    Integer existingCharCount = charsMap.get(thisUniqueChar);
                    existingCharCount++;
                    charsMap.put(thisUniqueChar, existingCharCount);
                }else{
                    charsMap.put(thisUniqueChar, 1);
                }
            }
        }

        //Here I have a map with all the individual characters counted.
        //A character to be common in all strings
        int requiredNumberOfCharsFound = strings.length;
        HashSet<String> commonCharsSet = new HashSet<>();
        for(Character foundChar: charsMap.keySet()){
            if(charsMap.get(foundChar) == requiredNumberOfCharsFound)
                commonCharsSet.add(Character.toString(foundChar));
        }

        return commonCharsSet.toArray(String[]::new);
    }
}
