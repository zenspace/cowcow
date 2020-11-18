package com.bom.cowcow.util;


public class CowStack {
    private Node rootNode = new Node();
    private Node currentNode = this.rootNode;

    public void push(int v) {
        Node node = new Node();
        node.setValue(v);
        node.setPrevNode(currentNode);
        currentNode.setNextNode(node);
        this.currentNode = node;
    }

    public int pop() {
        if(this.isRoot()) {
            return -1;
        }

        int value = this.currentNode.getValue();
        Node prevNode = this.currentNode.getPrevNode();
        prevNode.setNextNode(null);
        this.currentNode = prevNode;
        return value;
    }

    private boolean isRoot() {
        if(this.currentNode == this.rootNode) {
            return true;
        }
        return false;
    }
}
