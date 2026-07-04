class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode tempA = list1;
        ListNode tempB = list2;

        ListNode dummy = new ListNode(-1);
        ListNode list = dummy;

        while (tempA != null || tempB != null) {

            if (tempA == null) {

                list.next = new ListNode(tempB.val);
                tempB = tempB.next;

            } else if (tempB == null) {

                list.next = new ListNode(tempA.val);
                tempA = tempA.next;

            } else if (tempA.val <= tempB.val) {

                list.next = new ListNode(tempA.val);
                tempA = tempA.next;

            } else {

                list.next = new ListNode(tempB.val);
                tempB = tempB.next;
            }

            list = list.next;
        }
        
        return dummy.next;
    }
}