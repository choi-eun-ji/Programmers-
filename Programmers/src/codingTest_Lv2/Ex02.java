package codingTest_Lv2;

import java.util.HashMap;
import java.util.Map;

public class Ex02 {

	public long[] solution(String[] words) {
        long[] answer = {};
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0; i<words.length; i++){
        	if(!map.containsKey(words[i])){
        		map.put(words[i], i+1);
        	}
        }
        
        answer = new long[words.length];
        
        for(int i=0; i<words.length; i++){
        	int index = map.get(words[i]);
        	answer[i] = index;
        }
        return answer;
    }
	
	
	public static void main(String[] args) {
		String[] words = {"may", "with", "may", "you", "you"};
		long[] answer = {};
		/*Ex02 ex = new Ex02();
		long[] answer = ex.solution(words);*/
		
		Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i=0; i<words.length; i++){
        	if(!map.containsKey(words[i])){
        		map.put(words[i], i+1);
        	}
        }
        
        answer = new long[words.length];
        
        for(int i=0; i<words.length; i++){
        	int index = map.get(words[i]);
        	answer[i] = index;
        }
        
        for (long l : answer) {
			System.out.println(l);
		}
	}

}
