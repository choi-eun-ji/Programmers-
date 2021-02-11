package levelTest;

public class Ex04 {

	public int solution(int n) {
        int answer = 0;
        
        String s = Integer.toString(n);
        for(int i=0; i<s.length(); i++){
        	answer += Integer.parseInt(s.substring(i,i+1));
        }

        return answer;
    }
	
	public static void main(String[] args) {
		Ex04 ex = new Ex04();
		System.out.println(ex.solution(987));

	}

}
