package easy;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {
	public static void main(String[] args) {
		System.out.println(romanToInt("VI"));
	}
	
	private static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int length = s.length(), ans = 0;
		
		for (int i = 0; i < length; i++) {
			int current = map.get(s.charAt(i));
			
			if (i < length - 1 && current < map.get(s.charAt(i + 1)))
				ans -= current;
			else ans += current;
		}
		
		return ans;
	}
}
