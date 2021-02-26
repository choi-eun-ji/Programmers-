package codingTest_Lv1;

import java.util.ArrayList;
import java.util.Collections;

public class Ex02 {

	public int[] solution(int[] numbers) {
	     int[] answer = {};
	     ArrayList<Integer> list = new ArrayList<>();
			for(int i=0; i<numbers.length; i++){
				for(int j=i+1; j<numbers.length; j++){
						list.add(numbers[i] + numbers[j]);
				}
			}
			for(int i=0; i<list.size(); i++){
				for(int j=i+1; j<list.size(); j++){
					if(list.get(i).intValue()==list.get(j).intValue()){
						list.remove(j);
						j=j-1;
					}
				}
			}
			Collections.sort(list);
			
			answer = new int[list.size()];
			
			for(int i=0; i<list.size(); i++){
				answer[i]=list.get(i);
			}
			
			return answer;
	 }
	
	
	public static void main(String[] args) {
		
		int[] answer = {1,2,2,6,1,1};
		Ex02 ex = new Ex02();
		int[] number = ex.solution(answer);
		
		for(int i=0; i<number.length; i++){
			System.out.println(number[i]);
		}
	}

}
