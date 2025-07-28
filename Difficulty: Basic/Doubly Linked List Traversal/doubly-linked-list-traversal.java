// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public static ArrayList<Integer> displayList(Node head) {
         ArrayList<Integer> ans = new ArrayList<>();
         
         while (head != null) {
            ans.add(head.data);
            head = head.next;
        }

        return ans;
    }
}