
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

		int a3[] = {};
		int a4[]=a3.clone();
		InsertionSort.sort(a3);
		assertTrue(ordered(a3));
		assertTrue(sameArray(a3, a4));
		
		int a5[] = {1,2,3,4,5};
		int a6[] = a5.clone();
		InsertionSort.sort(a5);
		assertTrue(ordered(a5));
		assertTrue(sameArray(a5, a6));
	}

}
