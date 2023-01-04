package DataStructure;

import java.util.Arrays;

public class SelectionSort {
        static  void selectionSort(int array[]) {
            int length = array.length;
            for (int k = 0; k < length - 1; k++) {
                int index = k;
                for (int i = k + 1; i < length; i++) {
                    if (array[i] < array[index]) {
                        index = i;
                    }
                }
                int temp = array[k];
                array[k] = array[index];
                array[index] = temp;
            }
        }
        public static void main(String args[]) {
            int[] data = { 2, 5, 133, 0, -1 };
          selectionSort(data);
            System.out.println(Arrays.toString(data));
        }
    }

