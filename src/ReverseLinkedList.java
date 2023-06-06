/**
 * <div class="TLQjVhfBX4gHWkO9qYsJ ae-workspace-dark"><div class="html">
 * <h2>Reverse Linked List</h2>
 * <p>
 *   Write a function that takes in the head of a Singly Linked List, reverses the
 *   list in place (i.e., doesn't create a brand new list), and returns its new head.
 * </p>
 * <p>
 *   Each <span>LinkedList</span> node has an integer <span>value</span> as well as
 *   a <span>next</span> node pointing to the next node in the list or to
 *   <span>None</span> / <span>null</span> if it's the tail of the list.
 * </p>
 * <p>
 *   You can assume that the input Linked List will always have at least one node; in other
 *   words, the head will never be <span>None</span> / <span>null</span>.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span class="CodeEditor-promptParameter">head</span> = 0 -&gt; 1 -&gt; 2 -&gt; 3 -&gt; 4 -&gt; 5 <span class="CodeEditor-promptComment">// the head node with value 0</span>
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>5 -&gt; 4 -&gt; 3 -&gt; 2 -&gt; 1 -&gt; 0 <span class="CodeEditor-promptComment">// the new head node with value 5</span>
 * </pre>
 * </div></div>
 */
public class ReverseLinkedList {

    public static LinkedList reverseLinkedList(LinkedList head) {

        LinkedList firstNode = null;
        LinkedList secondNode = null;
        LinkedList thirdNode = null;

        if (head != null)
            firstNode = head;

        if(head.next != null)
            secondNode = head.next;
        else
            return head; //this is single node list

        if (head.next.next != null){
            thirdNode = head.next.next;
        }else {
            secondNode.next = firstNode;
            head = secondNode;
            head.next = firstNode;
            firstNode.next = null;
            return head; // this is a two node list
        }
        head.next = null;

        while (secondNode != null){

            secondNode.next = firstNode;
            head = secondNode;
            head.next = firstNode;
            firstNode = secondNode;
            secondNode = thirdNode;

            if(thirdNode != null) {
                thirdNode = thirdNode.next;
            }
        }
        return head;
    }

    public static LinkedList reverseLinkedListRecursive(LinkedList head) {
        return reverseLinkedListRecursive(null, head);
    }

    public static LinkedList reverseLinkedListRecursive(LinkedList previous, LinkedList current) {
        if(current == null)
            return previous;

        LinkedList next = current.next;
        current.next = previous;
        return reverseLinkedListRecursive(current, next);
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
