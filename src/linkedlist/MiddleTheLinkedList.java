package linkedlist;

public class MiddleTheLinkedList {

    public ListNode middleNode(ListNode head) {
        int count =0;
        ListNode temp = head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println(count);
        for (int i = 0; i <(count/2) ; i++) {
            head=head.next;

        }

    return head;
    }


}
