package chapter5.practise;

/**
 * 创建一个类，它有一个接受String参数的构造器。在构造阶段打印该参数。
 * 创建一个该类的对象引用数组，但是不实际去创建对象赋值给该数组
 * 当运行程序时，请注意来自对该构造器的调用中的初始化消息是否打印了出来
 * @author harley
 * date 2020/04/03
 */
public class Practise17 {
    Practise17(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        Practise17[] p = new Practise17[] {new Practise17("a"), new Practise17("b")};
    }
}
