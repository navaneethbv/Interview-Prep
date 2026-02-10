package Practice;
import org.junit.Assert;
import org.junit.Test;

public class LRUCacheTest{

    @Test
    public void test() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.set(2, 1);
        lruCache.set(1, 1);
        lruCache.set(2, 3);
        lruCache.set(4, 1);

        Assert.assertEquals(-1, lruCache.get(1));
        Assert.assertEquals(3, lruCache.get(2));
    }
}