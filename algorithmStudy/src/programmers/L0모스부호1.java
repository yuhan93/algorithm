package programmers;

public class L0모스부호1 {
	public static void main(String[] args) {
		String[] arr = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		String a = ".... . .-.. .-.. ---";
		String[] aa = a.split(" ");
		String[] az = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

		String answer = "";
		for(int i = 0 ; i < aa.length; i++){
			int idx = 0;
			for(int j = 0 ; j < arr.length; j++){
				if(aa[i].equals(arr[j])){
					idx = j;
				}
			}
			answer += az[idx];
		}
		System.out.println("@@"  + answer);

	}
}
