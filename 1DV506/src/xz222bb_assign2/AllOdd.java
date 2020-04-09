package xz222bb_assign2;

public class AllOdd {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        System.out.print("Complete Array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random() * 100);
            System.out.print(numbers[i] + " ");
        }

        System.out.print("\nAll odd numbers: ");
        oddNumbers(numbers);
    }

    private static void oddNumbers(int[] number) {
        for (int i = 0; i < number.length; i++)
            if ((number[i] + 1) % 2 == 0)
                System.out.print(number[i] + " ");
    }
}
