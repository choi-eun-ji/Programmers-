package levelTest;
/*
 * 	�ܾ� s�� ��� ���ڸ� ��ȯ�ϴ� �Լ�, solution�� ����� ������. �ܾ��� ���̰� ¦����� ��� �α��ڸ� ��ȯ�ϸ� �˴ϴ�.
	���ѻ���
	s�� ���̰� 1 �̻�, 100������ ��Ʈ���Դϴ�.
 */
public class Ex02 {

	public String solution(String s) {
        String answer = "";
        int len = s.length();
        
  
        if(len % 2 == 1){
        	int n = len / 2;
        	answer = s.substring(n, n+1);
        }
        else{
        	int n = len / 2;
        	n = n-1;
        	answer = s.substring(n, n+1)+s.substring(n+1, n+2);;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Ex02 ex = new Ex02();
		String str = ex.solution("qwesfs");
		System.out.println(str);
	}

}
