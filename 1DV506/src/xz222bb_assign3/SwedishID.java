package xz222bb_assign3;

public class SwedishID {
    private DateFormat birthday = new DateFormat();
    private int serialNumber;
    private int checksum;
    private boolean valid;

    public SwedishID(String id) {
        this.birthday.setYear(Integer.parseInt(id.substring(0, 4)));
        this.birthday.setMonth(Integer.parseInt(id.substring(4, 6)));
        this.birthday.setDay(Integer.parseInt(id.substring(6, 8)));
        this.birthday.setPunctuation("!");
        this.birthday.setFormat("b");
        this.serialNumber = Integer.parseInt((id.substring(9,12)));
        this.checksum = Integer.parseInt(id.substring(12));
    }

    public int getChecksum() {
        return checksum;
    }

    public void setChecksum(int checksum) {
        this.checksum = checksum;
    }

    public String showID() {
        return this.birthday.getDate(true) + "-" + this.serialNumber + this.checksum;
    }

    public boolean isFemale() {
        return showID().charAt(11) % 2 == 0;
    }

    public int comparedTo(SwedishID otherID) {
        return this.birthday.getDate(false).compareTo(otherID.birthday.getDate(false));
    }

    public boolean validID() {
        int dig2 = Integer.parseInt(showID().substring(2,3)) * 2;
        int dig3 = Integer.parseInt(showID().substring(3,4));
        int dig4 = Integer.parseInt(showID().substring(4,5)) * 2;
        int dig5 = Integer.parseInt(showID().substring(5,6));
        int dig6 = Integer.parseInt(showID().substring(6,7)) * 2;
        int dig7 = Integer.parseInt(showID().substring(7,8));
        int dig9 = Integer.parseInt(showID().substring(9,10)) * 2;
        int dig10 = Integer.parseInt(showID().substring(10,11));
        int dig11 = Integer.parseInt(showID().substring(11,12)) * 2;

        int sum = dig2 / 10 + dig2 % 10 + dig3 + dig4 / 10 + dig4 % 10 + dig5 + dig6 / 10 + dig6 % 10 + dig7 + dig9 / 10 + dig9 % 10 + dig10 + dig11 / 10 + dig11 % 10;

        int lastDigOfSum = sum % 10;
        int check = 10 - lastDigOfSum;

        return this.checksum == check;
    }
}
