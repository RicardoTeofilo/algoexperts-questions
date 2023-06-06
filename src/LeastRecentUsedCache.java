import java.util.Hashtable;

/**
 * <div class="html">
 * <h2>LRU Cache</h2>
 * <p>
 *   Implement an <span>LRUCache</span> class for a Least Recently Used (LRU)
 *   cache. The class should support:
 * </p>
 * <ul>
 *   <li>
 *     Inserting key-value pairs with the <span>insertKeyValuePair</span> method.
 *   </li>
 *   <li>
 *     Retrieving a key's value with the <span>getValueFromKey</span> method.
 *   </li>
 *   <li>
 *     Retrieving the most recently used (the most recently inserted or
 *     retrieved) key with the
 *     <span>getMostRecentKey</span> method.
 *   </li>
 * </ul>
 * <p>
 *   Each of these methods should run in constant time.
 * </p>
 * <p>
 *   Additionally, the <span>LRUCache</span> class should store a
 *   <span>maxSize</span> property set to the size of the cache, which is passed in
 *   as an argument during instantiation. This size represents the maximum number
 *   of key-value pairs that the cache can store at once. If a key-value pair is
 *   inserted in the cache when it has reached maximum capacity, the least recently
 *   used key-value pair should be evicted from the cache and no longer
 *   retrievable; the newly added key-value pair should effectively replace it.
 * </p>
 * <p>
 *   Note that inserting a key-value pair with an already existing key should
 *   simply replace the key's value in the cache with the new value and shouldn't
 *   evict a key-value pair if the cache is full. Lastly, attempting to retrieve a
 *   value from a key that isn't in the cache should return <span>None</span> /
 *   <span>null</span>.
 * </p>
 * <h3>Sample Usage</h3>
 * <pre><span class="CodeEditor-promptComment">// All operations below are performed sequentially.</span>
 * <span class="CodeEditor-promptParameter">LRUCache</span>(3): - <span class="CodeEditor-promptComment">// instantiate an LRUCache of size 3</span>
 * <span class="CodeEditor-promptParameter">insertKeyValuePair</span>("b", 2): -
 * <span class="CodeEditor-promptParameter">insertKeyValuePair</span>("a", 1): -
 * <span class="CodeEditor-promptParameter">insertKeyValuePair</span>("c", 3): -
 * <span class="CodeEditor-promptParameter">getMostRecentKey</span>(): "c" <span class="CodeEditor-promptComment">// "c" was the most recently inserted key</span>
 * <span class="CodeEditor-promptParameter">getValueFromKey</span>("a"): 1
 * <span class="CodeEditor-promptParameter">getMostRecentKey</span>(): "a" <span class="CodeEditor-promptComment">// "a" was the most recently retrieved key</span>
 * <span class="CodeEditor-promptParameter">insertKeyValuePair</span>("d", 4): - <span class="CodeEditor-promptComment">// the cache had 3 entries; the least recently used one is evicted</span>
 * <span class="CodeEditor-promptParameter">getValueFromKey</span>("b"): None <span class="CodeEditor-promptComment">// "b" was evicted in the previous operation</span>
 * <span class="CodeEditor-promptParameter">insertKeyValuePair</span>("a", 5): - <span class="CodeEditor-promptComment">// "a" already exists in the cache so its value just gets replaced</span>
 * <span class="CodeEditor-promptParameter">getValueFromKey</span>("a"): 5
 * </pre>
 * </div>
 */
public class LeastRecentUsedCache {
    static class LRUCache {
        int maxSize;
        Hashtable<String, Node> hashCache;
        DoublyLinkedList linkedList;

        public LRUCache(int maxSize) {
            this.maxSize = maxSize > 1 ? maxSize : 1;
            this.hashCache = new Hashtable<>(this.maxSize);
            this.linkedList = new DoublyLinkedList();
        }
        public void insertKeyValuePair(String key, int value) {

            if(hashCache.containsKey(key)){
                Node node = hashCache.get(key);
                node.value = value;
                linkedList.setHead(node);
            }else {
                if(hashCache.size() == maxSize){
                    hashCache.remove(linkedList.tail.key);
                    linkedList.remove(linkedList.tail);
                }
                Node newNode = new Node(key, value);
                linkedList.setHead(newNode);
                hashCache.put(key, newNode);
            }

        }
        public LRUResult getValueFromKey(String key) {

            if(!hashCache.containsKey(key))
                return null;

            Node node = hashCache.get(key);
            LRUResult lruResult = new LRUResult(true, node.value);
            linkedList.setHead(node);
            return lruResult;
        }
        public String getMostRecentKey() {
            return linkedList.head.key;
        }
    }

    static class LRUResult {
        boolean found;
        int value;

        public LRUResult(boolean found, int value) {
            this.found = found;
            this.value = value;
        }
    }

    /**
     * This DoublyLinkedList class was taken from the Double link list
     * implementation problem.
     */
    static class DoublyLinkedList {
        public Node head;
        public Node tail;

        public void setHead(Node node) {
            if(this.head == null){
                this.head = node;
                this.tail = node;
                return;
            }
            insertBefore(this.head, node);
        }
        public void setTail(Node node) {
            if(this.tail == null){
                this.head = node;
                this.tail = node;
                return;
            }
            insertAfter(this.tail, node);
        }
        public void insertBefore(Node node, Node nodeToInsert) {
            if(nodeToInsert == head && nodeToInsert == tail)
                return;
            //remove the node
            remove(nodeToInsert);

            nodeToInsert.prev = node.prev;
            nodeToInsert.next = node;
            if(node.prev == null){
                //node is the head, update the head
                this.head = nodeToInsert;
            }else{
                node.prev.next = nodeToInsert;
            }
            node.prev = nodeToInsert;

        }
        public void insertAfter(Node node, Node nodeToInsert) {

            if(nodeToInsert == head && nodeToInsert == tail)
                return;
            remove(nodeToInsert);
            nodeToInsert.prev = node;
            nodeToInsert.next = node.next;

            if(node.next == null){
                //this is the tail node, update the tail
                this.tail = nodeToInsert;
            }else{
                node.next.prev = nodeToInsert;
            }
            node.next = nodeToInsert;
        }
        public void remove(Node node) {
            if(node == this.head)
                this.head = this.head.next;
            if(node == this.tail)
                this.tail = this.tail.prev;
            removeNodeLinkage(node);
        }
        private void removeNodeLinkage(Node node){
            //remove the node's prev linkage
            if(node.prev != null)
                node.prev.next = node.next;
            //remove the node's next linkage
            if(node.next != null)
                node.next.prev = node.prev;
            node.prev = null;
            node.next = null;
        }
    }

    static class Node{
        String key;
        int value;
        Node next;
        Node prev;

        public Node() {}

        public Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}
