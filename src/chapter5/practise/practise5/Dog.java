package chapter5.practise.practise5;

/**
 * 创建一个名为Dog的类，它具有重载的bark()方法
 * 此方法根据不同的基本数据类型进行重载，并根据调用的版本，打印出不同类型的狗吠(barking)、咆哮(howling)等信息
 * 编写main来调用所有不同版本的方法
 * @author harley
 * date 2020/03/31
 */
public class Dog {
    public void bark() {
        System.out.println("barking");
    }

    public void bark(int i) {
        System.out.println("howling");
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.bark();
        dog.bark(1);
    }
}
