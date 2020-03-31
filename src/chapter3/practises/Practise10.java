package chapter3.practises;

/**
 * 编写一个具有两个常量值的程序
 * 一个具有交替的二进制位1和0，其中最低有效位为0
 * 另一个也具有交替的二进制位1和0，但是其最低有效位为1（提示：使用十六进制常量来表示是最简单的方法）
 * 取这两个值，用按位操作符以所有可能的方式结合运算它们，然后用Integer.toBinaryString()显示
 * @author harley
 * date 2020/03/16
 */
public class Practise10 {
    public static final int NUMA = 0b1010;
    public static final int NUMB = 0b1111;

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(NUMA & NUMB));
        System.out.println(Integer.toBinaryString(NUMA | NUMB));
        System.out.println(Integer.toBinaryString(NUMA ^ NUMB));
        System.out.println(Integer.toBinaryString(~NUMA));
    }

}
