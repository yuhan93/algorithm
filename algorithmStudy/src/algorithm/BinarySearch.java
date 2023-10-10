package algorithm;

public class BinarySearch {

	static int[] arr = {1,3,5,7,9,11,20,35,99,100};

	public static void main(String[] args) {
		System.out.println(binarySearch(99,0,arr.length-1));
	}
	static int binarySearch(int key, int low, int high){
		int mid;

		if(low <= high){
			mid = (low + high) / 2;
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
}
