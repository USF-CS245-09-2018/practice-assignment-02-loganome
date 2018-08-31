package pa2;

public class BinaryRecursiveSearch implements Practice2Search {

	@Override
	public String searchName() {
		return "Recursive Binary Search";
	}

	@Override
	public int search(int[] arr, int target) {
		int up = arr.length-1;
		int low= 0;
		return search( arr, target, up, low);
	}
	public int search(int[] arr, int target, int up, int low) {
		if (up< low) {
			return -1;
		}
		int mid = (low+up)/2;
		if(arr[mid]==target) {
			return mid;
		}
		else if( target< arr[mid]) {
			return search(arr, target, mid-1, low);
		}
		else{
			return search(arr, target, up, mid+1);
		}
		
	}

}
