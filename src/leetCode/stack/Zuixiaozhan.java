package leetCode.stack;

import java.util.Stack;

/**
 * @Author Ning Nainian
 * @Date 2020/3/8 11:49
 * @Description
 *
 * 最小栈
 *
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/min-stack
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Zuixiaozhan {
    private Stack<Integer> data;
    private Stack<Integer> helpDate;

    public Zuixiaozhan(){
        data = new Stack<>();
        helpDate = new Stack<>();
    }
    public void push(int x) {
        data.add(x);
        if(helpDate.isEmpty() || helpDate.peek() > x){
            helpDate.add(x);
        }else{
            helpDate.add(helpDate.peek());
        }
    }

    public void pop() {
        data.pop();
        helpDate.pop();
    }

    public int top() {
        if(!data.isEmpty()){
            return data.peek();
        }
        throw new RuntimeException("栈中元素为空，无法获取栈顶元素");
    }

    public int getMin() {
        if(!helpDate.isEmpty()){
            return helpDate.peek();
        }
       throw new RuntimeException("栈中元素为空，无法获取最小元素");
    }
}