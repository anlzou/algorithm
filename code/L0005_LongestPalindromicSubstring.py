#
# @Date        : 2020-05-15 10:29:01
# @LastEditors : anlzou
# @Github      : https://github.com/anlzou
# @LastEditTime: 2020-05-15 10:29:18
# @FilePath    : \algorithm\code\L0005_LongestPalindromicSubstring.py
# @Describe    :
#
class Solution:
    def longestPalindrome(self, s: str) -> str:
        n = len(s)

        ret = ''
        for i in range(n):
            # 奇回文的情况
            l, r = i, i
            while s[l] == s[r]:
                l -= 1
                r += 1
                if l < 0 or r >= n:
                    break
            if r - l - 1 > len(ret):
                ret = s[l+1: r]

            # 偶回文的情况
            l, r = i-1, i
            while l >= 0 and s[l] == s[r]:
                l -= 1
                r += 1
                if l < 0 or r >= n:
                    break
            if r - l - 1 > len(ret):
                ret = s[l+1: r]

        return ret
