package cn.shiliu.leetcode.week01.day1;

/**
 * 二分查找
 */
class Solution1 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
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

//    public static void main(String[] args) {
//        String
//        System.out.println();
//    }
}
