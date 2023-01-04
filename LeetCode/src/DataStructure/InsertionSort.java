package DataStructure;

import java.util.Arrays;

public class InsertionSort {
       static void insertionSort(int array[]) {
            int length = array.length;
            for (int i = 1; i < length; i++) {
                //It will compare the data and swap if the
                // key value pair is less than original.
                int key = array[i];
                int j = i - 1;
                while (j >= 0 && key < array[j]) {
                    array[j + 1] = array[j];
                   j--;
                }
                array[j + 1] = key;
            }
        }
        public static void main(String args[]) {
            int[] data = { 9, 5, -1, 4, 3 };
            insertionSort(data);
            for (int l=0;l<data.length;l++)
            {
                System.out.print(" " +data[l]);
            }
        }
    }

