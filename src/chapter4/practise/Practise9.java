package chapter4.practise;

/**
 * 一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的
 * 其中每一个数字（从第3个数字起）都是前两个数字的和
 * 创建一个方法，接收一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成的所有斐波那契数字
 * 例如，如果运行java Fibonacci5(其中Fibonacci是类名），那么输出的就应该是1、1、2、3、5
 * @author harley
 * date 2020/03/30
 */
public class Practise9 {
    public static int fibonacci(int data) {
        if (data == 1 || data == 2) {
            return 1;
        } else {
            return fibonacci(data - 1) + fibonacci(data - 2);
        }
    }

    public static void main(String[] args) {
        int data = 5;
        for (int i = 1; i <= data; i++) {
            System.out.print(fibonacci(i) + "、");
        }
    }
}
