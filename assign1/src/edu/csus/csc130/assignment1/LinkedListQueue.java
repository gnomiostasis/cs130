package edu.csus.csc130.assignment1;

import java.util.Iterator;

/**
 * Circular linked list implementation of Queue
 */
public class LinkedListQueue<E> implements QueueI<E> {
    Node<E> tail = null;
    int count = 0;
    
    public LinkedListQueue() {}

    @Override
    public void enqueue(E item) {
        if (isEmpty()) {
            tail = new Node<E>(item, null);
            tail.next = tail;
        } else {
            Node<E> node = new Node<E>(item, tail.next);
            tail.next = node;
            tail = node;
        }
        count++;

    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            return null;
        } else {
            E item = tail.next.item;
            if (count==1) {
                tail = null;
            } else {
                tail.next = tail.next.next;
            }

            count--;
            return item;
        }
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            return null;
        } else {
            return tail.next.item;
        }
    }

    @Override
    public boolean isEmpty() {
        return (count==0);
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator<E> iterator() {
    	throw new UnsupportedOperationException();
    }

    private static class Node<E> {
        E item = null;
        Node<E> next = null;

        @SuppressWarnings("unused")
		public Node() {}

        public Node(E data, Node<E> next) {
            this.item = data;
            this.next = next;
        }
    }
}
