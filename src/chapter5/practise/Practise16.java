package chapter5.practise;

/**
 * 创建一个String对象数据，并为每一个元素都赋值一个String
 * 用for循环来打印数组
 * @author harley
 * date 2020/04/03
 */
public class Practise16 {

    public static void main(String[] args) {
        String[] strings = new String[]{"a", "b", "c"};
        int[] a = {1, 2, 3};
        for (String str : strings) {
            System.out.println(str);
        }
    }

}
