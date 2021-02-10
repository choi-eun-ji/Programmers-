package levelTest;
/*
 * 	임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
	n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
	
	제한 사항
	n은 1이상, 50000000000000 이하인 양의 정수입니다.
 */
public class Ex03 {

	
	public long solution(long n) {
        long answer = 0;
        long num = 0;
        boolean flag = false;
        for(int i=0; i<n; i++){
        	if(i*i == n){
        		flag = true;
        		num = i+1;
        		break;
        	}
        }
        
        if(!flag){
        	answer = -1;
        }
        else{
        	answer = num * num;
        }
        
        
        return answer;
    }
	
	public static void main(String[] args) {
		Ex03 ex = new Ex03();
		long a = ex.solution(3);
		System.out.println(a);
	}

}
