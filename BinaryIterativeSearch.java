package pa2;

public class BinaryIterativeSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "Iterative Binary Search";
	}

	@Override
	public int search(int[] arr, int target) {
		int low = 0;
		int up= arr.length-1;
		int mid;
		while( low<up) {
			mid = (low+up)/2;
			if( arr[mid]==target) {
				return mid;
			}
			else if(arr[mid]<target) {
				low= mid+1;
			}
			else{
				up = mid-1;
			}
		}
		return -1;
	}

}
