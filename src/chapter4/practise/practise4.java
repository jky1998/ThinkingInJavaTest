package chapter4.practise;

/**
 * 写一个程序，使用两个嵌套的for循环和取余操作符% 来探测和打印素数
 * （只能被其自身和1整除，而不能被其他数字整除的整数，大于1）
 * @author harley
 * date 2020/03/21
 */
public class practise4 {
    public static void main(String[] args) {
        boolean flag = false;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println(i);
            }
            flag = false;
        }
    }
}
