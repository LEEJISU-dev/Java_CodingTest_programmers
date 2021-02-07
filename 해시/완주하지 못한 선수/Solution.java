import java.util.HashMap;

public class Solution {

	public static String solution(String[] participant, String[] completion) {

		HashMap<String, Integer> map = new HashMap<>();
		for (String person : completion) {
			// getOrDefault() : 찾는 키가 존재하면 해당 키의 값을 반환하고, 없으면 기본값을 반환함
			map.put(person, map.getOrDefault(person, 0) + 1);
		}
		for (String person : participant) {
			map.put(person, map.getOrDefault(person, 0) - 1);
			if (map.get(person) < 0) {
				return person;
			}
		}
		return "";
	}
}