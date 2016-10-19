package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sort.Merge;

public class MergeTests extends SortTester {

	/**
	 * Test method for {@link sort.Merge#sort(int[])}.
	 */
	@Test
	public void testSortIntArray() {
		int a1[] = { 5,5, 4, 3, 2, 1 };
		int a2[] = a1.clone();
		Merge.sort(a1);
		
		assertTrue(ordered(a1));
		assertTrue(sameArray(a1, a2));
		
		int a3[] = {1, 2, 3, 4 ,5,5};
		Merge.sort(a3);
		
		assertTrue(ordered(a3));
		assertTrue(sameArray(a1, a3));
		
		int a4[] = {};
		int a5[] = a4.clone();
		Merge.sort(a4);
		
		assertTrue(ordered(a4));
		assertTrue(sameArray(a4, a5));
	}
	
	/**
	 * Test method for {@link sort.Merge#sort(int[], boolean)}.
	 */
	@Test
	public void testSortIntArrayBoolean() {
		int a1[] = { 5,5, 4, 3, 2, 1 };
		int a2[] = a1.clone();
		int a9[] = a1.clone();
		int a6[] = Merge.sort(a1, true);
		
		
		assertTrue(ordered(a1));
		assertTrue(sameArray(a1, a2));
		assertTrue(positions(a2, a1, a6));
		assertTrue(Merge.sort(a9,false) == null);
		
		int a3[] = {1, 2, 3, 4 ,5,5};
		int a7[] = Merge.sort(a3, true);
		
		assertTrue(ordered(a3));
		assertTrue(sameArray(a1, a3));
		assertTrue(positions(a3, a1, a7));
		
		int a4[] = {};
		int a5[] = a4.clone();
		int a8[] = Merge.sort(a4,true);
		
		assertTrue(ordered(a4));
		assertTrue(sameArray(a4, a5));
		assertTrue(positions(a4, a5, a8));
	}

}
