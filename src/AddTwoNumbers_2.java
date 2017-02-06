/**
 * Created by algol on 2017/2/4.
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their
 * nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * 将两个反序存于链表中的非负整数求和 反序输出
 */
//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode preP3 = l3;
        int carry = 0;
        while(p1 != null || p2 != null){
            ListNode p3 = new ListNode(0);
            preP3.next = p3;
            int sum =0;
            if(p1 != null){
                sum = p1.val;
                p1 = p1.next;
            }
            if(p2 != null){
                sum = p2.val + sum;
                p2 = p2.next;
            }
            sum += carry;
            p3.val = sum % 10;
            carry = sum/10;
            preP3 = p3;
        }
        //最高位有进位的情况
        if(carry > 0){
            ListNode p3 = new ListNode(carry);
            preP3.next = p3;
        }
        return l3.next;
    }
}
