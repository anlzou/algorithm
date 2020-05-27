/**
 * @Date        : 2020-05-27 09:04:46
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-27 09:08:42
 * @FilePath    : \algorithm\code\N0009_Using2stacks2implement.java
 * @Describe    : 
 */
package code;

import java.util.Stack;

public class N0009_Using2stacks2implement {
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();

    // 对 in 栈进行入栈
    public void push(int node) {
        in.push(node);
    }

    // 对 out 栈进行出栈
    public int pop() throws Exception {
        if (out.isEmpty())
            while (!in.isEmpty())
                out.push(in.pop());

        if (out.isEmpty())
            throw new Exception("queue is empty");

        return out.pop();
    }
}