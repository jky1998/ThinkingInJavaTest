package chapter5.practise.practise6;

/**
 * 修改前一个练习的程序，让两个重载方法各自接受两个类型的不同参数，但二者顺序相反。验证其是否工作
 * @author harley
 * date 2020/03/31
 */
public class Dog {
    public void bark(int a, String b) {
        System.out.println("barking");
    }

    public void bark(String a, int b) {
        System.out.println("howling");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark(1, "b");
        dog.bark("a", 2);
    }
}
