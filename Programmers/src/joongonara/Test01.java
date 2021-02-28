package joongonara;
import java.util.HashMap;
import java.util.Map;
public class Test01 {


	class Solution {
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
	}
}
