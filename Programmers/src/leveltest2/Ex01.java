package leveltest2;
/*
 * 
 * 
 */
public class Ex01 {

	public int solution(String s)
    {
        int answer = 0;
        String[] arr = new String[s.length()];
        
        for(int i=0; i<s.length(); i++){
        	arr[i] = s.substring(i, i+1);
        	if(i==s.length() -1){
        		arr[i] = s.substring(s.length()-1);
        	}
        }
        
        int start = 0;
        int end = 0;
        
        for(int i=0; i<arr.length; i++){
        	if(arr[i].equals(arr[i+1])){
        		start = i-1;
        		if(start == 0){
        			start = i+2;
        			if(start == arr.length-1){
        				break;
        			}
        		}
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {

		String s = "baabaa";
		
		int answer = 0;
        String[] arr = new String[s.length()];
        
        for(int i=0; i<s.length(); i++){
        	arr[i] = s.substring(i, i+1);
        	if(i==s.length() -1){
        		arr[i] = s.substring(s.length()-1);
        	}
        }
	}
	
}
