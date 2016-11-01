package practice.coursera.algorithms.unionfind;

public class QuickFindUF {

	private int[] id;

	public QuickFindUF(int n) {
		id = new int[n];
		for (int i = 0; i < id.length; i++) {
			id[i] = i;
		}
	}

	private void validate(int p) {
		int length = id.length;
		if (p < 0 || p >= length) {
			throw new IndexOutOfBoundsException("index " + p + " is not between 0 and " + (length - 1));
		}
	}

	public int find(int p) {
		validate(p);
		return id[p];
	}

	public boolean isConnected(int a, int b) {
		return find(a) == find(b);
	}

	public void union(int a, int b) {
		int aId = find(a);
		int bId = find(b);
		for (int i = 0; i < id.length; i++) {
			if (id[i] == aId)
				id[i] = bId;
		}
	}

}
