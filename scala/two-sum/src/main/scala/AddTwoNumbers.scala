/**
  * https://leetcode.com/problems/add-two-numbers/
  * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
  *
  * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
  *
  * Example:
  *
  * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
  * Output: 7 -> 0 -> 8
  * Explanation: 342 + 465 = 807.
  */
object AddTwoNumbers {

  /*
   * Use only one while and a extra link list.
   */
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var carry = 0
    var head: ListNode = new ListNode()
    var p = l1
    var q = l2
    var r = head

    while (p != null || q != null) {
      val px = if (p != null) p.x else 0
      val qx = if (q != null) q.x else 0
      val sum = px + qx + carry
      carry = sum / 10
      r.next = new ListNode(sum % 10)
      r = r.next
      p = if (p != null) p.next else null
      q = if (q != null) q.next else null
    }

    if (carry == 1)
      r.next = new ListNode(1)

    head.next
  }
}

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}
