package chapter5.practise.practise1;

/**
 * 创建一个类，它包含一个未初始化的String引用
 * 验证该引用被Java初始化成了null
 * @author harley
 * date 2020/03/30
 */
public class Cat {
    public String miao;
    Cat() {
        System.out.println(miao);
    }
}
