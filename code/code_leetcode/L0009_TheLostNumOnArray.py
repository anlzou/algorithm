class Solution:
    '''
        使用二分法求解
    '''
    def missingNumber(self, nums):
        i, j = 0, len(nums) - 1
        while i <= j:
            m = (i + j) // 2
            if nums[m] == m: i = m + 1
            else: j = m - 1
        return i


    '''
        使用异或运算
    '''
    def missingNumberXOR(self, nums):
        xor = 0
        for i in range(len(nums)):
            xor ^= nums[i] ^ (i+1)
        return xor



################ test #################
if __name__ == "__main__":
    nums = [0,1,2,3,4,6,7,8,9,10]
    solution = Solution()
    
    ans = solution.missingNumber(nums)
    print(ans)

    ans = solution.missingNumberXOR(nums)
    print(ans)