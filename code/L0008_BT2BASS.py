#
# @Date        : 2020-08-15 23:24:53
# @LastEditors : anlzou
# @Github      : https://github.com/anlzou
# @LastEditTime: 2020-08-15 23:26:35
# @FilePath    : \algorithm\code\L0008_BT2BASS.py
# @Describe    :
#
class Solution:
    def maxProfit(self, prices: 'List[int]') -> int:
        if not prices:
            return 0

        min_price = float('inf')
        max_profit = 0

        for price in prices:
            if price < min_price:
                min_price = price
            elif max_profit < price - min_price:
                max_profit = price - min_price
        return max_profit


prices = [7, 1, 5, 3, 6, 4]
sol = Solution()
print(sol.maxProfit(prices))
