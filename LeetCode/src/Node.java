

class GFD {

    Node head;
    public void pushdata(int i) {
        Node new_node=new Node(i);
         new_node.nextNode=head;
         head= new_node;
    }
    public void printNode(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val+"->");
            temp=temp.nextNode;
        }
    }
    public int getLength(){
        int length=0;
        Node temp=head;
        while(temp !=null){
            length++;
            temp=temp.nextNode;
        }
        return length;
    }

    public void findMiddleElement() {

        Node slow_ptr = head;
        Node fast_ptr = head;

        while (fast_ptr != null && fast_ptr.nextNode != null)
        {
            fast_ptr = fast_ptr.nextNode.nextNode;
            slow_ptr = slow_ptr.nextNode;
        }


        System.out.println(slow_ptr.val);

     /*   if (head != null) {
            int length = getLength();
            Node temp = head;
            int middleLength = length / 2;
            while (middleLength != 0) {
                temp = temp.nextNode;
                middleLength--;
            }
            System.out.print("The middle element is ["
                    + temp.val + "]");
            System.out.println();
        }*/
    }

    class Node {
        int val;
       Node nextNode;




        public Node(int i) {
            this.val=i;
            this.nextNode=null;
        }
    }




}

public  class Node{
    public static void main(String[] args) {
        GFD list1=new GFD();
        list1.pushdata(1);
        list1.pushdata(2);
        list1.pushdata(3);
      GFD n=new GFD();
      n.pushdata(1);
      n.pushdata(3);
      n.pushdata(4);

      GFD nw=new GFD();
      if(list1.equals(0)) System.out.println("n");
        if(n.equals(0)) System.out.println("List");





    }
}
