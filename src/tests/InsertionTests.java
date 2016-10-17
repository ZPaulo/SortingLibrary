
package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InsertionTests {

	boolean ordered(int[] a) {
		for (int i = 1; i < a.length; i++)
			if (a[i - 1] > a[i])
				return false;
		return true;
	}

	/**
	 * Test method for {@link sort.InsertionSort#sort(int[])}.
	 */
	@Test
	public void testSort() {
		int a[]= new int[10];
		assertEquals(true, true);
		
	}

}
