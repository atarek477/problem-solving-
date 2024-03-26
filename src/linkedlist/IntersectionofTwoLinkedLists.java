package linkedlist;

import org.w3c.dom.Node;

public class IntersectionofTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode nodeA=headA;
       ListNode nodeB=headB;

        int count1=0;
        int count2=0;
         while (nodeA.next!=null)
        {
            count1++;
            nodeA=nodeA.next;

        }
        while (nodeB.next!=null)
        {
            count2++;
            nodeB=nodeB.next;

        }
        if (nodeB!=nodeA){
            return null;
        }
        count1++;
        count2++;

        if(count1>count2){
            while (count1!=count2){

                headA=headA.next;
                count1--;
            }
            while (headA!=headB){

                headA=headA.next;
                headB=headB.next;
            }
            return headA;

        } else if (count1<count2) {
            while (count1!=count2){

                headB=headB.next;
                count2--;
            }
            while (headA!=headB){

                headA=headA.next;
                headB=headB.next;
            }
            return headA;
        }else {


            while (headA!=headB){

                headA=headA.next;
                headB=headB.next;
            }
            return headA;
        }


    }






}
