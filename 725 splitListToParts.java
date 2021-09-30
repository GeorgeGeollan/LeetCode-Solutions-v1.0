/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        List<Integer> list = new ArrayList<>();
        while(head != null)
        {
            list.add(head.val);
            head = head.next;
        }


        int pernum = list.size() / k;
        int prenum = list.size() % k;
        ListNode[] ln = new ListNode[k];
        int numCount = 0;

        for(int i = 0; i < k; i++)
        {
            if(pernum == 0 && i >= prenum)
                continue;

            ln[i] = new ListNode();

            int total = i <= prenum - 1 ? pernum + 1 : pernum;
            
            int count = 0;
            ListNode temp = ln[i];
            while(count < total)
            {
                ln[i].val = list.get(numCount++);

                if(count == total - 1)
                    break;
                
                ln[i].next = new ListNode();
                ln[i] = ln[i].next;
                count++;
            }

            ln[i] = temp;
        }
        return ln;
    }
}
