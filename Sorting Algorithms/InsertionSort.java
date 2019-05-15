
public class InsertionSort {
	
	public static void sort(int arr[]) {
		
		for(int i = 1; i < arr.length; i++) {
			int curr = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j] > curr) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = curr;
		}
	}
	
	public static void printArray(int arr[]) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
        int[] arr1 = {10, 3, 7, 5, 1, 15, 20};
        
     	sort(arr1);
        	printArray(arr1);
	}
}
