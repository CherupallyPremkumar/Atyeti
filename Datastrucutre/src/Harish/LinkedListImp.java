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

    public void remove(Integer in) {
        LinkNode last = head;
        if (last.value == in) {
            head = last.next;
        }
        while (last.next != null) {
            if (last.next.value == in) {
                last.next = last.next.next;
            }
            last = last.next;
        }
    }

    //merge linked list into one
    public static LinkedListImp merge(LinkedListImp list, LinkedListImp list2) {
        LinkNode node = list.head;
        LinkNode node1 = list2.head;
        LinkedListImp linkedListImp1 = new LinkedListImp();
        linkedListImp1.add(-1);

        LinkNode node3 = linkedListImp1.head;
        boolean l = true;
        while (true) {
            if (node.next == null) {
                break;
            }
            if (l == true) {
                node3.next = node.next;
                System.out.println(node.value);
            }
            if (node.value == 11) {
                node3.next = node1;
                while (node3.next != null) {
                    node3 = node3.next;
                }
                l = false;

            }
            if (node.value == 15) {
                node3.next = node.next;
            }
            node = node.next;


        }


        return linkedListImp1;
    }

    public static LinkedListImp accendingorder(LinkedListImp list, LinkedListImp list2) {
        LinkNode listhead = list.head;
        LinkNode list2head = list2.head;

        LinkedListImp list3 = new LinkedListImp();
        list3.add(1);
        LinkNode dummy = list3.head;
        //LinkNode dummy=new LinkNode(-1);
        LinkNode tail = dummy;

        while (true) {
            if (listhead == null) {
                tail.next = list2head;
                break;
            }
            if (list2head == null) {
                tail.next = listhead;
                break;
            }
            if (listhead.value <= list2head.value) {
                tail.next = listhead;
                listhead = listhead.next;
            } else {
                tail.next = list2head;
                list2head = list2head.next;
            }
            tail = tail.next;
        }


        return list3;
    }

    public static LinkedListImp addTwoList(LinkedListImp list, LinkedListImp list2) {
        LinkNode l = list.head;
        LinkNode l2 = list2.head;
        int ll = 0;
        while (l != null || l2!=null) {
            int lval=(l!=null) ? l.value : 0;
            int lval2=(l2!=null) ? l2.value :0;
            int value = lval+lval2 ;
            if (value >= 10) {
                if(l.next==null)
                {
                    l.value=value;
                }else {
                    l.value = (value % 10) +ll;
                }

                ll = (value+ll ) / 10;
            } else {
                l.value = value+ll;
                ll=0;
            }
            l = l.next;
            l2 = l2.next;
        }

        return list;
    }
     public static LinkedListImp reverseLinkedList(LinkedListImp list)
     {
         LinkNode current=list.head;
         LinkNode prev=null;
         LinkNode next=null;
         while(current!=null)
         {
             next=current.next;
             current.next=prev;
             prev=current;
             current=next;
         }
         list.head=prev;
         return list;
     }
     public static LinkNode reverseLinkedRecursive(LinkNode head)
     {
         if(head==null || head.next==null)
         {
             return head;
         }
             LinkNode rest=reverseLinkedRecursive(head.next);
            head.next.next=head;
            head.next=null;
         return rest;
     }
    public static void main(String[] args) {
        LinkedListImp list = new LinkedListImp();
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(9);
        list.add(2);

        LinkedListImp list2 = new LinkedListImp();
        list2.add(9);
        list2.add(9);
        list2.add(9);
        list2.add(9);


        // accendingorder(list,list2).printList();
       // addTwoList(list, list2).printList();
         // reverseLinkedList(list).printList();
       LinkNode l= reverseLinkedRecursive(list.head);
       while(l!=null)
       {
           System.out.println(l.value);
           l=l.next;
       }
    }
}
