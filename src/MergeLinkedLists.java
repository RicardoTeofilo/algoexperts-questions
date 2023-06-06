/**
 * <div class="html">
 * <h2>Merge Linked Lists</h2>
 * <p>
 *   Write a function that takes in the heads of two Singly Linked Lists that are
 *   in sorted order, respectively. The function should merge the lists in place
 *   (i.e., it shouldn't create a brand new list) and return the head of the merged
 *   list; the merged list should be in sorted order.
 * </p>
 * <p>
 *   Each <span>LinkedList</span> node has an integer <span>value</span> as well as
 *   a <span>next</span> node pointing to the next node in the list or to
 *   <span>None</span> / <span>null</span> if it's the tail of the list.
 * </p>
 * <p>
 *   You can assume that the input linked lists will always have at least one node; in other
 *   words, the heads will never be <span>None</span> / <span>null</span>.
 * </p>
 * <h3>Sample Input</h3>
 * <pre><span class="CodeEditor-promptParameter">headOne</span> = 2 -&gt; 6 -&gt; 7 -&gt; 8 <span class="CodeEditor-promptComment">// the head node with value 2</span>
 * <span class="CodeEditor-promptParameter">headTwo</span> = 1 -&gt; 3 -&gt; 4 -&gt; 5 -&gt; 9 -&gt; 10 <span class="CodeEditor-promptComment">// the head node with value 1</span>
 * </pre>
 * <h3>Sample Output</h3>
 * <pre>1 -&gt; 2 -&gt; 3 -&gt; 4 -&gt; 5 -&gt; 6 -&gt; 7 -&gt; 8 -&gt; 9 -&gt; 10 <span class="CodeEditor-promptComment">// the new head node with value 1</span>
 * </pre>
 * </div>
 */
public class MergeLinkedLists {

    // This is an input class. Do not edit.
    public static class LinkedList {
        int value;
        LinkedList next;

        LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    /**
     * This is the first implementation and the least elegant solution.
     *
     * Here I am going to use 4 pointers. Two on the first list and two on the second.
     * I will merge the second list into the first one in order.
     * @param headOne
     * @param headTwo
     * @return
     */
    public static LinkedList mergeLinkedLists(LinkedList headOne, LinkedList headTwo) {

        LinkedList list1Pointer1 = headOne;
        LinkedList list1Pointer2 = headOne.next;
        LinkedList list2Pointer1 = headTwo;
        LinkedList list2Temp = null;

        //First case where the head on list one needs to change
        if(headTwo.value < headOne.value){
            LinkedList tempHead1 = headOne;
            headOne = list2Pointer1;
            list1Pointer2 = list1Pointer1;
            list1Pointer1 = list2Pointer1;
            list2Temp = list2Pointer1.next;
            list2Pointer1.next = tempHead1;
            list2Pointer1 = list2Temp;
        }
        while (list1Pointer1.next != null && list2Pointer1 != null){

            if(list1Pointer1.value <= list2Pointer1.value && list2Pointer1.value <= list1Pointer2.value){
                //the list 2 pointer 1 is in the interval between the list 1 pointers
                list2Temp = list2Pointer1.next;
                list2Pointer1.next = list1Pointer1.next;
                list1Pointer1.next = list2Pointer1;
                list1Pointer1 = list2Pointer1;
                list2Pointer1 = list2Temp;
            }else {
                //the list 2 pointer 1 is greater than the interval in list 1.
                //move list 1 pointers one node
                list1Pointer1 = list1Pointer2;
                list1Pointer2 = list1Pointer2.next;
            }
        }

        //check if there are elements in the second list left
        while (list2Pointer1 != null){
            list2Temp = list2Pointer1.next;
            list2Pointer1.next = list1Pointer1.next;
            list1Pointer1.next = list2Pointer1;
            list1Pointer1 = list2Pointer1;
            list2Pointer1 = list2Temp;
        }

        return headOne;
    }

    /**
     * This is the second implementation and a more elegant solution
     *
     * Here I am only using 3 pointers, two on the first list and one on
     * the second list.
     * I am also only dealing with the head setup at the return level since
     * I am not overwriting it.
     *
     * O(n + m) time -> where n = number of elements on list 1 and m = number of elements on list2
     * O(1) space -> since we are not using extra space just variables that takes constant time operations
     *
     * @param headOne
     * @param headTwo
     * @return
     */
    public static LinkedList mergeLinkedListsImproved(LinkedList headOne, LinkedList headTwo) {
        LinkedList p1 = headOne;
        LinkedList p1Prev = null;
        LinkedList p2 = headTwo;

        while (p1 != null && p2 != null){
            if(p1.value < p2.value){
                //This is the easier case, just move the first list pointers forward
                p1Prev = p1;
                p1 = p1.next;
            }else{
                if(p1Prev != null)
                    p1Prev.next = p2;
                p1Prev = p2;
                p2 = p2.next;
                p1Prev.next = p1;
            }
        }
        //If p1 has reached the end there still values in P2
        if (p1 == null && p2 != null)
            p1Prev.next = p2;

        //Here I simply return the lowest of the two heads
        return headOne.value < headTwo.value? headOne : headTwo;
    }

    /**
     * This is the third implementation using a recursive solution
     * This is almost a copy of the iterative solution, just using recursion
     * We update the pointers at the recusive call until we reach the end of the list
     *
     * O(n + m) time -> where n = number of elements on list 1 and m = number of elements on list2
     * O(n + m) space -> because of the call stack required to traverse all the elements in the worst case
     *
     * @param headOne
     * @param headTwo
     * @return
     */
    public static LinkedList mergeLinkedListsRecursive(LinkedList headOne, LinkedList headTwo) {
        mergeLinkedListsRecursive(headOne, headTwo, null);
        //Here I simply return the lowest of the two heads
        return headOne.value < headTwo.value? headOne : headTwo;
    }

    public static void mergeLinkedListsRecursive(LinkedList p1, LinkedList p2, LinkedList p1Prev) {

        //The base cases here on top
        if (p2 == null)
            return;
        if(p1 == null){
            p1Prev.next = p2;
            return;
        }
        //If we have not reached the end, keep calling the recursion
        //and updating the pointers
        if(p1.value < p2.value)
            mergeLinkedListsRecursive(p1.next, p2, p1);
        else {
            if(p1Prev != null)
                p1Prev.next = p2;
            LinkedList temp = p2.next;
            p2.next = p1;
            mergeLinkedListsRecursive(p1, temp, p2);
        }
    }

}
