package chapter3.practises;

/**
 * 编写一个方法，它以二进制式显示char类型的值
 * 使用多个不同的字符来展示它
 * (此题答案网上copy的，看不懂的话就debug一下，莫要纠结）
 * @author harley
 * date 2020/03/18
 */

public class practise13 {
    // 将十进制转换位二进制的方法
    public static int transform(int  a )
    {
        int temp,result;
        if(a == 1)
            return 1;
        temp = a / 2;
        result = (a % 2) + transform(temp) * 10;
        return result;
    }

    public static void main(String[] args) {
        char[] chars="abcdefghijklmnopqrstuvwxyz`!@#$%^&*()_+`-=1234567890{}[]|\\:'<.,>/?".toCharArray();
        for(int i=0;i<=chars.length-1;i++){
            System.out.println(chars[i]+"="+transform(chars[i]));
        }
    }
}
