package DataStructure;

public class ArrayList {
    Object arr[];
    int capacity;
    int size;

    ArrayList() {
        capacity = 10;
        size = 0;
        arr = new Object[capacity];
    }

    void add(Object item) {

        arr[size++] = item;
    }

    Object get(int index) {
        return arr[index];
    }

    int size() {
        return size;
    }
/*    void remove(Object item)
    {
        for(int i=0;i<size;i++)
        {
            Object o = arr[i];
            if(o==item)
            {
               add();
               break;
            }

        }
    }*/

    public static void main(String[] args) {
        ArrayList n=new ArrayList();
        n.add(1);
        n.add("dd");
        n.add(22.22);
        n.add(null);
        //        n.remove(1);
        for (int l=0;l<n.size;l++) {
            System.out.println(n.get(l));
        }
    }
}
