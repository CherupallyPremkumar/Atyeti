package Harish;

import java.math.BigInteger;
import java.util.*;

public class ProblemSolvingTwo {
    //CommaSeparator USing StringBuilder
    public static String commaSeperator(List<String> list) {
        final Character CHAR = ',';
        StringBuilder stringBuilder = new StringBuilder();

        for (int left = 0; left < list.size(); left++) {
            if (left == list.size() - 1) {
                stringBuilder.append(list.get(left));
            } else {
                stringBuilder.append(list.get(left));
                stringBuilder.append(CHAR);
            }
        }
        return stringBuilder.toString();
    }

    //CommaSeperator using String
    public static String commaSeperatorString(List<String> list) {
        String str = String.join(",", list);
        return str;
    }

    //Given string str, the task is to write a Java program to swap the pairs of characters of a string.
    // If the string contains an odd number of characters then the last character remains as it is.
    public static String pairOfCharacter(String str) {
        char[] cha = str.toCharArray();//5
        int left = 0;
        int right = 1;
        while (left < right) {
            if (left == cha.length || left + 1 == cha.length) {
                return new String(cha);
            }
            char temp;
            temp = cha[left];
            cha[left] = cha[right];
            cha[right] = temp;
            left += 2;
            right += 2;
        }
        return "";
    }

    public static String addStringAtIndex(String str, String str1, Integer in) {
        StringBuilder s = new StringBuilder();
        s.append(str, 0, in + 1);
        s.append(str1);
        s.append(str, in + 1, str.length());
        return new String(s);
    }

    public static Integer sumOfFabiEvenNumber(int num) {
        int[] num1 = new int[1 + num * 2];
        num1[0] = 0;
        num1[1] = 1;
        int s = 0;
        int left = 2;
        while (left <= num * 2) {
            num1[left] = num1[left - 1] + num1[left - 2];
            System.out.println(num1[left]);
            if (left % 2 == 0) {
                s += num1[left];
            }
            left++;
        }
        return s;
    }

    public static Boolean leapYear(int year) {
        if (year % 4 == 0 || year % 100 == 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static int secondLargestElement(List<Integer> list) {
        int left = 0, right = left + 1;
        int  second=Integer.MIN_VALUE;
        int value=0;
        while (left < right)//1, 2, 3, 4, 28, 6, 23, 2, 1, 4, 32, 44
        {
            if (right < list.size() ) {
                if (list.get(left) > list.get(right)) {
                    right++;

                } else {

                    left=right;
                    right++;
                }
            } else {
                 value= list.get(left);

            }
        }
        for (int i=0;i<list.size();i++)
        {
            if(list.get(i)!=value)
                second=Math.min(second,list.get(i));
        }

        return second;
    }
    public static void print2largest(int arr[], int arr_size)
    {
        int i, first, second;

        // There should be atleast two elements
        if (arr_size < 2)
        {
            System.out.printf(" Invalid Input ");
            return;
        }

        int largest = second = Integer.MIN_VALUE;
        System.out.println(largest);

        for(i = 0; i < arr_size; i++)
        {
            largest = Math.max(largest, arr[i]);
        }

        for(i = 0; i < arr_size; i++)
        {
            if (arr[i] != largest)
                second = Math.max(second, arr[i]);
        }

    }

    public static void main(String[] args) {
        List<String> ll = new ArrayList<>();
        ll.add("G");
        ll.add("e");
        ll.add("e");
        ll.add("k");
        ll.add("s");
        //System.out.println(pairOfCharacter("Geek"));
        //System.out.println(addStringAtIndex("Geeks   Geeks"," for",4));
        //System.out.println( sumOfFabiEvenNumber(4));
        //  System.out.println(leapYear(2000));
        //  System.out.println(leapYear(1997));
        //  System.out.println(BigInteger.probablePrime(4,new Random()));
        ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1000, 2, 3, 4, 28, 6, 222, 2, 1, 4, 222, 522));
        System.out.println(l.get(5));
        System.out.println(secondLargestElement(l));

    }
}
;