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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null)return head ;
        int len = 1 ;
        ListNode temp = head ;
        while(temp.next != null){
            len++ ;
            temp = temp.next ;
        }
        temp.next = head ;

        k = k%len ;
        for(int i = 1 ; i< len - k ; i++){
         head = head.next ;
        }
        temp = head.next ;
        head.next = null ;
        return temp ;
    }
}