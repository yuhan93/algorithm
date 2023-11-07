package programmers;

public class L0k의개수 {
	public static void main(String[] args) {
		int i = 10;
		int j = 50;
		int k = 5;
		int answer = 0;

		String str = String.valueOf(k);
		for(int a = i ; a <= j; a++){
			String value = String.valueOf(a);
			if(value.contains(str)){
				String[] arr = value.split("");
				for( String data : arr){
					if(data.equals(str)){
						answer++;
					}
				}
			}
		}
		System.out.println("@@@" + answer);

	}
}
