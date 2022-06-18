/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        if(head == null) {
            head = new Node(insertVal);
            head.next = head;
            return head;
        }
            
        Node dummy = head;
        Node prev = head;
        head = head.next;

        while(head != dummy) {
            if((head.val > prev.val && insertVal <= head.val && insertVal >= prev.val) || 
               (head.val < prev.val && (insertVal >= prev.val || insertVal <= head.val))) {
                   prev.next = new Node(insertVal);
                   prev.next.next = head;
                   return dummy;
               }

               prev = head;
               head = head.next;
        }

        prev.next = new Node(insertVal);
        prev.next.next = head;

        return dummy;
    }
}
