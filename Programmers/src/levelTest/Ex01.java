package levelTest;
/*
 * 문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, 
 * solution을 완성하세요. 예를 들어 s가 a234이면 False를 리턴하고 1234라면 True를 리턴하면 됩니다.
 * 
 * s는 길이 1 이상, 길이 8 이하인 문자열입니다.
 */

public class Ex01 {
	public boolean solution(String s){
		boolean answer = true;
		int cnt = 0;
		
		int len = s.length();
		int[] arr = new int[len];
		
		for(int i=0; i<len; i++){
			try {
				arr[i] = Integer.parseInt(s.substring(i, i+1));
			} catch (Exception e) {
				answer = false;
			}
			
		}
	
		return answer;
	}
	
	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		
		boolean result = ex.solution("234311");
		
		System.out.println(result);
	}
}
