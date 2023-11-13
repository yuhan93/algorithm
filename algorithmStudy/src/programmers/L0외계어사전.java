package programmers;

import java.util.Arrays;

public class L0외계어사전 {
	public static void main(String[] args) {
		String[] spell = {"z", "d", "x"};
		String[] dic = {"def", "dww", "dzx", "loveaw"};
		int answer = 0;
		Arrays.sort(spell);
		for(int i = 0 ; i < dic.length; i++){
			if(spell.length == dic[i].length()){
				int cnt = 0;
				for(int j = 0 ; j < spell.length; j++){
					if(dic[i].indexOf(spell[j]) == -1){
						cnt = -1;
						answer = 2;
						break;
					}
				}
				if(cnt == 0){
					answer = 1;
					break;
				}
				System.out.println("@@" + cnt);
			}
		}
		System.out.println("@@" + answer);
	}
}
