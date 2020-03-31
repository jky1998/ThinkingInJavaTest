package chapter4.practise;

/**
 * 写一个程序，产生25个int类型的随机数
 * 对于每一个随机值，使用if-else语句来将其分为大于、小于，或等于紧随它而随机生成的值
 * @author harley
 * date 2020/03/21
 */
public class practise2 {
    public static int[] random(int num) {
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = random(25);
        for (int i = 0; i < 24; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println(i + 1 + ": " + arr[i] + "大于" + arr[i+1]);
            } else if (arr[i] == arr[i + 1]) {
                System.out.println(i + 1 + ": " + arr[i] + "等于" + arr[i+1]);
            } else if (arr[i] < arr[i + 1]) {
                System.out.println(i + 1 + ": " + arr[i] + "小于" + arr[i+1]);
            }
        }
    }
}
