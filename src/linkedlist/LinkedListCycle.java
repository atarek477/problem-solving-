package linkedlist;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        Set<ListNode> hashMap= new HashSet<>();

        int count= 0;

        while(head!=null){

            if(hashMap.contains(head))
                return true;


            hashMap.add(head);

            head=head.next;
        }
        return false ;
    }

}
