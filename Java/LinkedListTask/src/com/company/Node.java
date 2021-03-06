package com.company;

public class Node<E> {
    E item;
    Node<E> next;
    Node<E> prev;

    Node(Node<E> prev, E element, Node<E> next) throws NodeValueException{
        if(element instanceof ForbiddenType){
            throw new NodeValueException("Node object as value for Node object is forbidden");
        }else{
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
