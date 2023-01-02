package Harish;

import java.util.ArrayList;
import java.util.Stack;

public class DataStructure {
    static Stack<Object> tack = new Stack<>();

    static ArrayList<Object> array = new ArrayList<>();
    static int top = -1;

    public void push(Object in) {
        array.add(in);
        top++;
    }

    public void pop() {
        array.remove(top);
        top--;
    }

    public void printstack() {
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }

    public Object peek() {

        return array.get(top);
    }

    public boolean empty() {
        return (top == -1);
    }

    public boolean search(Object in) {
        int i = 0;
        while (i < array.size()) {
            if (in.equals(array.get(i))) {
                return true;
            }
            i++;
        }
        return false;
    }

    //Java program to reverse a string using stacks.
    public void reverseString(Object in) {
        String str = in.toString();
        for (int i = 0; i < str.length(); i++) {
            push(str.charAt(i));
        }
        String str1 = "";
        while (top >= 0) {
            str1 = str1 + peek().toString();
            pop();
            System.out.println(top);
        }
        System.out.println(str1);

    }

    public static void main(String[] args) {

        DataStructure dataStructure = new DataStructure();
        dataStructure.reverseString("premkumar");

    }
}
