public class SumOfLinkedLists {
    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList sumOfLinkedLists(LinkedList linkedListOne, LinkedList linkedListTwo) {

        String firstNumber = "";
        String secondNumber = "";

        while (linkedListOne != null){
            firstNumber = Integer.toString(linkedListOne.value) + firstNumber;
            linkedListOne = linkedListOne.next;
        }
        while (linkedListTwo != null){
            secondNumber = Integer.toString(linkedListTwo.value) + secondNumber;
            linkedListTwo = linkedListTwo.next;
        }

        int finalSum = Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        char[] sumCharsArray = Integer.toString(finalSum).toCharArray();
        LinkedList finalSumLinkedList = null;
        LinkedList thisNode = null;
        for(int i = sumCharsArray.length - 1; i >= 0; i--){
            if(finalSumLinkedList == null){
                finalSumLinkedList = new LinkedList(Integer.parseInt(String.valueOf(sumCharsArray[i])));
                thisNode = finalSumLinkedList;
            }

            LinkedList nextNode = null;
            if (i >0){
                nextNode = new LinkedList(Integer.parseInt(String.valueOf(sumCharsArray[i - 1])));
                if(finalSumLinkedList.next == null)
                    finalSumLinkedList.next = nextNode;
                thisNode.next = nextNode;
                thisNode = nextNode;
            }else{
                thisNode.next = null;
            }

        }
        return finalSumLinkedList;
    }
}
