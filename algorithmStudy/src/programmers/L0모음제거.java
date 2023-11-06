package programmers;

public class L0모음제거 {
	public static void main(String[] args) {
		String[] arr = {"a","e","i","o","u"};
		String str = "bus";
		String a = "";

		for(String data : arr){
			str = str.replaceAll(data, "");
		}



		System.out.println("@@@@" + str);

	}
}
