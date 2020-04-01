package chapter5.practise;

/**
 * 编写具有两个方法的类，在第一个方法内调用第二个方法两次：
 * 第一次调用时不使用this关键字
 * 第二次调用时使用this关键字————这里只是为了验证它是起作用的，你不应该在实践中使用这种方式
 * @author harley
 * date 2020/04/01
 */
public class Practise8 {
    public void a() {
        b(4);
        this.b(5);
    }

    public void b(int b) {
        System.out.println(b);
    }

    public static void main(String[] args) {
        Practise8 p = new Practise8();
        p.a();
    }
}
