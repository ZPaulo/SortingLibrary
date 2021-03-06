package tests;

import java.util.HashMap;

public abstract class SortTester {

	static boolean ordered(int[] a) {
		for (int i = 1; i < a.length; i++)
			if (a[i - 1] > a[i])
				return false;
		return true;
	}

	static boolean positions(int[] original, int[] sorted, int[] posA) {
		for (int i = 0; i < original.length; i++) {
			if (sorted[i] != original[posA[i]])
				return false;
		}

		return true;
	}

	static boolean sameArray(int[] a1, int[] a2) {
		if (a1.length != a2.length)
			return false;
		class ElementMap extends HashMap<Integer, Integer> {
			private static final long serialVersionUID = 1L;

			@Override
			public Integer get(Object key) {
				if (containsKey(key))
					return super.get(key);
				else
					return 0;
			}
		}
		ElementMap h1, h2;
		h1 = new ElementMap();
		h2 = new ElementMap();
		for (int i = 0; i < a1.length; i++) {
			h1.put(a1[i], h1.get(a1[i]) + 1);
			h2.put(a2[i], h2.get(a2[i]) + 1);
		}
		if (h1.keySet().size() != h2.keySet().size())
			return false;
		for (int i : h1.keySet())
			if (h1.get(i) != h2.get(i))
				return false;
		return true;
	}
}
