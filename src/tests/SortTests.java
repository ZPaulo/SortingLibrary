package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sort.Merge;
import sort.Sort;

public class SortTests extends SortTester {

	/**
	 * Test method for {@link sort.Sort#sort(int[])}.
	 */
	@Test
	public void testSortIntArray() {
		int a1[] = { 5, 4, 3, 2, 1 };
		int a2[] = a1.clone();
		Sort.sort(a1);
		
		assertTrue(ordered(a1));
		assertTrue(sameArray(a1, a2));
		
		int a3[] = {1, 2, 3, 4 ,5,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
		int a4[] = a3.clone();
		Sort.sort(a3);
		
		assertTrue(ordered(a3));
		assertTrue(sameArray(a4, a3));
		
		int a5[] = {};
		int a6[] = a5.clone();
		Merge.sort(a5);
		
		assertTrue(ordered(a5));
		assertTrue(sameArray(a6, a5));
	}
	
	/**
	 * Test method for {@link sort.Sort#sort(int[],boolean)}.
	 */
	@Test
	public void testSortIntArrayBoolean() {
		int a1[] = { 5, 4, 3, 2, 1 };
		int a2[] = a1.clone();
		int a7[] = 	Sort.sort(a1,true);
	
		
		assertTrue(ordered(a1));
		assertTrue(sameArray(a1, a2));
		assertTrue(positions(a2, a1, a7));
		
		int a3[] = {1, 2, 3, 4 ,5,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
		int a4[] = a3.clone();
		int a10[] = a3.clone();
		int a8[] = Sort.sort(a3, true);
		
		
		assertTrue(ordered(a3));
		assertTrue(sameArray(a4, a3));
		assertTrue(positions(a4, a3, a8));
		assertTrue(Merge.sort(a10,false) == null);
		
		int a5[] = {};
		int a6[] = a5.clone();
		int a9[] = Merge.sort(a5,true);
		
		assertTrue(ordered(a5));
		assertTrue(sameArray(a6, a5));
		assertTrue(positions(a6, a5, a9));
	}

}
