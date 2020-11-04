package com.tairovich;

import com.sun.source.tree.NewArrayTree;

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

   public void insertAtStart(int data){
       Node node = new Node(data);
       node.next = head;
       head = node;
   }

   public void show(){
       Node node = head;
       while (node.next != null){
           System.out.println(node.data);
           node = node.next;
       }
       System.out.println(node.data);
   }

   public void insertAt(int index, int data){
       Node node = new Node(data);
       Node temp = head;
       if (index == 0){
           insertAtStart(data);
       }else{
           for (int i = 0; i< index-1; i++){
               temp = temp.next;
           }
           node.next = temp.next;
           temp.next = node;
       }
   }

   public void deleteAt(int index){

       if (index == 0){
           head = head.next;
       }else{
           Node temp = head;
           Node n1 = null;
           for (int i = 0; i < index-1; i++) {
               temp = temp.next;
           }
           n1 = temp.next;
           temp.next = n1.next;
       }
   }




}
