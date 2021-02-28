package joongonara;
import java.util.*;
public class Test03 {


	class Solution{
	    public String solution(String s){
	        String answer = "";
	        s = s.toLowerCase();

	        Map<String, Integer> map = new HashMap<String, Integer>();
	        for(int i=0; i<s.length(); i++){
	            map.put(s.substring(i, i+1), map.getOrDefault(s.substring(i, i+1), 0)+1);
	        }

	        int max = 0;
	        for(String key : map.keySet())
	        {   
	            int value = map.get(key); 
	            if(map.size() == 1){
	                answer = key;
	            }
	            else{
	                if(value > max){
	                    max = value;
	                }
	            }
	        }

	        TreeMap<String,Integer> tm = new TreeMap<String,Integer>(map);

	        Set<String> keyset = map.keySet(); 
	        Iterator<String> keyiterator = tm.keySet( ).iterator( ); 

	        while(keyiterator.hasNext()) {
	            String key = keyiterator.next();
	            int value = tm.get(key);
	            if(value == max){
	                answer = answer + key;
	            }
	        }

	        return answer;
	    }
	}
}
