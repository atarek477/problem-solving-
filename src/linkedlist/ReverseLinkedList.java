package linkedlist;

import java.util.List;
import java.util.Stack;

public class ReverseLinkedList {
    // not optimal
    public ListNode reverseList1(ListNode head) {

        ListNode q = head ;
        ListNode t = head ;

        Stack<Integer> stack =new Stack();
        while(q!=null){
            stack.push(q.val);
            q=q.next;
        }


        while(!stack.isEmpty())
        {
            t.val=stack.pop();
            t=t.next;
        }



        return head;

    }

    //optimal


}
