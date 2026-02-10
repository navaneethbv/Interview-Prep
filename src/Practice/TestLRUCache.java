package Practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dzhou on 10/17/2014.
 */
public class TestLRUCache {

    @org.junit.Test
    public void testLRUCache1() {
        // 2,[set(2,1),set(1,1),get(2),set(4,1),get(1),get(2)]
        LRUCache lruCache = new LRUCache(2);
        lruCache.set(2, 1);
        lruCache.set(1, 1);
        Assert.assertEquals(lruCache.get(2), 1);
        lruCache.set(4, 1);
        Assert.assertEquals(lruCache.get(1), -1);
        Assert.assertEquals(lruCache.get(2), 1);
    }

    @Test
    public void testLRUCache2() {
        // 2,[set(2,1),set(1,1),set(2,3),set(4,1),get(1),get(2)]
        LRUCache lruCache = new LRUCache(2);
        lruCache.set(2, 1);
        lruCache.set(1, 1);
        lruCache.set(2, 3);
        lruCache.set(4, 1);
        Assert.assertEquals(lruCache.get(1), -1);
        Assert.assertEquals(lruCache.get(2), 3);
    }
}