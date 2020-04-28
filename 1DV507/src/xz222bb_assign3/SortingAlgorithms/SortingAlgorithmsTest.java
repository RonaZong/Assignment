package xz222bb_assign3.SortingAlgorithms;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmsTest {
    private static int count = 0;

    /* Executed before every test method */
    @BeforeEach
    public void setUp() {
        System.out.println("Run test method: " + (count++));
    }

    /* Executed after every test method */
    @AfterEach
    public void tearDown() {
        System.out.println(" --- done with test " + count);
    }

    /* My list of test methods */
    @Test
    void insertionSort() {
        // zero element
        int[] arr1 = new int[0];
        SortingAlgorithms.insertionSort(arr1);
        for (int i = 0; i < arr1.length - 1; i++) {
            assertTrue(arr1[i] <= arr1[i + 1]);
        }
        // one element
        int[] arr2 = {1};
        SortingAlgorithms.insertionSort(arr2);
        for (int i = 0; i < arr2.length - 1; i++) {
            assertTrue(arr2[i] <= arr2[i + 1]);
        }
        // many element
        int[] arr3 = random(100, 100); // Random array of size 100
        SortingAlgorithms.insertionSort(arr3);
        for (int i = 0; i < arr3.length - 1; i++) {
            assertTrue(arr3[i] <= arr3[i + 1]);
        }
    }

    @Test
    void mergeSort() {
        // zero element
        int[] arr1 = new int[0];
        SortingAlgorithms.insertionSort(arr1);
        for (int i = 0; i < arr1.length - 1; i++) {
            assertTrue(arr1[i] <= arr1[i + 1]);
        }
        // one element
        int[] arr2 = {1};
        SortingAlgorithms.insertionSort(arr2);
        for (int i = 0; i < arr2.length - 1; i++) {
            assertTrue(arr2[i] <= arr2[i + 1]);
        }
        // many element
        int[] arr3 = random(100,100); // Random array of size 100
        SortingAlgorithms.mergeSort(arr3);
        for (int i = 0; i < arr3.length - 1; i++) {
            assertTrue(arr3[i] <= arr3[i + 1]);
        }
    }

    @Test
    void testInsertionSort() {
        Comparator<String> Alphabetic = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());
        // zero element
        String[] arr1 = new String[0];
        SortingAlgorithms.insertionSort(arr1, Alphabetic);
        for (int i = 0; i < arr1.length - 1; i++) {
            assertTrue(Alphabetic.compare(arr1[i], arr1[i + 1]) <= 0);
        }
        // one element
        String[] arr2 = {"a"};
        SortingAlgorithms.insertionSort(arr2,Alphabetic);
        for (int i = 0; i < arr2.length - 1; i++) {
            assertTrue(Alphabetic.compare(arr2[i], arr2[i + 1]) <= 0);
        }
        // many element
        String[] arr3 = new String[]{"Ad", "dA", "Sc", "cS", "Fq", "Qf"};
        SortingAlgorithms.insertionSort(arr3,Alphabetic);
        for (int i = 0; i < arr3.length - 1; i++) {
            assertTrue(Alphabetic.compare(arr3[i],arr3[i+1])<=0);
        }
    }

    @Test
    void testMergeSort() {
        Comparator<String> Alphabetic = (s1, s2) -> s1.toLowerCase().compareTo(s2.toLowerCase());
        // zero element
        String[] arr1 = new String[0];
        SortingAlgorithms.mergeSort(arr1, Alphabetic);
        for (int i = 0; i < arr1.length - 1; i++) {
            assertTrue(Alphabetic.compare(arr1[i], arr1[i + 1]) <= 0);
        }
        // one element
        String[] arr2 = {"a"};
        SortingAlgorithms.mergeSort(arr2, Alphabetic);
        for (int i = 0; i < arr2.length - 1; i++) {
            assertTrue(Alphabetic.compare(arr2[i], arr2[i + 1]) <= 0);
        }
        // many element
        String[] arr3 = new String[]{"Ad", "dA", "Sc", "cS", "Fq", "Qf"};
        SortingAlgorithms.mergeSort(arr3, Alphabetic);
        for (int i = 0; i < arr3.length - 1; i++) {
            assertTrue(Alphabetic.compare(arr3[i], arr3[i + 1]) <= 0);
        }
    }

    private int[] random(int size,int max) { // Private help method
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] =1 + random.nextInt(max);
        }
        return arr;
    }
}