package capitalOne;

public class BinarySearchOrderAgnostic {

	public static void main(String[] args) {

		//int[] arr= {1,2,4,6,8,10,15,22,25,35,46};
		int[] arr = {99,74, 56, 46, 43, 32, 25, 11, 1};
		int target=46;
		
		int ans = binarySearch(arr, target);
		System.out.println("The index value is " + ans);
	}
	
	static int binarySearch(int arr[], int target) {
		int start =0;
		int end = arr.length-1;
		
		boolean isAss = arr[start] < arr[end];
		
		while(start <= end) {
			int mid =  start + (end -end)/2;
			
			if(arr[mid] == target) {
				return mid;
			}
			if(isAss) {
				if(target < arr[mid]) {
					end = mid -1;
				}else {
					start = mid + 1;
				} 
			}else {
			if(target > arr[mid]) {
				end = mid -1;
			}else{
				start = mid + 1;
			} 
			}
		}
		return -1;
	}

}
