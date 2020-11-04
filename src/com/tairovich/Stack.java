package com.tairovich;

public class Stack {

    int[] stack = new int[5];
    int top = 0;

    public void push(int data){
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
            return  data;
        }
        return 0;
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
