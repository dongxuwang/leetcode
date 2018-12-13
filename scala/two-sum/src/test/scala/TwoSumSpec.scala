import org.scalatest._

class TwoSumSpec extends FlatSpec with Matchers {
  "The TwoSum object1" should "be right" in {
    Solution.twoSum(Array(2, 7, 11, 15), 9) shouldEqual Array(0, 1)
  }
  "The TwoSum object2" should "be right" in {
    Solution.twoSum(Array(3, 2, 4), 6) shouldEqual Array(1, 2)
  }
  "The TwoSum object3" should "be right" in {
    Solution.twoSum(Array(3, 3), 6) shouldEqual Array(0, 1)
  }
}
