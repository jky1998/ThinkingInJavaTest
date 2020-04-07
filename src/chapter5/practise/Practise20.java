package chapter5.practise;

/**
 * 创建一个使用可变参数列表而不是普通的main()语法的main()
 * 打印所产生的args数组的所有元素，并用各种不同数量的命令行参数来测试它
 * @author harley
 * date 2020/04/07
 */
public class Practise20 {
    public static void main(String[] args) {
        Test.main(new String[]{"I","am", "Iron", "man."});
    }
}

class Test {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
    }
}