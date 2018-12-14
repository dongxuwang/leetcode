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
   * Use carried to represent if there is a carry at current position.
   * Store the result just in the first node.
   */
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var carry = 0
    var p = new ListNode()
    var q = new ListNode()
    p.next = l1
    q.next = l2

    // Two numbers
    while (p.next != null && q.next != null) {
      p = p.next
      q = q.next
      var cur = carry + p.x + q.x
      carry = cur / 10
      p.x = cur % 10
    }

    // Use first node
    if (q.next != null)
      p.next = q.next

    // One number
    while (p.next != null) {
      p = p.next
      var cur = carry + p.x
      carry = cur / 10
      p.x = cur % 10
    }

    // The highest position
    if (carry == 1)
      p.next = new ListNode(1)

    l1
  }
}

class ListNode(var _x: Int = 0) {
  var next: ListNode = null
  var x: Int = _x
}
