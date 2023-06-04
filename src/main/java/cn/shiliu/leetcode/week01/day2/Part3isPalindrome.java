package cn.shiliu.leetcode.week01.day2;

public class Part3isPalindrome {

    /**
     * 要求 输出参数为小写，需要将String转换成小写类的字符串；
     * 要求：输出参数为Boolean类型 true/false
     * @param args
     */
    public static void main(String[] args) {
        String s  = "race a car";
        //大写touper   小写
        Boolean a = isPalindrome(s);
        System.out.println("a="+a);

    }

    /**
     * 解法一
     * @param s
     * @return
     */
    public static boolean isPalindrome(String  s) {
        // TODO: 2023/6/4  左右指针判断
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left<=right){
            // TODO: 2023/6/4 注意是值去比较，而非下标去比较ASCII值
            while (left <= right && !isASCII(s.charAt(left))){
                left++;
            }

            while (left <= right && !isASCII(s.charAt(right))){
                right--;
            }

            // TODO: 2023/6/4  判断左右指针的值是否相等
            if (left<=right && s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    // TODO: 2023/6/4 ASCII 字母和数字都属于字母数字字符
    public static boolean isASCII(char args) {
        // TODO: 2023/6/4 判断是不是码表里面的数字或者a-z,
        if ((args >= '0' && args<='9')||(args >= 'a' && args<='z')){
            return true;
        }
        return false;
    }

}
