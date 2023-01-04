package DataStructure;

import java.util.*;
import java.util.ArrayList;

class LNode
{
    int data;
    LNode next;
    LNode(int d)
    {
        data=d;
    }
}
class Stack
{
    LNode push(int d, LNode head){
        LNode tmp1 = new LNode(d);
        if(head==null)
            head=tmp1;
        else
        {
            tmp1.next=head;
            head=tmp1;
        }
        return head;
    }
    LNode pop(LNode head){
        if(head==null)
            System.out.println("underflow");
        else
            head=head.next;
        return head;
    }
    void display(LNode head){
        System.out.println("\n list is : ");
        if(head==null){
            System.out.println("no LNodes");
            return;
        }
        LNode tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+" ");
            tmp=tmp.next;
        }
    }
    boolean isEmpty(LNode head)
    {
        if(head==null)
            return true;
        else
            return false;
    }
    int peek(LNode head)
    {
        if(head==null)
            return -1;
        return head.data;
    }
}
class Demo{

    public static void main(String[] args)
    {
        Stack s=new Stack();
        LNode head=new LNode(2);
    s.push(1,head);
    s.display(head);
    }
}
