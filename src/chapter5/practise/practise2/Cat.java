package chapter5.practise.practise2;

/**
 * 创建一个类，它包含一个在定义时就被初始化了的String域，以及另一个通过构造器初始化的String域
 * 这两种方式有何差异？
 * @author harley
 * date 2020/03/30
 */
public class Cat {
    public String a = "miao";
    public String b;
    Cat() {
        System.out.println(a);
        System.out.println(b);
    }
}
