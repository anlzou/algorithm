/**
 * @Date        : 2020-05-27 09:04:46
 * @LastEditors : anlzou
 * @Github      : https://github.com/anlzou
 * @LastEditTime: 2020-05-27 10:58:24
 * @FilePath    : \algorithm\code\N0009_Using2stacks2implementQueues.java
 * @Describe    : 
 */
package code;

import java.util.Stack;

public class N0009_Using2stacks2implementQueues {
    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();

    // 对 in 栈进行入栈
    public void push(int node) {
        in.push(node);
    }

    // 对 out 栈进行入栈和出栈
    public int pop() throws Exception {
        if (out.isEmpty())
            while (!in.isEmpty())
                out.push(in.pop());

        if (out.isEmpty())
            throw new Exception("queue is empty");

        return out.pop();// 弹出栈顶的元素，函数外需要多次调用pop()函数
    }
}