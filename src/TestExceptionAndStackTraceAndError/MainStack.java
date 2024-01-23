package TestExceptionAndStackTraceAndError;

import java.util.Stack;

public class MainStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();   // Stack - LIFO
        for (int i = 0; i< 30;i++){             // Queue - FIFO
            stack.push(i);
        }
        for (int i =0;i<30;i++){
            System.out.println(stack.pop());
        }
    }
}
