package xz222bb_assign2;

public class BirthdayCandles {
    public static void main(String[] args) {
        final double NUMBER_OF_CANDLES_PER_BOX = 24;
        double numberOfBoxes;
        double numberOfSavedCandles = 0;
        double totalBoxes = 0;
        double age = 1;

        while (age <= 100) {
            if (numberOfSavedCandles < age) {
                numberOfBoxes = (int)(Math.ceil(((age-numberOfSavedCandles) / NUMBER_OF_CANDLES_PER_BOX) * 10 / 10));
                numberOfSavedCandles = (numberOfSavedCandles + (numberOfBoxes * NUMBER_OF_CANDLES_PER_BOX)) - age;
                System.out.println("Before birthday " + (int)age + ", buy " + (int)numberOfBoxes + " box(es)");
                totalBoxes += numberOfBoxes;
            }
            else {
                numberOfSavedCandles -= age;
            }

            age++;
        }

        System.out.println("Total number of boxes: " + (int) totalBoxes +
                ", Remaining candle: " + (int) numberOfSavedCandles);
    }
}
