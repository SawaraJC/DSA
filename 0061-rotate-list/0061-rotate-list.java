
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int length = 1;
        ListNode current = head;

        // Calculate the length of the linked list
        while (current.next != null) {
            length++;
            current = current.next;
        }

        // Connect the end of the list to the head to make it a circular list
        current.next = head;

        // Calculate the actual rotations needed considering k might be greater than the length
        k = k % length;

        int stepsToMove = length - k;
        ListNode newTail = head;

        // Find the new tail (the node before the new head)
        for (int i = 1; i < stepsToMove; i++) {
            newTail = newTail.next;
        }

        // The new head is the node after the new tail
        ListNode newHead = newTail.next;

        // Break the circular connection
        newTail.next = null;

        return newHead;
    }
}
