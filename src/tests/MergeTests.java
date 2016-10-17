package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sort.Merge;

public class MergeTests extends SortTester {

	/**
	 * Test method for {@link sort.Merge#sort(int[])}.
	 */
	@Test
	public void testSort() {
		int a1[] = { 5, 4, 3, 2, 1 };
		int a2[] = a1.clone();
		Merge.sort(a1);
		
		assertTrue(ordered(a1));
		assertTrue(sameArray(a1, a2));
		
		int a3[] = {1, 2, 3, 4 ,5};
		Merge.sort(a3);
		
		assertTrue(ordered(a3));
		assertTrue(sameArray(a1, a3));
		
		int a4[] = {};
		int a5[] = a4.clone();
		Merge.sort(a4);
		
		assertTrue(ordered(a4));
		assertTrue(sameArray(a4, a5));
	}

}
