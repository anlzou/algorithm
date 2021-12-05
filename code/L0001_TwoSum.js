/*
 * @Date        : 2020-05-02 20:47:27
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-02 21:40:05
 * @FilePath    : \algorithm\code\TwoSum_0001.js
 * @Describe    :
 */

/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
const twoSum = function (nums, target) {
    const map = new Map();
    for (let i = 0; i < nums.length; i++) {
        const diff = target - nums[i];
        if (map.has(diff)) {
            return [map.get(diff), i];
        }
        map.set(nums[i], i);
    }
}


// TEST. Node.js v16.13.1
let arr = [2,3,5,1,7,8,0];
console.log(twoSum(arr, 9))