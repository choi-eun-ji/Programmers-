package levelTest;
/*
 * 	������ ���� ���� n�� ����, n�� � ���� ���� x�� �������� �ƴ��� �Ǵ��Ϸ� �մϴ�.
	n�� ���� ���� x�� �����̶�� x+1�� ������ �����ϰ�, n�� ���� ���� x�� ������ �ƴ϶�� -1�� �����ϴ� �Լ��� �ϼ��ϼ���.
	
	���� ����
	n�� 1�̻�, 50000000000000 ������ ���� �����Դϴ�.
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
