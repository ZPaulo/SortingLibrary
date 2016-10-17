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
	public void testSort() {
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

}
