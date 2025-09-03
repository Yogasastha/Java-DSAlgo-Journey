/*
class Node
{
    int data;
    Node next;
    Node prev;
    Node(int data)
    {
        this.data = data;
        next = prev = null;
    }
}
*/

class Solution {
    Node insertAtPos(Node head, int p, int x) {
        
        Node node = new Node(x);
        Node current = head;
        int index = 0;
        
        while(index < p && current != null) {
            current = current.next;
            index++;
        }
        
        if(current == null) return head;
        
        Node afterNode = current.next;
        
        node.prev = current;
        node.next = afterNode;
        current.next = node;
        
        if(afterNode != null) {
            afterNode.prev = node;
        }
        
        return head;
    }
}