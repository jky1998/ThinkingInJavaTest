package chapter3.practises;

/**
 * 展示用十六进制和八进制计数法来操作long值，用Long.toBinaryString()来显示成果
 * @author harley
 * date 2020/03/15
 */
public class Practise8 {

    public static void main(String[] args) {
        long a = 0x8ffff;
        System.out.println("a: " + Long.toBinaryString(a));
        long b = 04157027;
        System.out.println("b: " + Long.toBinaryString(b));
    }
}
