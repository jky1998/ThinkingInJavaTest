package chapter4.practise;

/**
 * 重复第3章中的练习10, 不要用Integer.toBinaryString()的方法, 而是用三元操作符和按位操作符来显示二进制1和0
 * @author harley
 * date 2020/02/23
 */
public class practise5 {
    static final int INT_HIGH_BIT = 1 << 31;
    public static String toBinaryString(int i) {
//        char buffer[] = new char[32];
//        int position = 32;
//        do{
//            buffer[--position] =
//                    ((a & 0x01) != 0) ? '1' :'0';
//            a >>>= 1;
//        }while(a!=0);
//        for(int i=position;i<32;i++)
//            System.out.print(buffer[i]);
//        System.out.println();
        String result = "";
        int j = 1;
        do {
            if (j == INT_HIGH_BIT) {
                result = ((i & j) > 0 ? "0" : "1") + result;
            } else {
                result = ((i & j) > 0 ? "1" : "0") + result;
            }
            i = i - (i & j);
            j <<= 1;
        } while (i != 0);

        return result;
    }
    public static void main(String[] args) {
        int i1 = 8;
        int i2 = 0x55555555;

        System.out.println("i1 = "); toBinaryString(i1);
        System.out.println("i2 = "); toBinaryString(i2);
        System.out.println("~i1 = "); toBinaryString(~i1);
        System.out.println("~i2 = "); toBinaryString(~i2);
        System.out.println("i1 & i1 = "); toBinaryString(i1 & i1);
        System.out.println("i1 | i1 = "); toBinaryString(i1 | i1);
        System.out.println("i1 ^ i1 = "); toBinaryString(i1 ^ i1);
        System.out.println("i1 & i2 = "); toBinaryString(i1 & i2);
        System.out.println("i1 | i2 = "); toBinaryString(i1 | i2);
        System.out.println("i1 ^ i2 = "); toBinaryString(i1 ^ i2);
    }

}
