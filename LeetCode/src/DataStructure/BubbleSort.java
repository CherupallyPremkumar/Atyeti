package DataStructure;

import java.util.Arrays;

public class BubbleSort {
        static void bubbleSort(int array[]) {
            int length = array.length;
            for (int i = 0; i < length - 1; i++)  // Iterate till the largest element reaches at end of the array
                for (int j = 0; j < length - i - 1; j++)
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
        }
        public static void main(String args[]) {
            int[] data = { -2, 45, 0, 11, -9 };
            bubbleSort(data);
            for (int l=0;l<data.length;l++)
            {
                System.out.print(" "+data[l]);
            }
        }
    }

