package chapter4.practise;

import java.util.Timer;
import java.util.TimerTask;

/**
 * 写一个switch开关语句，为每个case打印一个消息
 * 然后把switch放进for循环来测试每个case
 * 先让每个case后面都有break，测试一下会怎样；然后把break删了看看会怎样
 * @author harley
 * date 2020/03/27
 */
public class Practise8 {
    public static void switchTest(int i) {
        switch (i) {
            case 1 :
                System.out.println("Kuuga");
                break;
            case 2 :
                System.out.println("Agito");
                break;
            case 3 :
                System.out.println("Ryuki");
                break;
            case 4 :
                System.out.println("Faiz");
                break;
            case 5 :
                System.out.println("Blade");
                break;
            case 6 :
                System.out.println("Hibiki");
                break;
            case 7 :
                System.out.println("Kabuto");
                break;
            case 8 :
                System.out.println("Den-O)");
                break;
            case 9 :
                System.out.println("Kiva");
                break;
            case 10 :
                System.out.println("Decade");
                break;
            case 11 :
                System.out.println("W");
                break;
            case 12 :
                System.out.println("OOO");
                break;
            case 13 :
                System.out.println("Fourze");
                break;
            case 14 :
                System.out.println("Wizard");
                break;
            case 15 :
                System.out.println("Gaim");
                break;
            case 16 :
                System.out.println("Drive");
                break;
            case 17 :
                System.out.println("Ghost");
                break;
            case 18 :
                System.out.println("Ex-Aid");
                break;
            case 19 :
                System.out.println("Build");
                break;
            case 20 :
                System.out.println("Zi-O");
                break;
            default :
                    System.out.println("Zero-One");
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i < 22; i ++) {
            switchTest(i);
        }
    }
}
