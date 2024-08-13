package thuat_toan;

public class BubbleSort {
	public static void in(int[] a) {
		for (int item : a) {
			System.out.print(item + " ");
		}
	}

	public static void bubbleSort(int[] a, int n) {
		boolean flag = false;
		for (int i = 0; i < n; i++) {
			flag = false;
			for (int j = 0; j < n; j++) {
				if (a[j] > a[j + 1]) {
					flag = true;
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			if (flag == false) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] array1 = { 5, 3, 8, 4, 2 };
		bubbleSort(array1, array1.length - 1);
		in(array1);
	}

}
