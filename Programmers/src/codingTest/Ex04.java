package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex04 {

	public int[] solution(int []arr) {
		
		int[] answer = {};
		ArrayList<Integer> list2 = new ArrayList<>();
		for(int i=0; i<arr.length; i++){
			list2.add(arr[i]);
		}
		list2.add(-1);
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<list2.size()-1; i++){
			if(list2.get(i+1).intValue()==list2.get(i)){
				continue;
			}
			else{
				list.add(list2.get(i));
			}
		}
		answer = new int[list.size()];
		
		for(int i=0; i<answer.length; i++){
			answer[i] = list.get(i);
		}
		
		return answer;
    }
	
	public static void main(String[] args) {
		Ex04 ex = new Ex04();
		int[] arr = {3,3,3,4,4,1,0,1,1,0,0};
		int[] answer = ex.solution(arr);
		
		for(int i=0; i<answer.length; i++){
			System.out.println(answer[i]);
		}
		
	}

}
