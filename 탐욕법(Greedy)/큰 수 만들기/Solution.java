import java.util.Stack;

public class Solution {

	public static String solution(String number, int k) {
		// StringBuffer로 해야 시간초과 안생김
		StringBuffer answer = new StringBuffer();
		int index = 0;

		for (int i = 0; i < number.length() - k; i++) {
			char max = '0';
			// 이미 선택한 max값을 제외(j=index)
			for (int j = index; j <= k + i; j++) {
				if (max < number.charAt(j)) {
					// 최댓값 찾기
					max = number.charAt(j);
					index = j + 1;
				}
			}
			answer.append(max);
		}
		return answer.toString();
		
		// stack 이용해서 풀기
		/*char[] result = new char[number.length() - k];
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
				stack.pop();
			}
			stack.push(c);
		}
		for (int i = 0; i < result.length; i++) {
			result[i] = stack.get(i);
		}
		return new String(result);*/
	}

	public static void main(String[] args) {
		System.out.println(solution("1924", 2));
		System.out.println(solution("1231234", 3));
		System.out.println(solution("4177252841", 4));

	}

}
