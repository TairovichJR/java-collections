package com.tairovich;

public class LinkedList {

   Node head;

   public void insert(int data){

       Node node = new Node(data);

       if (head == null){
           head = node;

       }else{
           Node temp = head;
           while (temp.next != null){
               temp = temp.next;
           }
           temp.next = node;

       }
   }
}