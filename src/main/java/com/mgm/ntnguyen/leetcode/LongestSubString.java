package com.mgm.ntnguyen.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {

  public int lengthOfLongestSubstring(String s) {
    char[] chars = s.toCharArray();
    Set<Character> set = new HashSet<>();
    int longest = 0;
    int p;
    for (int i = 0; i < chars.length; i++) {
      p = i;
      while (p < chars.length && !set.contains(chars[p])) {
        set.add(chars[p]);
        p++;
      }
      if (set.size() > longest) {
        longest = set.size();
      }
      set.clear();
    }
    return longest;
  }
}
