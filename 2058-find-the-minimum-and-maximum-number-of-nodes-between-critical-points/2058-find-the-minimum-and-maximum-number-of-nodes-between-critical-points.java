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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        //int[] arr={-1,-1};
        //ArrayList<Integer> l1=new ArrayList<>;
        ListNode n1;
        ListNode node=head;
        int loc=1;
        int prev=0;
        int max=0;
        int flag=-1;
        int min=Integer.MAX_VALUE;
        while(node.next.next!=null){
            //n1=node;
            //node=node.next;
            loc++;
            
            if ((node.val > node.next.val && node.next.next.val > node.next.val) ||
                (node.val < node.next.val && node.next.next.val < node.next.val)) {
                if(flag==-1){
                    flag=loc;
                }
                else{
                min=Math.min(min,loc-prev);
                }
                prev=loc;
            }
            node=node.next;
        }
        if(flag==-1){
            return new int[]{-1,-1};
        }
        if(flag==prev){
            return new int[]{-1,-1};
        }
        return new int[]{min,prev-flag};
    }
}