
public class BinarySearch {
	
	public static int searchRecursively(int arr[], int x) {
        return binarySearch(arr, 0, arr.length - 1, x);
    }

    public static int searchIteratively(int data, int arr[]) {
        return search(data, arr);
    }

	    // Recursively
	    public static int binarySearch(int arr[], int l, int r, int x) {
	        if (r >= l) {
	            int mid = l + (r - l)/2;

	            if (arr[mid] == x) return mid;

	            if (arr[mid] > x) return binarySearch(arr, l, mid-1, x);

	            return binarySearch(arr, mid+1, r, x);
	        }

	        return -1;
	    }

	public static int search(int data, int arr[]) {
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right){
			
			int middle = left + (right - left) / 2;
			if(arr[middle] == data) return middle;
			
			if(arr[middle] > data) {
				right = middle - 1;
			}
			else {
				left = middle + 1;
			}
		}	
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		int[] arr = {5, -10, 6, 7, 2, 3, 1, 4, 10, 9, 8, 8, 2, 9};
		
	}

}
