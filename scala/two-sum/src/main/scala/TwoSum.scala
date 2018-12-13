object Solution {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    val result = for {
      i <- nums.indices
      j <- i + 1 until nums.length
      if nums(i) + nums(j) == target
    } yield (i, j)
    Array(result(0)._1, result(0)._2)
  }
}