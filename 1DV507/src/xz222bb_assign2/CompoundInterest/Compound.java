package xz222bb_assign2.CompoundInterest;

public class Compound {
    private double startAmount;
    private double interest;
    private int numberOfYears;

    public Compound(double startAmount, double interest, int numberOfYears) {
        this.startAmount = startAmount;
        this.interest = interest;
        this.numberOfYears = numberOfYears;
    }

    public double getStartAmount() {
        return startAmount;
    }

    public void setStartAmount(double startAmount) {
        this.startAmount = startAmount;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public int getTotalAmount() {
        return (int)Math.round(startAmount * Math.pow((1 + interest / 100), numberOfYears));
    }
}
