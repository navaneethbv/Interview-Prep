package Practice;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by dzhou on 10/17/2014.
 */
/**
 * Implementation of Test LRU Cache algorithm/data structure.
 * This class provides methods to solve related problems efficiently.
 *
 * @author Navaneeth Rao
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
    /**
     * Performs testLRUCache2 operation.
     *
     */
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

	/**
	 * Main method to test the functionality of the class with various test cases.
	 *
	 * @param args command line arguments (not used)
	 */
	public static void main(String[] args) {
		// Test Case 1: Basic functionality test
		System.out.println("Test 1: Basic test");
	}

}