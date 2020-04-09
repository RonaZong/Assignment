package xz222bb_assign1;

public class RandomSum {
    public static void main(String[] args) {
        System.out.print("Five random numbers: ");
        int number1 = (int)(Math.random() * 100 + 1);
        int number2 = (int)(Math.random() * 100 + 1);
        int number3 = (int)(Math.random() * 100 + 1);
        int number4 = (int)(Math.random() * 100 + 1);
        int number5 = (int)(Math.random() * 100 + 1);
        int sum = number1 + number2 + number3 + number4 + number5;
        System.out.print(number1 + " " + number2 + " " + number3 + " " + number4 + " " + number5 + "\n" +
                "There sum is " + sum);
    }
}
