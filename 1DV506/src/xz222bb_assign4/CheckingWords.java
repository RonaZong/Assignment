package xz222bb_assign4;

import java.util.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CheckingWords {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Java\\IdeaProjects\\Assignment\\1DV506\\src\\xz222bb_assign4\\lovecraft.txt");
        Scanner scanner = new Scanner(file);

        String str;

        System.out.println("Reading " + file.getName() + " works...");
        if (scanner.hasNext()) {
            System.out.println("Done!\n" + "Analysing text...\n");
        }

        System.out.println("Most common word: " + mostCommon(file) + " with " + countMostCommon(mostCommon(file), file) + " occurrences");
        System.out.println("Second common word: " + secondCommon(file) + " with " + countSecondCommon(secondCommon(file), file) + " occurrences");
        System.out.println("Occurrences of \"Cthulhu\": " + countCthulhu(file));
        System.out.println("Occurrences of \"Azathoth\": " + countAzathoth(file));
        System.out.println("Occurrences of \"Necronomicon\": " + countNecronomicon(file));
        scanner.close();
    }

    public static String[] file(File file) throws IOException{
        Scanner scanner = new Scanner(file);
        String fileArray = "";
        List<String> text = new ArrayList<String>();

        while (scanner.hasNext()) {
            fileArray = scanner.next();
            text.add(fileArray);
        }
        String[] textArray = text.toArray(new String[0]);
        scanner.close();

        return textArray;
    }

    public static String mostCommon(File file) throws IOException{
        String[] arr = file(file);
        HashMap<String, Integer> store = new HashMap<String, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (store.containsKey(arr[i])) {
                store.put(arr[i], store.get(arr[i]) + 1);
            }
            else {
                store.put(arr[i], 1);
            }
        }

        Set<Map.Entry<String, Integer>> set = store.entrySet();
        String str = "";
        int value = 0;

        for (Map.Entry<String, Integer> word : set) {
            if (word.getValue() > value) {
                value = word.getValue();
                str = word.getKey();
            }
        }

        return str;
    }

    public static int countMostCommon(String mostCommon, File file) throws IOException{
        int count = 0;
        Scanner scanner = new Scanner(file);
        String str;

        while (scanner.hasNext()) {
            str = scanner.nextLine();
            if (str.toLowerCase().contains(mostCommon.toLowerCase())) {
                count++;
            }
        }
        scanner.close();

        return count;
    }

    public static String secondCommon(File file) throws IOException {
        String[] arr = file(file);
        HashMap<String, Integer> store = new HashMap<String, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (store.containsKey(arr[i])) {
                store.put(arr[i], store.get(arr[i]) + 1);
            }
            else {
                store.put(arr[i], 1);
            }
        }

        Set<Map.Entry<String, Integer>> set = store.entrySet();
        String str = "";
        int value = 0;

        for (Map.Entry<String, Integer> word : set) {
            if (word.getValue() > value && word.getValue() < countMostCommon(mostCommon(file), file)) {
                value = word.getValue();
                str = word.getKey();
            }
        }

        return str;
    }

    public static int countSecondCommon(String secondCommon, File file) throws IOException{
        int count = 0;
        Scanner scanner = new Scanner(file);
        String str;

        while (scanner.hasNext()) {
            str = scanner.nextLine();
            if (str.toLowerCase().contains(secondCommon.toLowerCase())) {
                count++;
            }
        }
        scanner.close();

        return count;
    }

    public static int countCthulhu(File file) throws IOException{
        int count = 0;
        Scanner scanner = new Scanner(file);
        String str;
        String search = "Cthulhu";

        while (scanner.hasNext()) {
            str = scanner.nextLine();
            if (str.toLowerCase().contains(search.toLowerCase())) {
                count++;
            }
        }
        scanner.close();

        return count;
    }

    public static int countAzathoth(File file) throws IOException{
        int count = 0;
        Scanner scanner = new Scanner(file);
        String str;
        String search = "Azathoth";

        while (scanner.hasNext()) {
            str = scanner.nextLine();
            if (str.toLowerCase().contains(search.toLowerCase())) {
                count++;
            }
        }
        scanner.close();

        return count;
    }

    public static int countNecronomicon(File file) throws IOException{
        int count = 0;
        Scanner scanner = new Scanner(file);
        String str;
        String search = "Necronomicon";

        while (scanner.hasNext()) {
            str = scanner.nextLine();
            if (str.toLowerCase().contains(search.toLowerCase())) {
                count++;
            }
        }
        scanner.close();

        return count;
    }


}
