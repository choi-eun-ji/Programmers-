package codingTest;

import java.util.HashMap;
import java.util.Map;
/*
 * 시간복잡도를 해결하기 위해서는 다중포문이나 포문 안 remove등을 사용하면 복잡도가 n제곱이 되므로 안된다. 
 * 최대한 이중포문을 사용하지 않도록 HashMap등을 사용한다.
 * HashMap의 값 초기화 메소드는 getOrDefault("키값", "벨류값")으로 초기화 하면 된다.
 * 
 * map의 keyset은 map의 키값을 모두 출력할 수 있도록 하며, 이는 개선된 포문으로만 작성이 가능하다.
 */
public class Ex03 {

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<participant.length; i++){
			map.put(participant[i], map.getOrDefault(participant[i], 0)+1);
		}
		
		for(int i=0; i<completion.length; i++){
			map.put(completion[i], map.get(completion[i])-1);
		}
		
		for(String key:map.keySet()){
			if(map.get(key) != 0){
				answer = key;
			}
		}
		return answer;
	}
	 
	public static void main(String[] args) {
		
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		Ex03 ex = new Ex03();
		String result = ex.solution(participant, completion);
		System.out.println(result);


	}

}
