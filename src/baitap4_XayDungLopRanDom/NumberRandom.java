package baitap4_XayDungLopRanDom;

import java.util.Random;

public class NumberRandom {
    private int seed;

    public NumberRandom() {
    }

    public NumberRandom(int seed) {
        this.seed = seed;
    }

    public void showNumberRandom() {
        Random rd = new Random();
        for (int i = 1; i <= seed; i++) {
            if (i<=50){
                System.out.print(rd.nextInt(100)+"\t");
            }else {
                System.out.print(rd.nextInt(1000)+"\t");
            }
            if (i%10 == 0) System.out.println();
        }
    }
}
