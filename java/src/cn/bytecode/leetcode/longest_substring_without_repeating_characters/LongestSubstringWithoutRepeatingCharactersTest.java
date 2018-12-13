package cn.bytecode.leetcode.longest_substring_without_repeating_characters;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {

    private LongestSubstringWithoutRepeatingCharacters lswrc = new LongestSubstringWithoutRepeatingCharacters();

    @Test
    public void test_lengthOfLongestSubstring1() {
        assertEquals(3, lswrc.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test_lengthOfLongestSubstring2() {
        assertEquals(1, lswrc.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void test_lengthOfLongestSubstring3() {
        assertEquals(3, lswrc.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void test_lengthOfLongestSubstring4() {
        assertEquals(1, lswrc.lengthOfLongestSubstring("c"));
    }
}
