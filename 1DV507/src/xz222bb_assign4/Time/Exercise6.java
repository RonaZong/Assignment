package xz222bb_assign4.Time;

public class Exercise6 {
    public static void main(String[] args) {
        concatenationShort();

        concatenationLong();

        appendShort();

        appendLong();

    }

    private static void concatenationShort() {
        String str = "";
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 100) {
            str += "a";
        }

        long estimatedTime = (long) ((System.currentTimeMillis() - start) / 1000.0);
        System.out.println("In " + estimatedTime + " seconds, string concatenation short string appends "
                + str.length() + " times and the length is " + str.length());
    }

    private static void concatenationLong() {
        String str = "";
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 100) {
            str += "rrrrrrrrrrrrrrrrrrrreeeeeeeeeeeeeeeeeeeedddddddddddddddddddd";
        }

        long estimatedTime = (long) ((System.currentTimeMillis() - start) / 1000.0);
        System.out.println("In " + estimatedTime + " seconds, string concatenation long string appends "
                + str.length() / 60 + " times and the length is " + str.length());
    }

    private static void appendShort() {
        StringBuilder stringBuilder = new StringBuilder();
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 100){
            stringBuilder.append("a");
        }

        String str = stringBuilder.toString();
        long estimatedTime = (long) ((System.currentTimeMillis() - start) / 1000.0);
        System.out.println("In " + estimatedTime + " second second string append short string appends "
                + str.length() + " times and the length is " + str.length());

    }

    public static void appendLong(){
        StringBuilder stringBuilder = new StringBuilder();
        long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < 100){
            stringBuilder.append("rrrrrrrrrrrrrrrrrrrreeeeeeeeeeeeeeeeeeeedddddddddddddddddddd");
        }

        String str = stringBuilder.toString();
        long estimatedTime = (long) ((System.currentTimeMillis() - start) / 1000.0);
        System.out.println("In " + estimatedTime + " second second string append long string appends "
                + str.length() / 60 + " times and the length is " + str.length());
    }

}
