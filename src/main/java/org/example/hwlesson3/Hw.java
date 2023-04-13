package org.example.hwlesson3;


public class Hw {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Исходный список: " + list);

        list.reverse();

        System.out.println("Развёрнутый список: " + list);
    }
    public static class DoublyLinkedList {
        private Node head;
        private Node tail;

        public void add(int value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
        }

        public void reverse() {
            Node temp = null;
            Node current = head;

            while (current != null) {
                temp = current.prev;
                current.prev = current.next;
                current.next = temp;
                current = current.prev;
            }

            if (temp != null) {
                head = temp.prev;
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node current = head;

            while (current != null) {
                sb.append(current.value).append(" ");
                current = current.next;
            }

            return sb.toString();
        }

        private class Node {
            private int value;
            private Node prev;
            private Node next;

            public Node(int value) {
                this.value = value;
            }
        }
    }
}
