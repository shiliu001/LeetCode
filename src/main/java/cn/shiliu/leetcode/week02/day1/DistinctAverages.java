package cn.shiliu.leetcode.week02.day1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * day03 2465. 不同的平均值数目
 */
public class DistinctAverages {
    public static void main(String[] args) {
        int[] nums = {4,1,4,0,3,5};
        int a = distinctAverages1(nums);
        System.out.println("a="+a);
    }

    /**
     * 解法一
     * @param nums
     * @return
     */
    public static int distinctAverages1(int[] nums) {
        //先判断数组是否为空
        if(nums==null){
            return nums.length;
        }

        //先对数组进行一个有序的排序
        Arrays.sort(nums);

        Set<Integer> res = new HashSet<>();
        //双指针遍历数组,对两个值进行加的操作
        for (int i = 0, j = nums.length - 1; i < j; ++i, --j) {
            res.add(nums[i] + nums[j]);
        }
        return res.size();

        //技巧,当数组无序待定的时候,可以先进性排序,之后使用循环+双指针来进行遍历数组.
    }
}
