package com.tairovich;

public class Runner {
    public static void main(String[] args) {


        LinkedList list =  new LinkedList();
        list.insert(12);
        list.insert(14);

        list.insertAt(1,13);
        list.deleteAt(1);
      //  list.show();

//        Stack nums = new Stack();
//        nums.push(15);
//        nums.push(8);
//        nums.push(10);
//
//        System.out.println(nums.pop());
//        System.out.println(nums.peek());
//        nums.show();

//        DynamicStack stack = new DynamicStack();
//        stack.push(12);
//        stack.push(13);
//        stack.push(14);
//        stack.push(15);
//        stack.show();

        Queue queue = new Queue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.dequeue();

        queue.show();

    }
}
