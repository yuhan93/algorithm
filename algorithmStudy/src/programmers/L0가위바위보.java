package programmers;

public class L0가위바위보 {
	public static void main(String[] args) {
		// 가위 2
		// 바위 0
		// 보 5
//		"2"	"0"
//		"205"	"052"
		String a = "205";
		String answer = "";
		String[] arr = a.split("");
		for(int i = 0 ; i < arr.length; i++){
			if(arr[i].equals("2")){
				answer += "0";
			} else if (arr[i].equals("0")){
				answer += "5";
			} else if (arr[i].equals("5")){
				answer += "2";
			}
		}
		System.out.println("@@" + answer);


	}
}
