package algorithm;

public class BinarySearch {

	static int[] arr = {1,3,5,7,9,11,20,35,99,100};

	public static void main(String[] args) {
		System.out.println(binarySearch(99,0,arr.length-1));
		System.out.println(binarySearch2(99,0,arr.length-1));
	}
	static int binarySearch(int key, int low, int high){
		System.out.println("key ::: " + key);
		System.out.println("low ::: " + low);
		System.out.println("high ::" + high);
		int mid;

		if(low <= high){
			mid = (low + high) / 2;
			System.out.println("mid :::: " + mid);
			System.out.println("arr[mid] :::: " + arr[mid]);
			// 탐색 성공 시
			if(key == arr[mid]){
				return mid;
			} else if (key < arr[mid]){
				return binarySearch(key, low , mid-1); // 왼쪽 부분에서 탐색 하기
			} else {
				return binarySearch(key,mid+1,high); // 오른쪽 부분에서 탐색하기
			}
		}
		return -1; // 탐색 실패 시
	}
	static int binarySearch2(int key, int low, int high){
		int mid;

		while(low <= high){
			mid = (low + high) / 2;
			if(key == arr[mid]){
				return mid;
			} else if(key < arr[mid]){
				high = mid -1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}
}
