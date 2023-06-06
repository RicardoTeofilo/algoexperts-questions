import org.junit.Assert;
import org.junit.Test;

public class LeastRecentUsedCacheTest {

    @Test
    public void TestCase1() {
        LeastRecentUsedCache.LRUCache lruCache = new LeastRecentUsedCache.LRUCache(3);
        lruCache.insertKeyValuePair("b", 2);
        lruCache.insertKeyValuePair("a", 1);
        lruCache.insertKeyValuePair("c", 3);
        Assert.assertTrue(lruCache.getMostRecentKey() == "c");
        Assert.assertTrue(lruCache.getValueFromKey("a").value == 1);
        Assert.assertTrue(lruCache.getMostRecentKey() == "a");
        lruCache.insertKeyValuePair("d", 4);
        var evictedValue = lruCache.getValueFromKey("b");
        Assert.assertTrue(evictedValue == null || evictedValue.found == false);
        lruCache.insertKeyValuePair("a", 5);
        Assert.assertTrue(lruCache.getValueFromKey("a").value == 5);
    }
    @Test
    public void TestCase2() {
        LeastRecentUsedCache.LRUCache lruCache = new LeastRecentUsedCache.LRUCache(4);
        lruCache.insertKeyValuePair("a", 1);
        lruCache.insertKeyValuePair("b", 2);
        lruCache.insertKeyValuePair("c", 3);
        lruCache.insertKeyValuePair("d", 4);
        Assert.assertTrue(lruCache.getValueFromKey("a").value == 1);
        Assert.assertTrue(lruCache.getValueFromKey("b").value == 2);
        Assert.assertTrue(lruCache.getValueFromKey("c").value == 3);
        Assert.assertTrue(lruCache.getValueFromKey("d").value == 4);
        lruCache.insertKeyValuePair("e", 5);
        Assert.assertTrue(lruCache.getValueFromKey("a") == null);
        Assert.assertTrue(lruCache.getValueFromKey("b").value == 2);
        Assert.assertTrue(lruCache.getValueFromKey("c").value == 3);
        Assert.assertTrue(lruCache.getValueFromKey("d").value == 4);
        Assert.assertTrue(lruCache.getValueFromKey("e").value == 5);
    }

    @Test
    public void TestCase3() {
        LeastRecentUsedCache.LRUCache lruCache = new LeastRecentUsedCache.LRUCache(1);
        Assert.assertTrue(lruCache.getValueFromKey("a") == null);
        lruCache.insertKeyValuePair("a", 1);
        Assert.assertTrue(lruCache.getValueFromKey("a").value == 1);
        lruCache.insertKeyValuePair("a", 9001);
        Assert.assertEquals(lruCache.getValueFromKey("a").value, 9001);
        lruCache.insertKeyValuePair("b", 2);
        Assert.assertTrue(lruCache.getValueFromKey("a") == null);
        Assert.assertTrue(lruCache.getValueFromKey("b").value == 2);
        lruCache.insertKeyValuePair("c", 3);
        Assert.assertTrue(lruCache.getValueFromKey("a") == null);
        Assert.assertTrue(lruCache.getValueFromKey("b") == null);
        Assert.assertTrue(lruCache.getValueFromKey("c").value == 3);
    }

    @Test
    public void TestCase4() {
        LeastRecentUsedCache.LRUCache lruCache = new LeastRecentUsedCache.LRUCache(4);
        lruCache.insertKeyValuePair("a", 1);
        lruCache.insertKeyValuePair("b", 2);
        lruCache.insertKeyValuePair("c", 3);
        lruCache.insertKeyValuePair("d", 4);
        Assert.assertTrue(lruCache.getValueFromKey("a").value == 1);
        lruCache.insertKeyValuePair("e", 5);
        Assert.assertTrue(lruCache.getValueFromKey("a").value == 1);
        Assert.assertTrue(lruCache.getValueFromKey("b") == null);
        Assert.assertTrue(lruCache.getValueFromKey("c").value == 3);
        lruCache.insertKeyValuePair("f", 5);
        Assert.assertTrue(lruCache.getValueFromKey("c").value == 3);
        Assert.assertTrue(lruCache.getValueFromKey("d") == null);
        lruCache.insertKeyValuePair("g", 5);
        Assert.assertTrue(lruCache.getValueFromKey("e") == null);
        Assert.assertTrue(lruCache.getValueFromKey("a").value == 1);
        Assert.assertTrue(lruCache.getValueFromKey("c").value == 3);
        Assert.assertTrue(lruCache.getValueFromKey("f").value == 5);
        Assert.assertTrue(lruCache.getValueFromKey("g").value == 5);
    }
}
