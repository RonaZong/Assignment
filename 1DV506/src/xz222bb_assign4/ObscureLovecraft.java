package xz222bb_assign4;

import java.io.*;
import java.util.Scanner;


public class ObscureLovecraft {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Java\\IdeaProjects\\Assignment\\1DV506\\src\\xz222bb_assign4\\lovecraft.txt");

        Scanner scanner = new Scanner(file);
        Scanner input = new Scanner(System.in);
        String option = "1";
        int numberOfOption;

        while (!option.equals("0")) {
            System.out.println("\nObscure\n=======\n" +
                    "1. Make obscure\n" +
                    "2. Make readable\n" +
                    "3. Print obscure\n" +
                    "4. Print readable\n" +
                    "0. Exit\n");

            System.out.print("==> ");
            option = input.nextLine();

            if (option.equals("0")) {
                System.out.println("Bye, bye!");
                System.exit(1);
            }
            else if (!(option.equals("1") || option.equals("2") || option.equals("3") || option.equals("4"))) {
                System.out.println("That is not an option.");
            }
            else {
                numberOfOption = Integer.parseInt(option);
                switch (numberOfOption) {
                    case 1:
                        option = "1";
                        createObscure(file);
                        System.out.println("Done!");
                        break;
                    case 2:
                        option = "2";
                        file = new File("C:\\Users\\Yun\\IdeaProjects\\Assignment\\1DV506\\src\\xz222bb_assign4\\obscure.txt");
                        createReadable(file);
                        System.out.println("Done!");
                        break;
                    case 3:
                        option = "3";
                        file = new File("C:\\Users\\Yun\\IdeaProjects\\Assignment\\1DV506\\src\\xz222bb_assign4\\obscure.txt");
                        printObscure(file);
                        break;
                    case 4:
                        option = "4";
                        file = new File("C:\\Users\\Yun\\IdeaProjects\\Assignment\\1DV506\\src\\xz222bb_assign4\\readableLovecraft.txt");
                        printReadable(file);
                        break;
                }
            }
        }

        System.out.println("Bye, bye!");

        scanner.close();
        input.close();
    }


    public static char encode(char character) {
        boolean isLower = Character.isLowerCase(character);
        char c = Character.toLowerCase(character);

        if (c < 'a' || c > 'z') {
            return character;
        }
        else {
            char newC = (char) ((c - 'a' + 3) % 26 + 'a');
            return isLower ? newC : Character.toUpperCase(newC);
        }
    }

    public static void createObscure(File file) throws IOException {
        File encode = new File("C:\\Users\\Yun\\IdeaProjects\\Assignment\\1DV506\\src\\xz222bb_assign4\\obscure.txt");
        encode.createNewFile();

        BufferedReader obscure = new BufferedReader(new FileReader(file));
        BufferedWriter output = new BufferedWriter(new FileWriter(encode));
        String str;

        try {
            while (obscure.ready()) {
                str = obscure.readLine();

                for (int i = 0; i < str.length(); i++) {
                    output.write(encode(str.charAt(i)));
                }

                output.write("\n");
            }
        }
        catch (IOException e) {
        }
        output.close();
    }

    public static void printObscure(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        String line;
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }


    public static char decode(char character) {
        boolean isLower = Character.isLowerCase(character);
        char c = Character.toLowerCase(character);

        if (c < 'a' || c > 'z') {
            return character;
        }
        else {
            char newC = (char) ((c - 'a' - 3) % 26 + 'a');
            return isLower ? newC : Character.toUpperCase(newC);
        }
    }

    public static void createReadable(File file) throws IOException {
        File decode = new File("C:\\Users\\Yun\\IdeaProjects\\Assignment\\1DV506\\src\\xz222bb_assign4\\readableLovecraft.txt");
        decode.createNewFile();

        BufferedReader readable = new BufferedReader(new FileReader(file));
        BufferedWriter output = new BufferedWriter(new FileWriter(decode));
        String str;

        try {
            while (readable.ready()) {
                str = readable.readLine();

                for (int i = 0; i < str.length(); i++) {
                    output.write(decode(str.charAt(i)));
                }

                output.write("\n");
            }
        }
        catch (IOException e) {
        }
        output.close();
    }

    public static void printReadable(File file) throws IOException {
        Scanner scanner = new Scanner(file);
        String line;
        while (scanner.hasNext()) {
            line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();
    }
}
