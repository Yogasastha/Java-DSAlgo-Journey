class Solution {
    Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;   // Save next node
            current.next = prev;   // Reverse current node's pointer
            prev = current;        // Move prev to current
            current = next;        // Move current to next
        }

        return prev; // New head of the reversed list
    }
}
