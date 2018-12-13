package leetcode.array;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        int preDiv = 0;

        ListNode curNode = listNode;

        while (l1 != null && l2 != null) {
            if(l1.next != null || l2.next!=null){
                curNode.next = new ListNode(0);
            }
            int curSum = l1.val + l2.val + preDiv;
            preDiv = curSum / 10;
            curNode.val = curSum % 10;
            curNode = curNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null) {
            while (l2 != null) {
                if(l2.next != null){
                    curNode.next = new ListNode(0);
                }
                int curSum = l2.val + preDiv;
                preDiv = curSum / 10;
                curNode.val = curSum % 10;
                curNode = curNode.next;
                l2 = l2.next;
            }
        } else {
            while (l1 != null) {
                if(l1.next !=null){
                    curNode.next = new ListNode(0);
                }
                int curSum = l1.val + preDiv;
                preDiv = curSum / 10;
                curNode.val = curSum % 10;
                curNode = curNode.next;
                l1 = l1.next;
            }
        }

        return listNode;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(9);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        ListNode a1 = new ListNode(5);
        ListNode a2 = new ListNode(6);
        ListNode a3 = new ListNode(4);
        a1.next = a2;
        a2.next = a3;

        System.out.println(AddTwoNumbers.addTwoNumbers(l1, a1));



    }
}

