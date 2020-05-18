/**
 * @Date        : 2020-05-18 08:53:24
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-18 09:02:48
 * @FilePath    : \algorithm\code\N0003_DuplicateNumbersInArray.java
 * @Describe    : 
 */
package code;

public class N0003_DuplicateNumbersInArray {
    public int duplicate(int[] nums) {
        int length = nums.length;
        if (nums == null || length <= 0)
            return -1;
        for (int i = 0; i < length; i++) {
            while (nums[i] != i) {
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                swap(nums, i, nums[i]);
            }
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 1, 0, 2, 5 };

        N0003_DuplicateNumbersInArray test = new N0003_DuplicateNumbersInArray();
        System.out.println(test.duplicate(arr));
    }
}