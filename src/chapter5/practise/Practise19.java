package chapter5.practise;

/**
 * 写一个类，它接受一个可变参数的String数组
 * 验证你可以向该方法传递一个用逗号分隔的String列表
 * @author harley
 * date 2020/04/07
 */
public class Practise19 {
    public static void test(String... strs) {
        for (String str : strs) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        test("a", "b", "c");
        String[] strs = {"a", "b", "c"};
        test(strs);
    }
}
