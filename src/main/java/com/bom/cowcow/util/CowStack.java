package com.bom.cowcow.util;

public class CowStack<T> {
    Node<T> root = new Node<T>();
    Node<T> currentNode = this.root;

   public void push(T v) {
       Node<T> n = new Node<T>();
       n.value = v;
       currentNode.nextNode= n;
       currentNode = n;
   }

   public T pop() {
       if(this.isRoot()) {
           System.out.println("root");
           return null;
       }
       Node<T> n = currentNode;
       this.currentNode.prevNode = null;
       return (T) n.value;
   }

   private boolean isRoot() {
       return this.currentNode == this.root ? true: false;
   }
}
