import java.util.Random;

public class MergeSort {
	
	public void mergeSort(int[] arr, int len) {
		
		if(len < 2)
			return;
		
		int mid = len / 2;
		int[] left = new int[mid];
		int[] right = new int[len - mid];
		
		for(int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		
		for(int j = mid; j < len; j++) {
			right[j - mid] = arr[j];
		}
		
		mergeSort(left, mid);
		mergeSort(right, len - mid);
		
		merge(arr, left, right, mid, len);
		
	}
	
	public void merge(int[] arr, int[] left, int[] right, int l, int r) {
		
		int i = 0, j = 0, k = 0;
		
		while(i < l && j < r) {
			if(left[i] <= right[j]) {
	            arr[k++] = left[i++];
	        }
	        else {
	            arr[k++] = right[j++];
	        }		
		}
		
		while(i < l) {
			arr[k++] = left[i++];
		}
		
		while(j < l) {
			arr[k++] = right[j++];
		}
	}
	
	public static void main(String[] args) {
		int[] actual = { 5, 1, 6, 2, 3, 4, 6};

		MergeSort merge = new MergeSort();
	    merge.mergeSort(actual, actual.length);
	    
	    for(int i = 0; i < actual.length; i++) {
	    		System.out.print(actual[i] + ", ");
	    }
	}
}