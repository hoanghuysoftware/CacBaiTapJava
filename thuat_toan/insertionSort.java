package thuat_toan;

public class insertionSort {
	public static void in(int a[]) {
		for(int item: a) {
			System.out.print(item +" ");
		}
	}
	public static void sort(int[] a, int n) {
		int value, index;
		
		for(int i=0; i<n; i++) {
			index = i;
			value = a[i];
			while(index > 0 && value < a[index-1]) {
				a[index] = a[index-1];
				index--;
			}
			a[index] = value;
		}
		in(a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,6,4,3,8,54,10};
		sort(arr, arr.length);
	}

}
