import java.util.ArrayList;

public class MiddleNode {

    // This is an input class. Do not edit.
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public LinkedList middleNode(LinkedList linkedList) {

        ArrayList<LinkedList> arrayList = new ArrayList<>();
        arrayList.add(linkedList);
        while(linkedList.next != null){
            arrayList.add(linkedList.next);
            linkedList.next = linkedList.next.next;
        }
        return arrayList.get(arrayList.size() / 2);
    }


}
