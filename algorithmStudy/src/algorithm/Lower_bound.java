package algorithm;

public class Lower_bound {
	public static void main(String[] args) {
		int arr[] = {1,3,3,5,7,9};
		System.out.println(lowerBound(3, 0, arr.length-1, arr));
	}

	static int lowerBound(int key, int left,int right ,int[] arr){
		// key : 구하고자 하는 값
		// left : 왼쪽 끝 인덱스  / 0
		// right : 오른쪽 끝 인덱스  / arr.length-1
		// arr : 배열
		int mid; // 중간값
		while(left < right){
			mid = (left + right) / 2; // 중간값 구하기
			if(arr[mid] < key){ // 배열의 중간값보다 구하고자 하는 값이 클 경우
				left = mid + 1; // 왼쪽 끝 인덱스에 중간값 + 1
			} else {
				right = mid; // 작은경우 오른쪽 끝 인덱스에 중간값
			}
		}
		return right;
	};
}
