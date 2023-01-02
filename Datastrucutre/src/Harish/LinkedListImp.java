package Harish;

import java.util.NoSuchElementException;

class LinkNode {
    int value;
    LinkNode next;

    LinkNode(int value) {
        this.value = value;
        this.next = null;
    }
}
public class LinkedListImp {
    LinkNode head;


    public void add(Integer item) {//12,

        LinkNode linkNode = new LinkNode(item);

        if (head == null) {
            head = linkNode;
        } else {
            LinkNode last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = linkNode;
        }
    }
    public void addFirst(Integer item) {
        LinkNode linkNode = new LinkNode(item);
        if (head == null) {
            head = linkNode;
        } else {
            linkNode.next = head;
            head = linkNode;
        }
    }
    public void add(Integer index, Integer in) {
        LinkNode linkNode = new LinkNode(in);
        if (head == null) {

        } else {
            LinkNode last = head;
            int count = 1;
            while (last.next != null) {
                if (count == index) {
                    linkNode.next = last.next;
                    last.next = linkNode;
                    break;
                }

                last = last.next;
                count++;
            }
        }
    }
    public Object get(Integer in) {
        LinkNode last = head;
        int count = 0;
        while (last.next != null) {

            if (count == in) {
                return last.value;

            }
            last = last.next;
            count++;
        }
        return new NullPointerException("index Excceded");
    }
    public void printList() {
        LinkNode current = head;
        while (current != null) {
            System.out.print(current.value + "  ");
            current = current.next;
        }
        System.out.println("/n");
    }
    public boolean contains(Integer in) {
        if (head == null) {
            throw new NullPointerException("head is null");
        } else {
            LinkNode last = head;
            while (last.next != null) {
                last = last.next;
                if (last.value == in) {
                    return true;
                }
            }
        }
        return false;
    }
    public void remove() {
        if (head == null) {
            throw new NoSuchElementException();
        } else {
            head = head.next;
        }
    }
    public void remove(Integer in)
    {
        LinkNode last=head;
        if(last.value==in)
        {
            head=last.next;
        }
       while(last.next != null)
       {
           if(last.next.value==in)
           {
            last.next=last.next.next;
           }
           last=last.next;
       }
    }
    //merge linked list into one
    public static LinkedListImp merge(LinkedListImp list,LinkedListImp list2)
    {
        LinkNode node=list.head;
        LinkNode node1=list2.head;
       LinkedListImp linkedListImp1 =new LinkedListImp();
       linkedListImp1.add(-1);

        LinkNode node3=linkedListImp1.head;
        boolean l= true;
        while(true)
        {
            if(node.next==null)
            {
                break;
            }
            if(l==true) {
                node3.next = node.next;
                System.out.println(node.value);
            }
            if(node.value==11 )
            {
                node3.next=node1;
                while(node3.next!=null)
                {
                    node3=node3.next;
                }
                l=false;

            }
            if(node.value==15)
            {
                node3.next=node.next;
            }
            node=node.next;


        }


        return linkedListImp1;
    }
    public static LinkedListImp accendingorder(LinkedListImp list,LinkedListImp list2)
    {
        LinkNode listhead=list.head;
        LinkNode list2head=list2.head;

        LinkedListImp list3=new LinkedListImp();
        list3.add(1);
        LinkNode dummy =list3.head;
        //LinkNode dummy=new LinkNode(-1);
        LinkNode tail=dummy;

        while(true)
        {
            if(listhead ==null)
            {
                tail.next =list2head;
                break;
            }
            if(list2head==null)
            {
                tail.next=listhead;
                break;
            }
            if(listhead.value<= list2head.value)
            {
                 tail.next=listhead;
                 listhead=listhead.next;
            }
            else
            {
              tail.next=list2head;
              list2head=list2head.next;
            }
            tail=tail.next;
        }


        return list3;
    }

    public static void main(String[] args) {
        LinkedListImp list = new LinkedListImp();
        list.add(13);
        list.add(123);
        list.add(1232);
        list.add(11);
        list.add(12);
        list.add(20);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        LinkedListImp list2 = new LinkedListImp();
        list2.add(12);
        list2.add(99);
        list2.add(55);
        list2.add(11);
        list2.add(134);// accendingorder(list,list2).printList();
        merge(list, list2).printList();

    }
}
