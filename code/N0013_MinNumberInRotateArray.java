
/**
 * @Date : 2020-06-03 09:25:11
 * @LastEditors : anlzou
 * @Github : https://github.com/anlzou
 * @LastEditTime: 2020-06-03 09:39:54
 * @FilePath    : \algorithm\code\N0013_MinNumberInRotateArray.java
 * @Describe :
 */
package code;

public class N0013_MinNumberInRotateArray {
    /**
     * 数组中没有重复的元素
     */
    public int minNumberInRotateArrayNotRepeat(int[] nums) {
        if (nums.length == 0)
            return 0;
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= nums[high])
                high = mid;
            else
                low = mid + 1;
        }
        return nums[low];
    }

    /**
     * 数组中有重复的元素
     */
    public int minNumberInRotateArrayHaveRepeat(int[] nums) {
        if (nums.length == 0)
            return 0;
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[low] == nums[mid] && nums[mid] == nums[high])
                return minNumber(nums, low, high);
            else if (nums[mid] <= nums[high])
                high = mid;
            else
                low = mid + 1;
        }
        return nums[low];
    }

    private int minNumber(int[] nums, int low, int high) {
        for (int i = low; i < high; i++)
            if (nums[i] > nums[i + 1])
                return nums[i + 1];
        return nums[low];
    }

    public static void main(String[] args) {
        int arra[] = { 3, 4, 5, 6, 2 };
        int arrb[] = { 1, -1, 1, 0, 1 };

        N0013_MinNumberInRotateArray test = new N0013_MinNumberInRotateArray();

        System.out.println("not repeat min number is:" + test.minNumberInRotateArrayNotRepeat(arra));
        System.out.println("have repeat min number is:" + test.minNumberInRotateArrayHaveRepeat(arrb));
    }
}