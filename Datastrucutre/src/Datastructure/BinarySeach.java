package Datastructure;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

 class BinarySeach {
    //linear search
    public static int linearSearch(int[] arr, Integer findingnumber) {

        if (arr.length == 0) return -1;
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] == findingnumber) // time copmexity 0(n)
                return i;
        }
        return -1;
    }//1 0 ,2 1,3 2

    //linear search revurisive
    public static int linearserachRecursive(int[] arr, Integer findingNumber, int length) {

        if (length == 0) return -1;
        else if (arr[length - 1] == findingNumber) return length - 1;
        else return linearserachRecursive(arr, findingNumber, length - 1);  //o(log n)
    }

    public static int binarySearch(int[] arr, Integer findinNumber, Integer start, Integer End, Integer length) {
        if (length == 0) return -1;
        int temp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        Stream<Integer> s = Arrays.stream(arr).boxed();
        //List<Integer> list = s.toList();
        //System.out.println(list);
        // accending array
        int mid = start + (End - start) / 2;
        if (arr[mid] == findinNumber) return mid;
        else if (findinNumber >= arr[mid]) {
            return binarySearch(arr, findinNumber, mid + 1, End, length);
        } else {
            return binarySearch(arr, findinNumber, start, mid - 1, length);
        }

    }

    //iterative method
    public static int binaryiterativeSearch(int[] arr, Integer findingelemenet, Integer length) {

        System.out.println(length);
        int temp = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        Stream<Integer> s1 = Arrays.stream(arr).boxed();
      //  List<Integer> list = s1.toList();
      //  System.out.println(list);

        int start = 0;
        int End = length;

        while (start <= End) {
            int mid = start + (End - start) / 2;
            if (length == 0) return -1;
            if (arr[mid] == findingelemenet) return mid;
            else if (arr[mid] < findingelemenet) start = mid + 1;
            else End = mid - 1;
        }
        return -1;
    }

    //merge sort
    static void merge(int arr[], int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int Start[] = new int[n1];
        int End[] = new int[n2];
        for (int i = 0; i < n1; ++i)
            Start[i] = arr[start + i];
        for (int j = 0; j < n2; ++j)
            End[j] = arr[mid + 1 + j];
        int i = 0, j = 0;
        int k = start;
        while (i < n1 && j < n2) {
            if (Start[i] <= End[j]) {
                arr[k] = Start[i];
                i++;
            } else {
                arr[k] = End[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = Start[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = End[j];
            j++;
            k++;
        }
    }

    static void sort(int arr[], int start, int end) {
        if (start < end) {//
            int mid = start + (end - start) / 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 4, 6, 5, 8, 7, 9, 8, 0};

        int findingnumber = 7;
        int length = arr.length;
        //System.out.println(binarySearch(arr,findingnumber,0,arr.length-1,arr.length));
        //  System.out.println(linearSearch(arr,findingnumber));
        //   System.out.println(linearserachRecursive(arr,findingnumber,length));
        //System.out.println(binaryiterativeSearch(arr, findingnumber, length));
        sort(arr, 0, arr.length - 1);
    }


}

