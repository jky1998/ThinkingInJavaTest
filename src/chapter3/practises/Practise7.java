package chapter3.practises;

import java.util.Random;

/**
 * 编写一个程序，模拟扔硬币的结果
 * @author harley
 * date 2020/03/14
 */
public class Practise7 {

    public static void main(String[] args) {
        Random coin = new Random();
        if (coin.nextInt(2) == 1) {
            System.out.println("正面！");
        } else {
            System.out.println("反面！");
        }
    }

}
