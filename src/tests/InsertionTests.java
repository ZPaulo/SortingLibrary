
package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sort.InsertionSort;

public class InsertionTests extends SortTester {

	

	/**
	 * Test method for {@link sort.InsertionSort#sort(int[])}.
	 */
	@Test
	public void testSort() {
		int a1[] = { 5, 4, 3, 2, 1 };
		int a2[] = a1.clone();
		InsertionSort.sort(a1);
		
		assertTrue(ordered(a1));
		assertTrue(sameArray(a1, a2));

	}

}
