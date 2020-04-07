package chapter5.practise.practise21;

/**
 * 创建一个enum，它包含纸币中最小面值的6中类型
 * 通过values()循环并打印每一个值及其ordinal()
 * 为enum写一个switch语句，对于每一个case，输出该特定货币的描述
 * @author harley
 * date 2020/04/07
 */
public class Practise21 {
    public static void describe(Money money) {
        switch (money) {
            case YI_YUAN:
                System.out.println("这是1元。");
                break;
            case WU_YUAN:
                System.out.println("这是5元。");
                break;
            case SHI_YUAN:
                System.out.println("这是10元。");
                break;
            case ERSHI_YUAN:
                System.out.println("这是20元。");
                break;
            case WUSHIYUAN:
                System.out.println("这是50元。");
                break;
            case YIBAI_YUAN:
                System.out.println("这是100元。");
                break;
            default:
                    System.out.println("nothing");
        }
    }

    public static void main(String[] args) {
        for (Money m : Money.values()) {
            System.out.println(m + " " + m.ordinal());
        }
        describe(Money.WU_YUAN );
    }
}
