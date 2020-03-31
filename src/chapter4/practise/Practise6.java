package chapter4.practise;

/**
 * 修改前两个程序中的两个test()方法，让它们接受两个额外的参数begin和end
 * 这样在测试testval时将判断它是否在begin和end之间（包括begin和end）的范围内
 * @author harley
 * date 2020/03/26
 */
public class Practise6 {
    public static int test(int testval, int begin, int end) {
        if (testval >= begin && testval <= end) {
            return 1;
        } else
            return -1;
    }

    public static void main(String[] args) {
        int a = test(1, 0, 9);
        System.out.println(a);
    }
}
