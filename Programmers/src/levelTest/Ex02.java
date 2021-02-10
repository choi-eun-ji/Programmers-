package levelTest;
/*
 * 	단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	재한사항
	s는 길이가 1 이상, 100이하인 스트링입니다.
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
