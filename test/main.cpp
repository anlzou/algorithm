/***
 * @Date        : 2020-05-05 19:11:16
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-21 16:34:29
 * @FilePath    : \algorithm\test\main.cpp
 * @Describe    :
 */

#include "./../code/L0003_LongestSubstring.cpp"
using namespace std;

int main() {
    Solution s;
    string result;
    string str = "abbcdefgegcsgcasse";
    result = s.no_redup(str);
    cout << result << endl;
    return 0;
}