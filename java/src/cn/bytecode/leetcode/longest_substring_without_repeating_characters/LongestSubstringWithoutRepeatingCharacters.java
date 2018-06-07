package cn.bytecode.leetcode.longest_substring_without_repeating_characters;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(final String string) {
        int maxLength = 0;
        char[] chars = string.toCharArray();
        Set<Character> longest = new HashSet<>();
        for (int i = 0; i < chars.length; ++i) {
            for (int j = i; j < chars.length; ++j) {
                if (longest.contains(chars[j])) {
                    break;
                } else {
                    longest.add(chars[j]);
                }
                maxLength = Math.max(maxLength, longest.size());
            }
            longest.clear();
        }
        return maxLength;
    }
}
