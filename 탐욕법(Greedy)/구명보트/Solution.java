import java.util.Arrays;

public class Solution {

	public static int solution(int[] people, int limit) {
		int answer = 0;
		Arrays.sort(people);
		int index = 0; // 몸무게가 적가 나가는 사람
		for (int i = people.length - 1; i >= index; i--) {
			// 최대값과 최소값의 합이 limit보다 크면 최대값을 내보냄
			if (people[i] + people[index] > limit) {
				answer++;
				// 최대값과 최소값의 합이 limit보다 작거나 같으면 둘다 보냄
			} else {
				index++;
				answer++;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int n[] = { 70, 50, 80, 50 };
		System.out.println(solution(n, 100));
		int a[] = { 70, 80, 50 };
		System.out.println(solution(a, 100));

	}

}
