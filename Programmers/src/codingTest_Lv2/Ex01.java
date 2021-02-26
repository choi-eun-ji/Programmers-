package codingTest_Lv2;

import java.util.ArrayList;
import java.util.Collections;

public class Ex01 {

	public int solution(int[] priorities, int location) {
        int answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> numlist = new ArrayList<>();

		for(int i=0; i<priorities.length; i++){
			numlist.add(priorities[i]);
			list.add(i);
		}
		
		int result = 0;
		while(true){

			int num = numlist.get(0).intValue();
			int i = list.get(0).intValue();
			
			if(numlist.size() == 0){
				
			}
			list.remove(0);
			numlist.remove(0);
			
			if(numlist.size() == 0){
				result = result + 1;
				answer = result;
				break;
			}
			if(Collections.max(numlist) > num){
				list.add(i);
				numlist.add(num);
			}
			else{
				result = result + 1;
				if(i == location){
					answer = result;
					break;
				}
			}
		}
		return answer;		
    }
	
	public static void main(String[] args) {

		int[] priorities = {3,3,4,2};
		int location = 3;
		
		Ex01 ex = new Ex01();
		int result = ex.solution(priorities, location);
		System.out.println(result);
	}

}
