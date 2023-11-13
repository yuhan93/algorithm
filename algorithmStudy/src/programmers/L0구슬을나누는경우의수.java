package programmers;

public class L0구슬을나누는경우의수 {
	public static void main(String[] args) {
		int balls = 3;
		int share = 2;
		int answer = 0;
		answer = key(balls, share);
		System.out.println("@@" + answer);
	}

	public static int key(int balls, int share) {

		if(share == balls || share == 0){
			return 1;
		} else {
			return key(balls-1, share-1) + key(balls-1, share);
		}
	}
}
