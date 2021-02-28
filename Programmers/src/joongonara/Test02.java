package joongonara;
import java.util.*;
public class Test02 {



	class Solution {
	    public int[] solution(int[] waiting) {
	        int[] answer = {};

	        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	        for(int i=0; i<waiting.length; i++){
	            map.put(waiting[i], map.getOrDefault(waiting[i], 0)+1);
	        }

	        answer = new int[map.size()];
	        int cnt = -1;
	        for(int i=0; i<waiting.length; i++){
	            if(map.containsKey(waiting[i])){
	                cnt++;
	                map.remove(waiting[i]);
	                answer[cnt] = waiting[i];
	            }
	        }

	        return answer;
	    }
	}
}
