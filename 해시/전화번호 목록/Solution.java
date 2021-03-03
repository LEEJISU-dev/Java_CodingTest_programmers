class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
		for (int i = 0; i < phone_book.length - 1; i++) {
			for (int j = i+1; j < phone_book.length; j++) {
				// startsWith() : 대상 문자열이 특정 문자 또는 문자열로 시작하는지 체크하는 함수(boolean)
				if (phone_book[i].startsWith(phone_book[j])) {
					return false;
				}
				if (phone_book[j].startsWith(phone_book[i])) {
					return false;
				}
			}
		}

		return answer;
    }
}