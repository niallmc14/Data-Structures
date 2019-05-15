
public class SelectionSort {
	
	//Selection sort method
	
	public void sort(int arr[]) {
		
		int len = arr.length;
		int tmp;
		
		for(int i = 0; i < len; i++) {
			
			int min = i;
			for(int j = i + 1; j < len; j++) {				
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			
			swap(arr, min, i);
		}
	}
	
	//Swap method to clean up the code
	
	public void swap(int[] arr, int min, int index) {
		
		int tmp = arr[min];
		arr[min] = arr[index];
		arr[index] = tmp;
		return;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {5, 2, -10, 6, 7, 2, 3, 1, 4, 10, 9, 8, 8, 2, 9, 10};
		SelectionSort s = new SelectionSort();
		
		s.sort(arr);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

}
