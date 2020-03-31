package chapter3.practises;

/**
 * 编写一个接收两个字符串参数的方法，用各种布尔值的比较关系来比较这两个字符串，然后把结果打印出来
 * 做 == 和 != 比较的同时，用equals()作测试
 * 在main()里面用几个不同的字符串对象调用这个方法
 * @author harley
 * date 2020/03/20
 */
public class practise14 {
    public static void compare(String a, String b) {
        System.out.println(a + " == " + b + ": " + (a == b));
        System.out.println(a + " != " + b + ": " + (a != b));
        System.out.println(a + ".equals(" + b + "): " + (a.equals(b)));

    }

    public static void main(String[] args) {
        compare("an apple", "an apple");
    }
}
