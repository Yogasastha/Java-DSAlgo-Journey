/* Structure of node
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {

    // Function to find the data of kth node from
    // the end of a linked list.
    int getKthFromLast(Node head, int k) {
        
        int len = getLen(head);
        
        if(len < k) {
            return -1;
        }
        Node node = head;
        len = len - k;
        int index = 0;
        while(node != null && len > index) {
            node = node.next;
            index += 1;
        }
        return (node != null) ? node.data : -1;
    }
    int getLen(Node node) {
        int len = 0;
        while(node != null) {
            len += 1;
            node = node.next;
        }
        return len;
    }
}