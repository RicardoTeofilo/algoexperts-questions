import java.util.HashMap;

/**
 * <div class="html">
 * <h3>Generate Document</h3>
 * <p>
 *   You're given a string of available characters and a string representing a
 *   document that you need to generate. Write a function that determines if you
 *   can generate the document using the available characters. If you can generate
 *   the document, your function should return <span>true</span>; otherwise, it
 *   should return <span>false</span>.
 * </p>
 * <p>
 *   You're only able to generate the document if the frequency of unique
 *   characters in the characters string is greater than or equal to the frequency
 *   of unique characters in the document string. For example, if you're given
 *   <span>characters = "abcabc"</span> and <span>document = "aabbccc"</span> you
 *   <b>cannot</b> generate the document because you're missing one <span>c</span>.
 * </p>
 * <p>
 *   The document that you need to create may contain any characters, including
 *   special characters, capital letters, numbers, and spaces.
 * </p>
 * <p>Note: you can always generate the empty string (<span>""</span>).</p>
 * <h3>Sample Input</h3>
 * <pre><span class="CodeEditor-promptParameter">characters</span> = "Bste!hetsi ogEAxpelrt x "
 * <span class="CodeEditor-promptParameter">document</span> = "AlgoExpert is the Best!"
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>true
 * </pre>
 * </div>
 */
public class GenerateDocument {

    public boolean generateDocument(String characters, String document) {

        HashMap<Character, Integer> charsMap = new HashMap<>();
        HashMap<Character, Integer> documentMap = new HashMap<>();

        for(Character thisChar: characters.toCharArray()){
            if(charsMap.containsKey(thisChar)){
                Integer thisCharCount = charsMap.get(thisChar);
                thisCharCount++;
                charsMap.put(thisChar, thisCharCount);
            }else {
                charsMap.put(thisChar, 1);
            }
        }

        for(Character thisChar: document.toCharArray()){
            if(!charsMap.containsKey(thisChar))
                return false;

            if(documentMap.containsKey(thisChar)){
                Integer thisCharCount = documentMap.get(thisChar);
                thisCharCount++;
                documentMap.put(thisChar, thisCharCount);
            }else {
                documentMap.put(thisChar, 1);
            }
        }

        for(Character documentChar: documentMap.keySet()){
            if(!charsMap.containsKey(documentChar))
                return false;

            if(charsMap.get(documentChar) < documentMap.get(documentChar))
                return false;
        }

        return true;
    }

    /**
     * This is a simpler algorithm using HashMap.merge
     * First populate the Chars Map with each char and its count
     * Then remove each character count from Document characters.
     * If charsMap does not contain the char or reaches the count of zero
     * return false. Otherwise, return true
     */
    public boolean generateDocumentImproved(String characters, String document) {

        HashMap<Character, Integer> charsMap = new HashMap<>();

        for(Character thisChar: characters.toCharArray()){
            charsMap.merge(thisChar, 1, Integer::sum);
        }

        for(Character thisChar: document.toCharArray()){
            if(!charsMap.containsKey(thisChar) || charsMap.get(thisChar) == 0)
                return false;

            charsMap.merge(thisChar, -1, Integer::sum);
        }

        return true;
    }
}
