/***
 * @Date        : 2020-05-28 23:36:10
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-28 23:36:25
 * @FilePath    : \algorithm\code\M0007_CocktailSort.cpp
 * @Describe    :
 */
#include <iostream>

using namespace std;

void Swap(int array[], int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}

void cocktailSort(int array[], int length) {
    if (array == nullptr || length <= 0) return;
    int left = 0;
    int right = length - 1;
    while (left < right) {
        //第一次 左边开始
        for (int i = left; i < right; i++) {
            if (array[i] > array[i + 1]) {
                Swap(array, i, i + 1);  //左边大于右边，交换
            }
        }
        //第二次 右边开始
        right--;
        for (int i = right; i > left; i--) {
            if (array[i - 1] > array[i])
                Swap(array, i - 1, i);  //左边大于右边， 交换
        }
        left++;
    }
}

int main() {
    int arr[] = {5, 9, 8, 7, 6};
    int length = sizeof(arr) / sizeof(int);
    cocktailSort(arr, length);
    for (int i = 0; i < length; i++) cout << arr[i] << " ";
    cout << endl;
}