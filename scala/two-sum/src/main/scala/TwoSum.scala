/**
  * https://leetcode.com/problems/two-sum/
  *
  * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
  *
  * You may assume that each input would have exactly one solution, and you may not use the same element twice.
  *
  * Given nums = [2, 7, 11, 15], target = 9,
  *
  * Because nums[0] + nums[1] = 2 + 7 = 9,
  * return [0, 1].
  */

/*
 * We can use a map to store the offset of the target and the current num.
 * Thus whenever the current num is included in the map, the result occur.
 */
object TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    var offsetMap: Map[Int, Int] = Map.empty
    var i = 0
    while (i < nums.length && !offsetMap.contains(nums(i))) {
      offsetMap += target - nums(i) -> i
      i = i + 1
    }
    Array(offsetMap(nums(i)), i)
  }
}