
// LeetCode Problem 34 :  Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.Arrays;
public class A06FirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;

        int[] ansArr = searchRange(arr, target);
        System.out.println(Arrays.toString(ansArr));

    }
    static int[] searchRange(int[] nums, int target) {
        int ans[] = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    // This function just returns the index of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}




