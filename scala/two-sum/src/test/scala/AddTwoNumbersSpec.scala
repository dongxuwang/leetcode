import org.scalatest.{FlatSpec, Matchers}

class AddTwoNumbersSpec extends FlatSpec with Matchers {
  "The AddTwoNumbers 342 + 465 " should "be 807" in {
    val l10 = new ListNode(2)
    val l11 = new ListNode(4)
    val l12 = new ListNode(3)
    l11.next = l12
    l10.next = l11

    val l20 = new ListNode(5)
    val l21 = new ListNode(6)
    val l22 = new ListNode(4)
    l21.next = l22
    l20.next = l21

    var a = AddTwoNumbers.addTwoNumbers(l10, l20)
    a.x shouldBe 7
    a.next.x shouldBe 0
    a.next.next.x shouldBe 8
  }

  "The AddTwoNumbers 0 + 0 " should "be 0" in {
    val l10 = new ListNode(0)

    val l20 = new ListNode(0)

    var a = AddTwoNumbers.addTwoNumbers(l10, l20)
    a.x shouldBe 0
    a.next shouldBe null
  }

  "The AddTwoNumbers 0 + 1 " should "be 1" in {
    val l10 = new ListNode(0)

    val l20 = new ListNode(1)

    var a = AddTwoNumbers.addTwoNumbers(l10, l20)
    a.x shouldBe 1
    a.next shouldBe null
  }

  "The AddTwoNumbers 1 + 0 " should "be 1" in {
    val l10 = new ListNode(0)

    val l20 = new ListNode(1)

    var a = AddTwoNumbers.addTwoNumbers(l10, l20)
    a.x shouldBe 1
    a.next shouldBe null
  }

  "The AddTwoNumbers 1 + 1 " should "be 2" in {
    val l10 = new ListNode(1)

    val l20 = new ListNode(1)

    var a = AddTwoNumbers.addTwoNumbers(l10, l20)
    a.x shouldBe 2
    a.next shouldBe null
  }

  "The AddTwoNumbers 1 + 1 " should " not be 3" in {
    val l10 = new ListNode(1)

    val l20 = new ListNode(1)

    val l30 = new ListNode(3)
    var a = AddTwoNumbers.addTwoNumbers(l10, l20)
    a.x should not be 3
    a.next shouldBe null
  }

  "The AddTwoNumbers 1 + 9 " should "be 10" in {
    val l10 = new ListNode(1)

    val l20 = new ListNode(9)

    var a = AddTwoNumbers.addTwoNumbers(l10, l20)
    a.x shouldBe 0
    a.next.x shouldBe 1
    a.next.next shouldBe null
  }
  "The AddTwoNumbers 9 + 1 " should "be 10" in {
    val l10 = new ListNode(9)

    val l20 = new ListNode(1)

    var a = AddTwoNumbers.addTwoNumbers(l10, l20)
    a.x shouldBe 0
    a.next.x shouldBe 1
    a.next.next shouldBe null
  }
  "The AddTwoNumbers 21 + 9 " should "be 30" in {
    val l10 = new ListNode(1)
    val l11 = new ListNode(2)
    l10.next = l11

    val l20 = new ListNode(9)

    var a = AddTwoNumbers.addTwoNumbers(l10, l20)
    a.x shouldBe 0
    a.next.x shouldBe 3
    a.next.next shouldBe null
  }
  "The AddTwoNumbers 37 + 0 " should "be 37" in {
    val l10 = new ListNode(7)
    val l11 = new ListNode(3)
    l10.next = l11

    val l20 = new ListNode(0)

    var a = AddTwoNumbers.addTwoNumbers(l10, l20)
    a.x shouldBe 7
    a.next.x shouldBe 3
    a.next.next shouldBe null
  }
  "The AddTwoNumbers 0 + 37 " should "be 37" in {
    val l10 = new ListNode(0)

    val l20 = new ListNode(7)
    val l21 = new ListNode(3)
    l20.next = l21

    var a = AddTwoNumbers.addTwoNumbers(l10, l20)
    a.x shouldBe 7
    a.next.x shouldBe 3
    a.next.next shouldBe null
  }
  "The AddTwoNumbers 999 + 1 " should "be 1000" in {
    val l10 = new ListNode(9)
    val l11 = new ListNode(9)
    val l12 = new ListNode(9)
    l11.next = l12
    l10.next = l11

    val l20 = new ListNode(1)

    var a = AddTwoNumbers.addTwoNumbers(l10, l20)
    a.x shouldBe 0
    a.next.x shouldBe 0
    a.next.next.x shouldBe 0
    a.next.next.next.x shouldBe 1
    a.next.next.next.next shouldBe null
  }
}
