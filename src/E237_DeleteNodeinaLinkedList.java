/**
 *
 * Created by algol on 2017/8/9.
 */
public class E237_DeleteNodeinaLinkedList {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public void deleteNode(ListNode node) {
        if(node == null){
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
