/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        Node dummy = new Node(0);
        dummy.next = head;

        while(head != null)
        {
            if(head.child == null)
                head = head.next;

            else
            {
                Node tmp = head.next;
                Node child = head.child;
                head.next = child;
                child.prev = head;
                head.child = null;
                Node last = head;

                while(last.next != null)
                    last = last.next;
                
                last.next = tmp;
                if(tmp != null)
                    tmp.prev = last;
                head = head.next;
            }
        }

        return dummy.next;
    }
}
