package chapter3;

import java.util.Random;

public class C35 {
    public static void main(String[] args) {
        Random rand = new Random(47);
        System.out.println(rand);
        int j;
        j = rand.nextInt(100) + 1;
        System.out.println("j:" + j);

        float u, v, w;
        v = rand.nextFloat();
        System.out.println("v:" + v);
        w = rand.nextFloat();
        System.out.println("w:" + w);
    }
}
