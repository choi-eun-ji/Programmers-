package levelTest;

public class Ex05 {

	public int[] solution(int[] arr, int divisor) {
		int[] answer = {};
		int[] answers = new int[arr.length];
		int cnt = -1;
		for (int i = 0; i < arr.length; i++) {
			answers[i] = -1;
			if (arr[i] % divisor == 0) {
				cnt++;
				answers[cnt] = arr[i];
			}
		}

		if (cnt == -1) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[cnt + 1];
			int cnt2 = -1;
			for (int i = 0; i < answers.length; i++) {
				if (answers[i] != -1) {
					cnt2 = cnt2 + 1;
					answer[cnt2] = answers[i];
				}
			}
			for (int i = 0; i < answer.length - 1; i++) {
				for (int j = i + 1; j < answer.length; j++) {
					if (answer[i] > answer[j]) {
						int temp = answer[i];
						answer[i] = answer[j];
						answer[j] = temp;
					}
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Ex05 ex = new Ex05();
		int[] arr = { 2, 36, 1, 3 };

		int[] result = ex.solution(arr, 1);

		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

}
