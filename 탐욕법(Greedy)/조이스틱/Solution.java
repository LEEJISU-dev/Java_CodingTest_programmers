
public class Solution {

	public static int solution(String name) {
		int answer = 0;
		int min_move = name.length() - 1; // 최대로 가질 수 있는 min값은 끝까지 가는 것

		for (int i = 0; i < name.length(); i++) {
			answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

			// A가 연속되어 나올 경우
			int next = i + 1;
			while (next < name.length() && name.charAt(next) == 'A') {
				next++;
			}

			min_move = Math.min(min_move, i + name.length() - next + i);
		}
		answer += min_move;

		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("JAZ"));
		System.out.println(solution("JEROEN"));
		System.out.println(solution("JAN"));

	}

}
