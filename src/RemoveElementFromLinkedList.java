public class RemoveElementFromLinkedList {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode temp =new ListNode();
        temp.next=head;
        ListNode test= temp;


        int count =0;
        int falg =0;
        while (test.next!=null){

            if(test.next.val==val){
                test.next=test.next.next;
            }else{test=test.next;}



        }


        return temp.next;
    }
}