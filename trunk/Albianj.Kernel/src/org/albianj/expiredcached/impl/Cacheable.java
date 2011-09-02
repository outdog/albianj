package org.albianj.expiredcached.impl;

/**
 * Interface that defines the necessary behavior for objects added to a Cache.
 * Objects only need to know how big they are (in bytes). That size should be
 * considered to be a best estimate of how much memory the Object occupies and
 * may be based on empirical trials or dynamic calculations.
 * <p>
 * 
 * While the accuracy of the size calculation is important, care should be taken
 * to minimize the computation time so that cache operations are speedy.
 * 
 * @author Jive Software
 * @see org.LocalCache.util.Cache
 */
public interface Cacheable extends java.io.Serializable {

	/**
	 * Returns the approximate size of the Object in bytes. The size should be
	 * considered to be a best estimate of how much memory the Object occupies
	 * and may be based on empirical trials or dynamic calculations.
	 * <p>
	 * 
	 * @return the size of the Object in bytes.
	 */
	public int getCachedSize();
}

// Read more:
// http://kickjava.com/src/org/jivesoftware/util/Cacheable.java.htm#ixzz1WZCe2EHe
