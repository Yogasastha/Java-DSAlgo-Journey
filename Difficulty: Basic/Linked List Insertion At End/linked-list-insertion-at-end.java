/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtEnd(Node head, int x) {
        // Create the new node with value x
        Node newNode = new Node(x);
        
        // If the list is empty, the new node becomes the head
        if (head == null) {
            return newNode;
        }

        // Traverse to the end of the list
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }

        // Link the new node at the end
        current.next = newNode;

        // Return the head (unchanged)
        return head;
    }
}

