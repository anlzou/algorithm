<!--
 * @Date        : 2020-05-02 20:37:47
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-24 16:05:15
 * @FilePath    : \algorithm\problems\N0008_GetBinaryTreeNextNode.md
 * @Describe    : 
 -->
## 题目地址

[nowcoder](https://www.nowcoder.com/practice/9023a0c988684a53960365b889ceaf5e?tpId=13&tqId=11210&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking)

## 题目描述

问题：
```
给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
```
返回结点：
```java
public class TreeLinkNode {

    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null; // 指向父结点的指针

    TreeLinkNode(int val) {
        this.val = val;
    }
}
```

## 思路
我们先来回顾一下中序遍历的过程：先遍历树的左子树，再遍历根节点，最后再遍历右子树。所以最左节点是中序遍历的第一个节点。
```java
// 伪代码
void traverse(TreeNode root) {
    if (root == null) return;
    traverse(root.left);
    visit(root);
    traverse(root.right);
}
```

1. 如果一个节点的右子树不为空，那么该节点的下一个节点是右子树的最左节点；
2. 否则，向上找第一个左链接指向的树包含该节点的祖先节点。

## 关键点
- [中序遍历](https://github.com/anlzou/data-structure/blob/master/chapters/chapter07-trees-and-binary-trees/test-2.md)

## 代码
- [TreeLinkNode.java](../code/structural/TreeLinkNode.java)
- [N0008_GetBinaryTreeNextNode.java](../code/N0008_GetBinaryTreeNextNode.java)
- [ ] 待测试

## 复杂度分析

- 时间复杂度：O( )
- 空间复杂度：O( )