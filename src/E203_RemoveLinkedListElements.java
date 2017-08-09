/**
 * Created by algol on 2017/8/9.
 */
public class E203_RemoveLinkedListElements {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;
        while(head != null&&head.val == val){
            head = head.next;
        }
        ListNode first = head.next;
        ListNode p = head;
        ListNode second = head;
        while(first != null){
            if(first.val == val){
                second.next = first.next;
                first = second.next;
            }else{
                second = first;
                first = first.next;
            }
        }
        return head;
    }
}
