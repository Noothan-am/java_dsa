class Solution {
    public ListNode mergeTwoLists(ListNode head, ListNode head2) {
        ListNode newNode = new ListNode();
        ListNode node = newNode;
        while(head != null && head2 != null){
            if(head.val < head2.val){
                node.next = head;
                node = node.next;
                head = head.next;
            }else {
                node.next = head2;
                node = node.next;
                head2 = head2.next;
            }
        }
        while (head != null){
            node.next = head;
            node = node.next;
            head = head.next;
        }
        while (head2 != null){
            node.next = head2;
            node = node.next;
            head2 = head2.next;
        }
        return newNode.next;

    }

}
