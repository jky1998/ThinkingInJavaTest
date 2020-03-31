package chapter5.practise.practise3;

/**
 * 创建一个带默认构造器（即无参构造器的类，在构造器中打印一条消息
 * 为这个类创建一个对象
 * @author harley
 * date 2020/03/31
 */
public class Cat {
    public String cat = "miao";

    Cat() {
        System.out.println("miao~");
    }

    Cat(String dog) {
        System.out.println(cat + " " + dog);
    }

    public static void main(String[] args) {
        new Cat();
        new Cat("wao");
    }
}
