/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = new Node(0);
        Node prev = dummy;
        Node headPrev = head;
        Map<Node, Node> map = new HashMap<>();

        while(head != null) {
            Node tmp = new Node(head.val);
            map.put(head, tmp);
            head = head.next;
            prev.next = tmp;
            prev = tmp;
        }

        while(headPrev != null) {
            Node cur = map.get(headPrev);
            cur.random = map.getOrDefault(headPrev.random, null);
            headPrev = headPrev.next;
        }
        
        return dummy.next;
    }
}
