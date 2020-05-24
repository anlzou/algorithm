/**
 * @Date        : 2020-05-24 15:34:27
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-24 15:54:41
 * @FilePath    : \algorithm\code\structural\TreeLinkNode.java
 * @Describe    : 
 */
package code.structural;

public class TreeLinkNode {
    public Object nodeValType; // ==C++的typedef xxx nodeValType
    public TreeLinkNode left = null;
    public TreeLinkNode right = null;
    public TreeLinkNode next = null; // 指向父结点的指针

    public TreeLinkNode(Object val) {
        this.nodeValType = val;
    }
}