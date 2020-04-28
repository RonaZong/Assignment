package xz222bb_assign4.Time;

import java.util.Comparator;
import java.util.Random;

public class Exercise7 {
    public static void main(String[] args) {
        insertionInt();

        insertionString();

        mergeInt();

        mergeString();
    }

    private static void insertionInt(){
        int[] arr;
        int count = 100;
        long time;
        do {
            arr = generateIntArray(count);
            time = insertionInt(arr);
            if (time > 1000) {
                count /= 2;
            }
            else {
                count = count + count / 2;
            }
        } while (time < 900 || time > 1100);
        System.out.println("In " + time / 1000.0 + " second, sort " + arr.length + " int array by insertion");
    }

    private static void insertionString(){
        String[] arr;
        int count = 100;
        long time;
        do {
            arr = generateStringArray(count);
            time = insertionString(arr);
            if (time > 1000) {
                count /= 2;
            }
            else {
                count = count + count / 2;
            }
        } while (time < 900 || time > 1100);
        System.out.println("In " + time / 1000.0 + " second, sort " + arr.length + " String array by insertion");
    }

    private static void mergeInt(){
        int[] arr;
        int count = 100;
        long time;
        do {
            arr = generateIntArray(count);
            time = mergeInt(arr);
            if (time > 1000) {
                count /= 2;
            }
            else {
                count = count + count / 2;
            }
        } while (time < 900 || time > 1100);
        System.out.println("In " + time / 1000.0 + " second, sort " + arr.length + " int array by merge");
    }

    public static void mergeString(){
        String[] arr;
        int count = 100;
        long time;
        do {
            arr = generateStringArray(count);
            time = mergeString(arr);
            if (time > 1000) {
                count /= 2;
            }
            else {
                count = count + count / 2;
            }
        } while (time < 900 || time > 1100);
        System.out.println("In " + time / 1000.0 + " second, sort " + arr.length + " String array by merge");
    }

    private static long insertionInt(int[] arr){
        long start = System.currentTimeMillis();
        Sorting.insertionSort(arr);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long insertionString(String[] arr){
        Comparator<String> Alphabetic = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());
        long start = System.currentTimeMillis();
        Sorting.insertionSort(arr, Alphabetic);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long mergeInt(int[] arr){
        long start = System.currentTimeMillis();
        Sorting.mergeSort(arr);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long mergeString(String[] arr){
        Comparator<String> Alphabetic = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());
        long start = System.currentTimeMillis();
        Sorting.mergeSort(arr, Alphabetic);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static int[] generateIntArray(int size){
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++){
            arr[i] = random.nextInt(1000);
        }
        return arr;
    }

    private static String[] generateStringArray(int size){
        String[] arr = new String[size];
        for (int i = 0; i < size; i++) {
            arr[i] = generateString();
        }
        return arr;
    }

    private static String generateString(){
        String str = "";
        Random random = new Random();
        for (int i = 0; i < 4; i++){
            int randomInt = random.nextInt(25);
            str = (char)('a' + randomInt) + " ";
        }
        return str;
    }
}
