/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
         // If the node to be deleted is the head node (x = 1)
        if (x == 1) {
            return head.next;  // Simply return the next node as the new head
        }

        // Initialize a current pointer to traverse the list
        Node current = head;
        int count = 1;

        // Traverse the list until we reach the node just before the x-th node
        while (current != null && count < x - 1) {
            current = current.next;
            count++;
        }

        // If the current node is valid and the x-th node exists
        if (current != null && current.next != null) {
            // Skip the x-th node by adjusting the next pointer
            current.next = current.next.next;
        }

        // Return the modified list starting from the head
        return head;
    }

    // Helper function to print the linked list (for testing purposes)
    void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    }