package DataStructure;

public class Queue {
    private int[] arr;
    private  int front;
    private int rear;
    private int capacity;
    private int count;

    Queue(int size)
    {
        arr=new int[size];
        capacity=size;
        front= 0;
        rear=-1;
        count=0;
    }

    public  int dequeue(int item)
    {
        if(isEmpty())
        {
            System.out.println("terminated");
            System.exit(-1);
        }
        int x=arr[front];
        System.out.println("remove"+item);
        front=(front+1)% capacity;
        count--;
        return x;

    }
    public void enqueue(int item){
        if (isFull()){
            System.out.println("terminated");
            System.exit(-1);
        }
        System.out.println("adding "+item);
        rear =(rear+1) %capacity;
        arr[rear]=item;
        count++;
    }
     public boolean isEmpty()
     {
         return (size()==0);
     }
     public int size()
     {
         return count;
     }
     public boolean isFull(){
        return (size()==capacity);
     }

    public static void main(String[] args) {
        Queue q=new Queue(5);
        System.out.println(q.isFull());
        boolean b=q.isFull();
        q.enqueue(12);
        int a=q.size();
        System.out.println(a);
    }

}
