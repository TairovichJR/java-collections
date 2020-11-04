package com.tairovich;

public class DynamicStack {

    int capacity = 2;
    int[] stack = new int[capacity];
    int top = 0;

    public void push(int data){
        if(size() == capacity){
            expand();
        }
        stack[top] = data;
        top++;
    }

    public int pop(){

        if (isEmpty()){
            System.out.println("Stack is empty");
        }else{
            top--;
            int data = stack[top];
            stack[top] = 0;
            shrink();
            return  data;
        }
        return  0;
    }

    private void shrink() {
        int length = size();
        if (length < (capacity/2)/2){
            capacity = capacity/2;
        }
        int[] newStack = new int[capacity];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
    }

    private void expand(){
        int length = size();
        int[] newStack = new int[capacity*2];
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;
        capacity = capacity * 2;
    }

    public void show(){
        for (int n : stack){
            System.out.print(n + " ");
        }
    }

    public int peek(){
        int data = stack[top-1];
        return  data;
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top<=0;
    }
}
