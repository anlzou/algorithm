<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-23 20:51:36
 * @FilePath    : \algorithm\problems\N0007_reConstructBinaryTree.md
 * @Describe    : 
 -->
## 题目地址

[nowcoder](https://www.nowcoder.com/practice/8a19cbe657394eeaac2f6ea9b0f6fcf6?tpId=13&tqId=11157&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 题目描述

问题：
```
根据二叉树的前序遍历和中序遍历的结果，重建出该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
```

## 思路
[anlzou / data-structure / 实验题 3：由遍历序列构造二叉树](https://github.com/anlzou/data-structure/blob/master/chapters/chapter07-trees-and-binary-trees/test-3.md)

## 代码
```java
/**
 * 由先序和中序遍历序列构造二叉树
 * n:二叉树共有n个节点
 */
BTNode *createBTbyPreAndIn(char *pre, char *in, int n) {
    BTNode *b;
    char *p;
    int k;
    if (n <= 0) {
        return NULL;
    }
    b = (BTNode *)malloc(sizeof(BTNode));  //创建二叉树结点b
    b->data = *pre;
    for (p = in; p < in + n; p++) {  //在中序序列中找等于*pre字符的位置k
        if (*p == *pre) {            // pre指向根结点
            break;                   //在in中找到后退出循环
        }
    }
    k = p - in;  //确定根结点在in中的位置
    b->lchild = createBTbyPreAndIn(pre + 1, in, k);  //递归构造左子树
    b->rchild =
        createBTbyPreAndIn(pre + k + 1, p + 1, n - k - 1);  //递归构造右子树
    return b;
}
```

## 复杂度分析

- 时间复杂度：O( )
- 空间复杂度：O( )