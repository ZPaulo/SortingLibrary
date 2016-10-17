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
		
		for (int i : a1) {
			System.out.println(i);
		}
		assertTrue(ordered(a1));
		assertTrue(sameArray(a1, a2));
	}

}
