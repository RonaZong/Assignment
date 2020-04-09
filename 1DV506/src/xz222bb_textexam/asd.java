package xz222bb_textexam;

import java.util.Scanner;

public class asd {
    public static void main(String[] args) {

        dsa lol = new dsa(5, "lmao");
        lol.printa();
        dsa lmao = new dsa(10, "eyyy");
        lmao.printa();
        lmao.changea(7);
        lmao.printa();
        Scanner lul = new Scanner(System.in);
        Scanner lel = new Scanner(System.in);
        lul.close();
        double pop = lel.nextDouble();
    }
    }


class dsa {
    int a;
    String b;
    int c;

    public dsa (int a, String b) {
        this.a = a;
        this.b=b;
    }

    public int changea(int a) {
        this.a = a;
        return this.a;
    }
    public void printa() {
        System.out.println(this.a);
    }
}
