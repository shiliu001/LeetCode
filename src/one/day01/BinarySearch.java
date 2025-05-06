package one.day01;

/**
 * @author 十六
 * @date 2025/5/6 21:19
 * @description: 二分查找
 */
public class BinarySearch {
    /**
     * 笔记
     * 二分查找法的基本定义
     * 二分查找（Binary Search）是一种高效的查找算法，适用于有序数组（升序或降序均可）。其基本思想是通过不断缩小搜索区间，快速定位目标值的位置。
     *
     * 核心要点：
     * 1. 前提条件
     * 数组必须是有序的（通常为升序）。
     * 支持随机访问的数据结构（如数组、ArrayList 等）。
     * 2. 基本思想
     * 每次取中间位置 mid 的元素与目标值 target 比较：
     * 如果相等，则找到目标值，返回下标；
     * 如果 nums[mid] < target，说明目标值在右半部分；
     * 如果 nums[mid] > target，说明目标值在左半部分；
     * 不断缩小搜索范围，直到找到目标值或搜索区间为空。
     * 3. 时间复杂度
     * 最佳：O(1)
     * 平均 & 最坏：O(log n)
     * 示例代码框架（升序数组）：
     */

    /**
     * 力扣704题:给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1
     * <p>
     * https://leetcode.cn/problems/binary-search/solutions/3670239/er-fen-cha-zhao-by-peaceful-chebyshevh4x-2v0b/
     *
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
//        //输出相同的数字本身
//        for (int a : nums) {
//            if (target == a) {
//                System.out.println(a);
//            }
//        }
        //定义三个元元素,左指针\右指针\中间指针
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 5, 6, 7, 8, 9, 10};
        int target = 5;
        System.out.println(search(nums, target));
    }
}



