package xz222bb_assign2;

import java.util.*;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> lotto = new ArrayList<Integer>();
        int i = 0;
        while(i < 7){
            int rand = (int)(Math.random() * 35 + 1);
            if(lotto.contains(rand)){
                continue;
            }
            else{
                lotto.add(rand);
                i++;
            }
        }
        Collections.sort(lotto);
        System.out.println(lotto);
    }
}