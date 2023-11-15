package programmers;

public class L0로그인성공 {
	public static void main(String[] args) {

//		String[] id_pw = {"meosseugi", "1234"};
//		String[] id_pw = {"programmer01", "15789"};
		String[] id_pw = {"rabbit04", "98761"};
//		String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
//		String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};
		String[][] db = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};

		String id = id_pw[0];
		String pw = id_pw[1];

		String answer = "";
		// db 반복문
		for(int j = 0 ; j < db.length; j++){
			// id 가 같다면
			if(id.equals(db[j][0]) && pw.equals(db[j][1])){
				answer = "login";
			} else if (id.equals(db[j][0]) && !pw.equals(db[j][1])){
				answer = "wrong pw";
			} else if (!id.equals(db[j][0]) && !pw.equals(db[j][1])){
				answer = "fail";
			}
		}
		System.out.println("@@@" + answer);


	}
}
