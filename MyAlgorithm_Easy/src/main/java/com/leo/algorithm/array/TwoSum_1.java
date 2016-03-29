package com.leo.algorithm.array;

import java.util.HashMap;
import java.util.Map;

/*
1. Two Sum

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 * 
 * 
 */
public class TwoSum_1 {

	public int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length < 2)
			return null;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(target - nums[i])) {
				int[] result = new int[2];
				result[0] = map.get(target - nums[i]);
				result[1] = i;
				return result;
			} else {
				map.put(nums[i], i);
			}

		}
		return null;
	}

}
