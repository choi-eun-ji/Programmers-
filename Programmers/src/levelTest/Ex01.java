package levelTest;
/*
 * ���ڿ� s�� ���̰� 4 Ȥ�� 6�̰�, ���ڷθ� �������ִ��� Ȯ�����ִ� �Լ�, 
 * solution�� �ϼ��ϼ���. ���� ��� s�� a234�̸� False�� �����ϰ� 1234��� True�� �����ϸ� �˴ϴ�.
 * 
 * s�� ���� 1 �̻�, ���� 8 ������ ���ڿ��Դϴ�.
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
