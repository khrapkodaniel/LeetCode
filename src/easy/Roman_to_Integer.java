package easy;

import java.util.HashMap;
import java.util.Map;

public class Roman_to_Integer {
	public static void main(String[] args) {
		System.out.println(romanToInt("VI"));
	}
	
	private static int romanToInt(String s) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		
		int ans = 0;
		
		for(int i = s.length(); i > 0; i--) {
			ans += map.get(s.substring(i - 1, i));
		}
		
		return ans;
	}
}
