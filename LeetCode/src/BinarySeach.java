import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class BinarySeach {
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

    public static int binarySearch(int[] arr, Integer findinNumber, Integer start, Integer end, Integer length) {
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
        List<Integer> list = s.toList();
        System.out.println(list);
        // accending array
        int mid = start + (end - start) / 2;
        if (arr[mid] == findinNumber) return mid;
        else if (findinNumber >= arr[mid]) {
            return binarySearch(arr, findinNumber, mid + 1, end, length);
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
        List<Integer> list = s1.toList();
        System.out.println(list);

        int start = 0;
        int end = length;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (length == 0) return -1;
            if (arr[mid] == findingelemenet) return mid;
            else if (arr[mid] < findingelemenet) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }

    public static int[] sortMerge(int[] arr, int start, int end) {
        int length = arr.length;
        if (length == 0) return new int[0];
        if (start > end) {
            int mid = start + (end - start) / 2;
            sortMerge(arr, start, mid);
            sortMerge(arr, mid + 1, end);

        }
        return new int[12];
    }

 /*   public static int[] mergesort(int[] arr, Integer length) {

    }*/


    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 5, 4, 6, 5, 8, 7, 9, 8, 0};

        int findingnumber = 7;
        int length = arr.length;
        //System.out.println(binarySearch(arr,findingnumber,0,arr.length-1,arr.length));
        //  System.out.println(linearSearch(arr,findingnumber));
        //   System.out.println(linearserachRecursive(arr,findingnumber,length));
        System.out.println(binaryiterativeSearch(arr, findingnumber, length));
    }
}

