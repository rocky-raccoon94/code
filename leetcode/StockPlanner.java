package leetcode;

import java.util.Stack;

class StockSpanner {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public StockSpanner() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public int next(final int price) {
        int tem = 1;
        if (!stack1.isEmpty() && stack1.peek() <= price) {
            stack1.pop();
            tem += stack2.pop();

        }
        stack1.push(price);
        return stack2.push(tem);

    }
}