package xz222bb_assign3.SortingAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int[] integer1 = {2, 56, 3, -34, 5, 98, 123, -45, -23};
        String[] strings1 = {"Ad", "dA", "Sc", "cS", "Fq", "Qf"};
        Comparator<String> alphabetic = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());

        insertionSort(integer1);
        System.out.println("Insertion sort: " + Arrays.toString(integer1));

        insertionSort(strings1, alphabetic);
        System.out.println("Insertion sort: " + Arrays.toString(strings1));

        int[] integer2 = {2, 56, 3, -34, 5, 98, 123, -45, -23};
        String[] strings2 = {"Ad", "dA", "Sc", "cS", "Fq", "Qf"};

        mergeSort(integer2);
        System.out.println("Insertion sort: " + Arrays.toString(integer2));

        mergeSort(strings2, alphabetic);
        System.out.println("Insertion sort: " + Arrays.toString(strings2));

    }

    public static int[] insertionSort(int[] in) {
        for (int i = 0; i < in.length; i++) {
            int current = in[i];
            int temp = i - 1;
            while (temp >= 0 && in[temp] > current) {
                in[temp + 1] = in[temp];
                temp--;
            }
            in[temp + 1] = current;
        }
        return in;
    }

    public static int[] mergeSort(int[] in) {
        if (in.length == 1) {

        }
        else {
            int[] left = new int[in.length / 2];
            int[] right = new int[in.length - left.length];
            System.arraycopy(in, 0, left, 0, left.length);
            System.arraycopy(in, left.length, right, 0, right.length);
            mergeSort(left);
            mergeSort(right);
            merge(left, right, in);
        }
        return in;
    }

    public static void merge(int[] left, int[] right, int[] update) {
        int indexLeft = 0;
        int indexRight = 0;
        int indexUpdate = 0;

        while (indexLeft < left.length && indexRight < right.length) {
            if (left[indexLeft] > right[indexRight]) {
                update[indexUpdate] = right[indexRight];
                indexUpdate++;
                indexRight++;
            }
            else {
                update[indexUpdate] = left[indexLeft];
                indexUpdate++;
                indexLeft++;
            }
        }

        // only left is left or right
        while (indexLeft < left.length) {
            update[indexUpdate] = left[indexLeft];
            indexUpdate++;
            indexLeft++;
        }
        while (indexRight < right.length) {
            update[indexUpdate] = right[indexRight];
            indexUpdate++;
            indexRight++;
        }
    }


    /*
    String
     */
    public static String[] insertionSort(String[] in, Comparator<String> c) {
        for (int i = 0; i < in.length; i++){
            String currentString = in[i];
            int temp = i-1;
            while (temp >= 0 && c.compare(in[temp],currentString)>0){
                //remove bigger number
                in[temp + 1] = in[temp];
                temp--;
            }
            //insert the sorted number
            in[temp + 1] = currentString;
        }
        return in;
    }

    public static String[] mergeSort(String[] in, Comparator<String> c) {
        if (in.length == 1) {
        }
        else {
            String[] left = new String[in.length / 2];
            String[] right = new String[in.length - left.length];
            System.arraycopy(in, 0, left, 0, left.length);
            System.arraycopy(in, left.length, right, 0, right.length);
            merge(left, right, in, c);
        }
        return in;
    }

    public static void merge(String[] left, String[] right, String[] update, Comparator<String> c){
        int indexLeft = 0;
        int indexRight = 0;
        int indexUpdate = 0;

        while (indexLeft < left.length && indexRight < right.length){
            if (c.compare(left[indexLeft],right[indexRight])>0){
                update[indexUpdate] = right[indexRight];
                indexUpdate++;
                indexRight++;
            }
            else{
                update[indexUpdate] = left[indexLeft];
                indexUpdate++;
                indexLeft++;
            }
        }
        //only left is left or right
        while (indexLeft < left.length){
            update[indexUpdate] = left[indexLeft];
            indexUpdate++;
            indexLeft++;
        }
        while (indexRight < right.length){
            update[indexUpdate] = right[indexRight];
            indexUpdate++;
            indexRight++;
        }
    }
}
