/*
package AnotherSubclass;

import java.util.List;
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

}

    public class AddTwoNumber {

    public ListNode addNumber(ListNode l1,ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode l3=dummy;
        int carry=0;
        while(l1 !=null|| l2 !=null)
        {
         int l1_val=(l1 !=null) ? l1.val : 0;
         int l2_val=(l2 !=null)  ? l2.val :0;
         int cuurent_sum =l1_val+l2_val +carry;
         int lastdigit =cuurent_sum%10;

         ListNode new_node =new ListNode(lastdigit);
         l3.next=new_node;
         if (l1 !=null) l1=l1.next;
         if (l2 !=null) l2=l2.next;
         l3=l3.next;
         }
        if (carry>0)
        {
            ListNode new_node=new ListNode(carry);
            l3.next=new_node;
            l3=l3.next;
        }
        return dummy.next;
      //  public static void main(String[] args) {
        // ListNode l=new ListNode();
     //    l.next=new ListNode(1,null);

        }

    }
}*/
