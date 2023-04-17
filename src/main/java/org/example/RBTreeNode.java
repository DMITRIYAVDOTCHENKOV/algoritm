package org.example;

        public class RBTreeNode<E extends Comparable<E>> {
            private E data;
            private RBTreeNode<E> left;
            private RBTreeNode<E> right;
            private boolean isRed;

            public RBTreeNode(E data) {
                this.data = data;
                this.isRed = true; // Новый узел всегда красный
            }

            public E getData() {
                return data;
            }

            public RBTreeNode<E> getLeft() {
                return left;
            }

            public void setLeft(RBTreeNode<E> left) {
                this.left = left;
            }

            public RBTreeNode<E> getRight() {
                return right;
            }

            public void setRight(RBTreeNode<E> right) {
                this.right = right;
            }

            public boolean isRed() {
                return isRed;
            }

            public void setRed(boolean red) {
                isRed = red;
            }
        }