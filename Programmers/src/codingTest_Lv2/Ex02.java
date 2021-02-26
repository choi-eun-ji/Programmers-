package codingTest_Lv2;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02 {

	public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		ArrayList<String> listone = new ArrayList<>();

		int cnt = 0;

		for (int i = 0; i < skill.length(); i++) {
			listone.add(skill.substring(i, i + 1));
		}

		for (int i = 0; i < skill_trees.length; i++) {
			ArrayList<Integer> delone = new ArrayList<>();
			String str = skill_trees[i]; // BACDE
			String tempstr = "";
			String tempstr2 = "";
			int no = 0;
			for (int j = 0; j < str.length(); j++) {
				if (skill.contains(str.substring(j, j + 1))) {
					delone.add(skill.indexOf(str.substring(j, j + 1)));
					tempstr = tempstr + skill.indexOf(str.substring(j, j + 1));
				} else {
					no++;
				}
			}
			if (no == str.length()) {
				cnt++;
			} 
			else {
				Collections.sort(delone);

				for (int k = 0; k < delone.size(); k++) {
					tempstr2 = tempstr2 + delone.get(k);
				}

				if (tempstr.equals(tempstr2) && tempstr.contains("0")) {
					boolean flag = true;
					for (int f = 0; f < tempstr.length() - 1; f++) {
						if (Integer.parseInt(tempstr.substring(f + 1, f + 2))
								- Integer.parseInt(tempstr.substring(f, f + 1)) != 1) {
							flag = false;
						}
					}

					if (flag) {
						cnt++;
					}
				}

			}
		}
		answer = cnt;
		return answer;
    }
	
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_trees = {"PPPP", "CBADF", "AECB", "KKKK", "AQWER"};
		
		Ex02 ex = new Ex02();
		int n = ex.solution(skill, skill_trees);
		System.out.println(n);
		
		
		

	}

}
