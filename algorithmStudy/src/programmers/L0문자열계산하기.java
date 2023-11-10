package programmers;

public class L0문자열계산하기 {
	public static void main(String[] args) {
		String my_str = "3 + 4";
		String[] arr = my_str.split(" ");
		int answer = Integer.parseInt(arr[0]);
		for(int i = 1; i < arr.length; i+=2){
			if(arr[i].equals("+")){
				answer += Integer.parseInt(arr[i + 1 ]);
			} else {
				answer -= Integer.parseInt(arr[i + 1]);
			}
		}
		System.out.println("@@" + answer);
	}
}
