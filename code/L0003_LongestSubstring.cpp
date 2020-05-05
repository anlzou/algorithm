
/***
 * @Date        : 2020-05-05 18:49:57
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-05 19:56:04
 * @FilePath    : \algorithm\code\L0003_LongestSubstring.cpp
 * @Describe    :
 */

#include <math.h>
#include <stdio.h>

#include <iostream>
#include <string>
using namespace std;

class Solution1 {
   public:
    string no_redup(string str) {
        if (str.size() < 1) return "";
        int mp[256] = {0};
        int begins = 0;
        string word = "";
        string longest_word = "";
        for (int i = 0; i < str.size(); i++) {
            mp[str[i]]++;
            if (mp[str[i]] == 1) {
                word += str[i];
                if (word.size() > longest_word.size()) {
                    longest_word = word;
                }

            } else {
                while (i > begins && mp[str[i]] > 1) {
                    mp[str[begins]]--;
                    begins++;
                }
                word = "";
                for (int k = begins; k <= i; k++) {
                    word += str[k];
                }
            }
        }
        return longest_word;
    }
};