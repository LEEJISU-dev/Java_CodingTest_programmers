import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
	int answer = 1;
	HashMap<String, Integer> map = new HashMap<>();
		
	// 각 옷의 종류의 수
	for(String[] cloth : clothes) {
		map.put(cloth[1], map.getOrDefault(cloth[1], 0) + 1);
	}
		
	// (각 옷의 종류 + 1)의 곱 - 1 (모두 다 선택하지 않은 경우)
	for(String key : map.keySet()) {
		answer *= map.get(key)+1;
	}

	return answer -1;
    }
}