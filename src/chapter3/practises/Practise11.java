package chapter3.practises;

/**
 * 以一个最高有效位为1的二进制数字开始（提示：使用十六进制常量）
 * 用有符号右移操作符对其进行右移，直至所有的二进制都被移出为止
 * 每移一位都要使用Integer.toBinaryString()显示结果
 * @author harley
 * date 2020/03/18
 */

public class Practise11 {
    public static void main(String[] args) {
        int a = 0x1E;
        while (a != 0) {
            System.out.println(Integer.toBinaryString(a));
            a = a >>> 1;
        }
    }
}
