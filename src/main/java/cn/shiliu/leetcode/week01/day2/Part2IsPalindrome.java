package cn.shiliu.leetcode.week01.day2;

public class Part2IsPalindrome {
    public static void main(String[] args) {
        int x = -12121;
        Boolean a = isPalindrome2(x);
        System.out.println("a="+a);
    }

    /**
     * 解法一
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {
        // TODO: 2023/6/4 先判断会问是否是负数，若为负数，则肯定不是回文 
        if (x < 0) {
            return false;
        }
        // TODO: 2023/6/4 将回文转换为字符串，之后左右两个去比较
        String s = String.valueOf(x);
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            // TODO: 2023/6/4  charAt()方法返回指定索引位置的char值。 索引范围为0~length()-1， 
            if (s.charAt(i) != s.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
    /**
     * 解法二 不能转换成
     *
     * 核心点1：怎么转，边界条件，数字转换字符串的函数
     */
    public static boolean isPalindrome2(int x) {
        // TODO: 2023/6/4 先判断会问是否是负数，若为负数，则肯定不是回文
        if (x < 0) {
            return false;
        }
        // TODO: 2023/6/4 自己写一个不调用库函数的方法，将整数转换成字符串
        String xToStr = intToString(x);

        // TODO: 2023/6/4 使用双指针来完成余下的操作
        int left = 0;
        int right = xToStr.length() - 1;
        while (left <= right){
            if (xToStr.charAt(left) != xToStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static String intToString(int x){
        StringBuilder stringBuilder = new StringBuilder();
        while (x>0){
            stringBuilder.append(x%10);
            x /= 10;
        }
        return stringBuilder.reverse().toString();
    }
}
