# @Date        : 2020-05-12 08:34:51
# @LastEditors : anlzou
# @Github      : https://github.com/anlzou
# @LastEditTime: 2020-05-12 08:36:38
# @FilePath    : \algorithm\code\M0005_TenBaseSort\QuickSort.py
# @Describe    :
#
def quickSort(data):
    """快速排序"""
    if len(data) >= 2:  # 递归入口及出口
        mid = data[len(data)//2]  # 选取基准值，也可以选取第一个或最后一个元素
        left, right = [], []  # 定义基准值左右两侧的列表
        data.remove(mid)  # 从原始数组中移除基准值
        for num in data:
            if num >= mid:
                right.append(num)
            else:
                left.append(num)
        return quickSort(left) + [mid] + quickSort(right)
    else:
        return data


if __name__ == "__main__":
    # 示例：
    array = [2, 3, 5, 7, 1, 4, 6, 15, 5, 2, 7, 9, 10, 15, 9, 17, 12]
    print(quickSort(array))
    # 输出为[1, 2, 2, 3, 4, 5, 5, 6, 7, 7, 9, 9, 10, 12, 15, 15, 17]
