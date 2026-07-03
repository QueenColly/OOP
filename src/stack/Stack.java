package stack;

public class Stack {

    private int[] stack = new int[5];
    private int top = -1;

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void push(int value) {
        if (isFull()){
                return;
    }
        top++;
        stack[top] = value;

    }
    public int pop(){

        if(top == -1) {
            return -1;
        }

        int value = stack[top];
        top--;

        return value;
    }

    public int peek(){
        if(top == -1){
            return -1;
        }
        return stack[top];
    }


}
