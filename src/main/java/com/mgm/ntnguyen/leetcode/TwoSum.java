package com.mgm.ntnguyen.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  public static void main(String[] args) {
    fizzBuzz(50);
  }

  private static int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> numMap = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      int delta = target - nums[i];
      if (numMap.containsKey(delta)) {
        return new int[]{numMap.get(delta), i};
      } else {
        numMap.put(nums[i], i);
      }
    }
    return new int[]{0, 1};
  }

  private static void fizzBuzz(int n) {
    for (int i = 0; i <= n; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        String fizz = i%3 == 0 ? "Fizz" : "";
        String buzz = i%5 == 0 ? "Buzz" : "";
        System.out.println(fizz + buzz);
      } else {
        System.out.println(i);
      }
    }
  }
}
