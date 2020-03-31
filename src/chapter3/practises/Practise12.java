package chapter3.practises;

/**
 * 以一个所有位都为1的二进制数字开始
 * 先左移它，然后用无符号右移操作符对其进行右移
 * 直至所有的二进制位都被移出为止
 * 每移一位都要使用Integer.toBinaryString()显示结果
 * @author harley
 * date 2020/03/18
 */
public class Practise12 {
    public static void main(String[] args) {
        int a = 0b111111;
        System.out.println(Integer.toBinaryString(a));
        a = a << 10;
        while (a != 0) {
            System.out.println(Integer.toBinaryString(a));
            a = a >>> 1;
        }
    }
}
