package linkedlist;

import java.util.Stack;

public class PalindromeLinkedList {
    public boolean isPalindrome1(ListNode head) {


        ListNode temp =head;
        Stack<Integer> stack= new Stack<>();
        while (temp!=null){

            stack.push(temp.val);
            temp = temp.next;

        }
        int i=0;
        while (head!=null){
            if (stack.pop()!=head.val)
                return false;

            head=head.next;
            i++;

        }


        return true;
    }
}
