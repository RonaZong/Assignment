package xz222bb_assign3;

public class DateFormat {
    private int year, month, day;
    private String punctuation;
    private String format;
    private int cutYear;

    public DateFormat() {
    }

    public DateFormat(int year, int month, int day, String punctuation, String format) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.punctuation = punctuation;
        this.format = format;
    }

    public String getDate(boolean fullYear) {
        if (fullYear == true) {
            this.cutYear = this.year;
        }
        else if (fullYear == false ) {
            this.cutYear = this.year % 100;
        }
        return getFormat();
    }

    private void checkYear(int year) {
        if (year < 1900 || year > 2100) {
            this.year = 0;
            this.format = "Invalid date";
        }
    }
    private boolean isLeapYear(int year) {
        return this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0);
    }

    private void checkMonth(int month) {
        if (month < 1 || month > 12) {
            this.month = 0;
            this.format = "Invalid date";
        }
    }

    private void checkDay(int day) {
        if (((this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8 || this.month == 10 || this.month == 12)
                && (this.day < 1 || this.day > 31))) {
            this.day = 0;
            this.format = "Invalid date";
        }

        else if (((this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11)
                && (this.day < 1 || this.day > 30))) {
            this.day = 0;
            this.format = "Invalid date";
        }

        else if ((this.month == 2 && isLeapYear(this.year) && (this.day <= 0 || this.day > 29))) {
            this.day = 0;
            this.format = "Invalid date";
        }

        else if ((this.month == 2 && !isLeapYear(this.year) && (this.day <= 0 || this.day > 28))) {
            this.day = 0;
            this.format = "Invalid date";
        }
    }

    private void checkPunctuation(String punctuation) {
        if (this.punctuation.equals("!")) {
            this.punctuation = "";
        }
        else {
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
        checkYear(year);
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
        checkMonth(month);
    }

    public int getDay() {
        checkDay(day);
        return day;
    }

    public void setDay(int day) {
        this.day = day;
        checkDay(day);
    }

    public String getPunctuation() {
        return punctuation;
    }

    public void setPunctuation(String punctuation) {
        this.punctuation = punctuation;
        checkPunctuation(punctuation);
    }

    public String getFormat() {
        checkYear(this.year);
        checkMonth(this.month);
        checkDay(this.day);

        switch (this.format) {
            case "b": {
                checkPunctuation(this.punctuation);
                if (this.month >= 1 && this.month <= 9)
                    if (this.day >=1 && this.day <= 9)
                        return this.cutYear + this.punctuation + "0" + this.month + this.punctuation + "0" + this.day;
                    else
                        return this.cutYear + this.punctuation + "0" + this.month + this.punctuation + this.day;
                else if (this.month <= 12)
                    if (this.day >=1 && this.day <= 9)
                        return this.cutYear + this.punctuation + this.month + this.punctuation + "0" + this.day;
                    else
                        return this.cutYear + this.punctuation + this.month + this.punctuation + this.day;
                break;
            }

            case "l": {
                checkPunctuation(this.punctuation);
                if (this.month >= 1 && this.month <= 9)
                    if (this.day >=1 && this.day <= 9)
                        return "0" + this.day + this.punctuation + "0" + this.month + this.punctuation + this.cutYear;
                    else
                        return this.day + this.punctuation + "0" + this.month + this.punctuation + this.cutYear;
                else if (this.month <= 12)
                    if (this.day >=1 && this.day <= 9)
                        return "0" + this.day + this.punctuation + this.month + this.punctuation + this.cutYear;
                    else
                        return this.day + this.punctuation + this.month + this.punctuation + this.cutYear;
                break;
            }

            case "m": {
                checkPunctuation(this.punctuation);
                if (this.month >= 1 && this.month <= 9)
                    if (this.day >=1 && this.day <= 9)
                        return "0" + this.month + this.punctuation + "0" + this.day + this.punctuation + this.cutYear;
                    else
                        return "0" + this.month + this.punctuation + this.day + this.punctuation + this.cutYear;
                else if (this.month <= 12)
                    if (this.day >=1 && this.day <= 9)
                        return this.month + this.punctuation + "0" + this.day + this.punctuation + this.cutYear;
                    else
                        return this.month + this.punctuation + this.day + this.punctuation + this.cutYear;
                break;
            }
        }
        return "Invalid date";
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
