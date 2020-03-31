package chapter4.practise;

/**
 * 修改本章练习1，通过使用break关键词，使得程序在打印到99时退出
 * 然后尝试使用return来达到相同的目的
 * @author harley
 * date 2020/03/26
 */
public class Practise7 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 100) break;
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            if (i == 100) return;
            System.out.print(i + " ");
        }
    }
}
