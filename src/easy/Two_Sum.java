package easy;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {
	public static void main(String[] args) {
		int[] ans = twoSum(new int[] {3, 2, 4}, 6);
		
		for(int num : ans)
			System.out.println(num);
	}
	
	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			
			map.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No solution");
	}
}
