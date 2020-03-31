package chapter4.practise;

/**
 * 吸血鬼数字是指位数为偶数的数字，可以由一对数字相乘而得到，而这对数字包含乘积的一半位数的数字
 * 其中最初的数字中选取的数字可以任意排序。以两个0结尾的数字是不允许的。
 * 下列数字都是吸血鬼数字：
 * 1260 = 21 * 60; 1827 = 21 * 87; 2187 = 27 * 81;
 * 写一个程序，找出4位数的所有吸血鬼数字
 * @author harley
 * date 2020/03/30
 */
public class practise10 {
    /**
     * 思路：1、获取四位数的每一位
     *      2、将获取的四位数排列组合，相乘判断是否符合
     */

    public static int a(int i) {
        return i/1000;
    }
    public static int b(int i) {
        return (i%1000)/100;
    }
    public static int c(int i) {
        return ((i%1000)%100)/10;
    }
    public static int d(int i) {
        return i%10;
    }
    public static int com(int i, int j) {
        return (i * 10) + j;
    }
    public static void productTest (int i, int m, int n) {
        if(m * n == i) System.out.println(i + " = " + m + " * " + n);
    }

    public static void main(String[] args) {

        for (int i = 1001; i < 9999; i++) {
            int a = a(i);
            int b = b(i);
            int c = c(i);
            int d = d(i);
            productTest(i, com(a, b), com(c, d));
            productTest(i, com(a, b), com(d, c));
            productTest(i, com(a, c), com(b, d));
            productTest(i, com(a, c), com(d, b));
            productTest(i, com(a, d), com(b, c));
            productTest(i, com(a, d), com(c, b));
            productTest(i, com(b, a), com(c, d));
            productTest(i, com(b, a), com(d, c));
            productTest(i, com(b, c), com(d, a));
            productTest(i, com(b, d), com(c, a));
            productTest(i, com(c, a), com(d, b));
            productTest(i, com(c, b), com(d, a));
        }

    }
}
