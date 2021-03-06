package tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TesterTester {

	@Test
	public void testOrdered() {
		int a1[] = { 1, 2, 3, 4, 5 };
		assertTrue(SortTester.ordered(a1));

		int a2[] = { 5, 4, 3, 2, 1 };
		assertFalse(SortTester.ordered(a2));

		int a3[] = {};
		assertTrue(SortTester.ordered(a3));

		int a4[] = { 1, 2, 3, 4, 4, 5 };
		assertTrue(SortTester.ordered(a4));

		int a5[] = { 1, 2, 5, 4, 5 };
		assertFalse(SortTester.ordered(a5));
	}

	@Test
	public void testSameArray() {

		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = a1.clone();

		assertTrue(SortTester.sameArray(a1, a2));

		int a3[] = { 1, 2, 3, 4 };

		assertFalse(SortTester.sameArray(a1, a3));

		int a4[] = { 1, 2, 3, 4, 4 };

		assertFalse(SortTester.sameArray(a1, a4));

		int a5[] = { 1, 2, 3, 4, 4, 5 };
		int a6[] = { 1, 2, 3, 4, 5, 5 };

		assertFalse(SortTester.sameArray(a5, a6));
		
		int a7[] = {};
		int a8[] = a7.clone();
		assertTrue(SortTester.sameArray(a7, a8));
	}
	
	@Test
	public void goodPositions() {
		int a1[] = {2,3,4,5};
		int a2[] = {2,3,4,5};
		int a3[] = {0,1,2,3};
		
		assertTrue(SortTester.positions(a1, a2, a3));
		
		int a4[] = {5,4,3,2};
		int a5[] = {2,3,4,5};
		int a6[] = {3,2,1,0};
		
		assertTrue(SortTester.positions(a4, a5, a6));
		
		assertFalse(SortTester.positions(a4, a5, a3));
		
		
	}

}
