 public static ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != nul){
                slow = slow.next;
                fast = fast.next.next;
        }
        return slow;
    }
