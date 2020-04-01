package chapter5.practise;

/**
 * 编写具有两个重载构造器的类，并在第一个构造其中通过this调用第二个构造器
 * @author harley
 * date 2020/04/01
 */
public class Practise9 {
    Practise9() {
        this("harley");
    }

    Practise9(String s) {
        System.out.println("hello~" + s);
    }

    public static void main(String[] args) {
        new Practise9();
    }
}
