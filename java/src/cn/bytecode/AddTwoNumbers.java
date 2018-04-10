package cn.bytecode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


        ListNode listNode = new ListNode(0);
        int preDiv = 0;

        ListNode curNode = listNode;

        while (l1 != null && l2 != null) {
            int curSum = l1.val + l2.val + preDiv;
            preDiv = curSum / 10;
            curNode.val = curSum % 10;
            if(l1.next != null || l2.next!=null || preDiv == 1){
                curNode.next = new ListNode(0);
            }
            curNode = curNode.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null) {
            while (l2 != null) {
                int curSum = l2.val + preDiv;
                preDiv = curSum / 10;
                curNode.val = curSum % 10;
                if(l2.next != null || preDiv == 1){
                    curNode.next = new ListNode(0);
                }
                curNode = curNode.next;
                l2 = l2.next;
            }
        } else {
            while (l1 != null) {
                int curSum = l1.val + preDiv;
                preDiv = curSum / 10;
                curNode.val = curSum % 10;
                if(l1.next !=null || preDiv == 1){
                    curNode.next = new ListNode(0);
                }
                curNode = curNode.next;
                l1 = l1.next;
            }
        }

        if(curNode != null){
            curNode.val = 1;
        }

        return listNode;
    }
}
