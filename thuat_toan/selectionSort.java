package thuat_toan;

public class selectionSort {
	public static void in(int a[]) {
		for(int item: a) {
			System.out.print(item +" ");
		}
	}
	
	public static void selectionSort(int[] arr, int n) {
		int min;
		for(int i=0; i<n-1; i++) {
			min = i;
			for(int j=i+1; j<n; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			if(min != i) {
				int temp = arr[min];
				arr[min] = arr[i];
				arr[i] = temp;
			}
		}
		in(arr);
	}
	
	public static void main(String[] args) {
		int[] arr = {2,6,4,3,8,54,10};
		selectionSort(arr, arr.length);
	}
}
