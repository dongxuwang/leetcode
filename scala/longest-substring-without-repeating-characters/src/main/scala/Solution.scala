import scala.collection.immutable.HashSet

/**
  * https://leetcode.com/problems/longest-substring-without-repeating-characters/
  * Given a string, find the length of the longest substring without repeating characters.
  *
  * Example 1:
  *
  * Input: "abcabcbb"
  * Output: 3
  * Explanation: The answer is "abc", with the length of 3.
  * Example 2:
  *
  * Input: "bbbbb"
  * Output: 1
  * Explanation: The answer is "b", with the length of 1.
  * Example 3:
  *
  * Input: "pwwkew"
  * Output: 3
  * Explanation: The answer is "wke", with the length of 3.
  * Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
  */
object Solution {

  /*
   * Sliding Window
   */
  def lengthOfLongestSubstring(s: String): Int = {
    var window = HashSet[Char]()
    var i = 0
    var j = 0
    var len = s.length
    var longest = 0

    while(i < len && j < len){
      if(!window.contains(s(j))){
        window += s(j)
        j = j + 1
        longest = Math.max(longest, j - i)
      } else {
        window -= s(i)
        i = i + 1
      }
    }

    longest
  }
}
