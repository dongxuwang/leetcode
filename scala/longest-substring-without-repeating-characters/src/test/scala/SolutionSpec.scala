import org.scalatest.{FlatSpec, Matchers}

class SolutionSpec extends FlatSpec with Matchers {

  "The Longest substring without repeating characters abcabcbb " should "be 3" in {
    Solution.lengthOfLongestSubstring("abcabcbb") shouldBe 3
  }

  "The Longest substring without repeating characters bbbbb " should "be 1" in {
    Solution.lengthOfLongestSubstring("bbbbb") shouldBe 1
  }

  "The Longest substring without repeating characters pwwkew " should "be 3" in {
    Solution.lengthOfLongestSubstring("pwwkew") shouldBe 3
  }
}
