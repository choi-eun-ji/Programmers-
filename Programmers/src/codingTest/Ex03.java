package codingTest;

import java.util.HashMap;
import java.util.Map;
/*
 * �ð����⵵�� �ذ��ϱ� ���ؼ��� ���������̳� ���� �� remove���� ����ϸ� ���⵵�� n������ �ǹǷ� �ȵȴ�. 
 * �ִ��� ���������� ������� �ʵ��� HashMap���� ����Ѵ�.
 * HashMap�� �� �ʱ�ȭ �޼ҵ�� getOrDefault("Ű��", "������")���� �ʱ�ȭ �ϸ� �ȴ�.
 * 
 * map�� keyset�� map�� Ű���� ��� ����� �� �ֵ��� �ϸ�, �̴� ������ �������θ� �ۼ��� �����ϴ�.
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
