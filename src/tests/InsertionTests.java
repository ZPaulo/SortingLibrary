
package tests;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import sort.Insertion;

public class InsertionTests extends SortTester {

	/**
	 * Test method for {@link sort.Insertion#sort(int[])}.
	 */
	@Test
	public void testSortIntArray() {
		int a1[] = { 5, 4, 3, 2, 1 };
		int a2[] = a1.clone();
		Insertion.sort(a1);
		assertTrue(ordered(a1));
		assertTrue(sameArray(a1, a2));

		int a3[] = {};
		int a4[] = a3.clone();
		Insertion.sort(a3);
		assertTrue(ordered(a3));
		assertTrue(sameArray(a3, a4));

		int a5[] = { 1, 2, 3, 4, 5 };
		int a6[] = a5.clone();
		Insertion.sort(a5);
		assertTrue(ordered(a5));
		assertTrue(sameArray(a5, a6));
	}

	void testSorting(int[] original) {
		int sorted[] = original.clone();
		int temp[] = original.clone();
		assertTrue(Insertion.sort(temp, false) == null);
		assertTrue(ordered(temp));
		assertTrue(sameArray(temp, original));
		int positionsArray[] = Insertion.sort(sorted, true);
		assertTrue(ordered(sorted));
		assertTrue(sameArray(sorted, original));
		assertTrue(positions(original, sorted, positionsArray));

	}

	/**
	 * Test method for {@link sort.Insertion#sort(int[],boolean)}.
	 */
	@Test
	public void testSortIntArrayBoolean() {
		testSorting(new int[] { 5, 4, 3, 2, 1 });
		testSorting(new int[] {});
		testSorting(new int[] { 1, 2, 3, 4, 5 });
		testSorting(new int[] { 1, 2, 3, 4, 4, 5 });
	}

}
