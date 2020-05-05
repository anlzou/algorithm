
/***
 * @Date        : 2020-05-05 19:11:16
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-05 19:15:46
 * @FilePath    : \algorithm\test\main.cpp
 * @Describe    :
 */

#include "../code/L0003_LongestSubstring.cpp"
using namespace std;

int main() {
    Solution1 s;
    string result;
    string str = "abbcdefgegcsgcasse";
    result = s.no_redup(str);
    cout << result << endl;
    return 0;
}