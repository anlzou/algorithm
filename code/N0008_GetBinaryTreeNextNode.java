/**
 * @Date        : 2020-05-24 15:33:23
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-24 15:54:53
 * @FilePath    : \algorithm\code\N0008_GetBinaryTreeNextNode.java
 * @Describe    : 
 */
package code;

import code.structural.TreeLinkNode;

public class N0008_GetBinaryTreeNextNode {

    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode.right != null) {
            TreeLinkNode node = pNode.right;
            while (node.left != null)
                node = node.left;
            return node;
        } else {
            while (pNode.next != null) {
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode)
                    return parent;
                pNode = pNode.next;
            }
        }
        return null;
    }

}