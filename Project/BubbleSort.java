public class BubbleSort {

    public void bubblesort(int arr[]) {

		boolean swap; //for checking
		int temp; // collect value for swap
		int n = arr.length;

		for(int i = 0 ; i<n-1 ; i++) {

			swap = false;
			
			for(int j = 0 ; j < n-i-1 ; j++) {
				
				if(arr[j] > arr[j+1]) { //if current value is greater than next value then swap
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap = true;
				}
	
			}

			if(swap == false) { //if no more swap then exit loop
				break;
			}
			
		}
		
	}
}
