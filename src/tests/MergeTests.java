package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sort.Merge;

public class MergeTests extends SortTester {

	
	void testSorting(int[] original, boolean positions) {
		int sorted[] = original.clone();
		int temp[] = original.clone();
		if (positions)
			assertTrue(Merge.sort(temp, false) == null);
		else
			Merge.sort(temp);
		assertTrue(ordered(temp));
		assertTrue(sameArray(temp, original));
		if (positions) {
			int positionsArray[] = Merge.sort(sorted, true);
			assertTrue(ordered(sorted));
			assertTrue(sameArray(sorted, original));
			assertTrue(positions(original, sorted, positionsArray));
		}
	}

	/**
	 * Test method for {@link sort.Merge#sort(int[])}.
	 */
	@Test
	public void testSortIntArray() {
		testSorting(new int[] { 5, 4, 3, 2, 1 }, false);
		testSorting(new int[] {}, false);
		testSorting(new int[] { 1, 2, 3, 4, 5 }, false);
		testSorting(new int[] { 1, 2, 3, 4, 4, 5 }, false);
	}

	/**
	 * Test method for {@link sort.Merge#sort(int[],boolean)}.
	 */
	@Test
	public void testSortIntArrayBoolean() {
		testSorting(new int[] { 5, 4, 3, 2, 1 }, true);
		testSorting(new int[] {}, true);
		testSorting(new int[] { 1, 2, 3, 4, 5 }, true);
		testSorting(new int[] { 1, 2, 3, 4, 4, 5 }, true);
	}

}
