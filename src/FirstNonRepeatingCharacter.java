import java.util.HashMap;

/**
 * <div class="html">
 * <h3>First Non-Repeating Character</h3>
 * <p>
 *   Write a function that takes in a string of lowercase English-alphabet letters
 *   and returns the index of the string's first non-repeating character.
 * </p>
 * <p>
 *   The first non-repeating character is the first character in a string that
 *   occurs only once.
 * </p>
 * <p>
 *   If the input string doesn't have any non-repeating characters, your function
 *   should return <span>-1</span>.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span class="CodeEditor-promptParameter">string</span> = "abcdcaf"
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>1 <span class="CodeEditor-promptComment">// The first non-repeating character is "b" and is found at index 1.</span>
 * </pre>
 * </div>
 */
public class FirstNonRepeatingCharacter {

    public int firstNonRepeatingCharacter(String string) {
        HashMap<Character, Integer> charsMap = new HashMap<>();
        for(int i = 0; i < string.length(); i++){
            Character thisChar = string.charAt(i);
            if(charsMap.containsKey(thisChar)){
                Integer currentCount = charsMap.get(thisChar);
                currentCount++;
                charsMap.put(thisChar, currentCount);
            }else {
                charsMap.put(thisChar, 1);
            }
        }

        for(int i = 0; i < string.length(); i++){
            Integer charCount = charsMap.getOrDefault(string.charAt(i), 0);
            if(charCount == 1)
                return i;
        }

        return -1;
    }
}

