package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class ReorderLinkedList {

    public void reorderList(ListNode head) {

        if(head.next==null)
            return;

        ListNode counter = head;
        int count=0;
        int flag=0;
        int index=1;

        List<ListNode> list= new ArrayList<>();

        while (counter!=null){
            list.add(counter);
            counter= counter.next;
            count ++;

        }


        for (int i = 0; i <count ; i++) {
            if (flag==0){head.next= list.get(list.size()-index);
            }
            if (flag==1){head.next= list.get(index);
                index++;
            }
            head= head.next;

            flag=1^flag;
        }
        head.next =null;






    }
}
