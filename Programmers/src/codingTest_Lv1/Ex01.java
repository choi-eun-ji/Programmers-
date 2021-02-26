package codingTest_Lv1;

import java.awt.List;
import java.util.ArrayList;

public class Ex01 {

	
	    public int solution(int[][] board, int[] moves) {
	        int answer = 0;
	        ArrayList<Integer> list = new ArrayList<>();
			int size = board.length-1;
			
			for(int i=0; i<moves.length; i++){
				int index = moves[i]-1;
				
				for(int j=0; j<=size; j++){
					if(board[j][index] != 0){ 
						list.add(board[j][index]);
						board[j][index] = 0;
						break;
					}
				}
			}
			for(int k=0;k<list.size();k++){
	            if(k!=(list.size()-1)){
	                if(list.get(k)==list.get(k+1)){
	                    list.remove(k);
	                    list.remove(k);
	                    answer++;
	                    k=-1;

	                }

	            }
	        }
			answer = answer *2;
	        return answer;
	    
	}
	
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0}, {0,0,1,0,3}, {0,2,5,0,1}, {4,2,4,4,2}, {3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		for(int i=0; i<board.length; i++){
			for(int j=0; j<board.length; j++){
				System.out.printf("%d %d %d\n", i, j, board[i][j]);
			}
		}
		Ex01 sl = new Ex01();
		int result = sl.solution(board, moves);
		System.out.println(result);
	}

}
