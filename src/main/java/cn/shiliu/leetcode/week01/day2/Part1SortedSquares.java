package cn.shiliu.leetcode.week01.day2;

import java.util.Arrays;

public class Part1SortedSquares {
    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] res = SortedSquares2(nums);
        System.out.println(Arrays.toString(res));
    }
    /**
     * 解法一
     *
     * @param nums
     * @return
     */
    public static int[] SortedSquares(int[] nums) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        int[] res = new int[n];
        // TODO: 2023/6/4 蒋数组求完平方去做
        for (int i = 0; i < n; i++) {
            res[i] = nums[i] * nums[i];
        }
        // TODO: 2023/6/4 将平方后的数组进行排序
        Arrays.sort(res);
        return res;
    }

    /**
     * 解法二 双指针
     */
    public static int[] SortedSquares2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        // 保存结果
        int[] res = new int[nums.length];
        // 从后往前，插目前最大的值
        int index = nums.length - 1;
        while (left <= right) {
            //左指针的数值求平方
            int leftSquare = nums[left] * nums[left];
            //右指针的数值求方法
            int rightSquare = nums[right] * nums[right];
            //若左指针的平方大于又指针的平方，则输出左指针的平方并向后移动
            if (leftSquare > rightSquare) {
                res[index--] = leftSquare;
                left++;
            } else {
                //反之则进行右指针的操作
                res[index--] = rightSquare;
                right--;
            }
        }
        return res;
    }
}

