package chapter4.practise;

import java.util.Random;

/**
 * 修改练习2， 把代码用一个无限循环包括起来
 * 然后运行它直至用键盘中断其运行
 * @author harley
 * date 2020/03/21
 */
public class Practise3 {
    public static void compare(){
        Random r = new Random();
        int a = r.nextInt(20);
        int b = r.nextInt(20);
        System.out.println("s="+a+";b="+b);
        if (a<b)
            System.out.println("a<b");
        else if (a>b)
            System.out.println("a>b");
        else
            System.out.println("a=b");
        System.out.println();
    }
    public static void main (String args[]){
        while (true){
            compare();
        }
    }
}
