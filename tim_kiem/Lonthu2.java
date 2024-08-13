package tim_kiem;

public class Lonthu2 {

	public static int search(int[] a) {
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) { // search value gather than max
				max2 = max; // set value max into max2
				max = a[i]; // set value max by value a[i]
			} else if (a[i] != max && a[i] > max2) {
				// check value smaller max but it gather than max 2
				max2 = a[i];
			}
		}
		return max2;

	}

	public static void main(String[] args) {
		int[] a = { 4, 4, 3, 3, 2, 2 };
		if (search(a) == Integer.MIN_VALUE) {
			System.out.println("Khong co max 2!");
		} else
			System.out.println("Max 2: " + search(a));
	}
}
