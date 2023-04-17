package org.example;

public class RedBlackTree<E extends Comparable<E>> {
    private RBTreeNode<E> root;

    public void insert(E data) {
        root = insert(root, data);
        root.setRed(false); // Количество черных узлов при добавлении нового элемента не меняется,
        // поэтому корень всегда черный
    }

    private RBTreeNode<E> insert(RBTreeNode<E> root, E data) {
        if (root == null) {
            return new RBTreeNode<>(data);
        }

        if (data.compareTo(root.getData()) < 0) {
            root.setLeft(insert(root.getLeft(), data));
        } else {
            root.setRight(insert(root.getRight(), data));
        }

        // Балансировка после вставки
        if (isRed(root.getRight()) && !isRed(root.getLeft())) {
            root = rotateLeft(root);
        }

        if (isRed(root.getLeft()) && isRed(root.getLeft().getLeft())) {
            root = rotateRight(root);
        }

        if (isRed(root.getLeft()) && isRed(root.getRight())) {
            flipColors(root);
        }

        return root;
    }

    private boolean isRed(RBTreeNode<E> node) {
        if (node == null) {
            return false;
        }

        return node.isRed();
    }

    private RBTreeNode<E> rotateLeft(RBTreeNode<E> root) {
        RBTreeNode<E> right = root.getRight();
        root.setRight(right.getLeft());
        right.setLeft(root);
        right.setRed(root.isRed());
        root.setRed(true);

        return right;
    }

    private RBTreeNode<E> rotateRight(RBTreeNode<E> root) {
        RBTreeNode<E> left = root.getLeft();
        root.setLeft(left.getRight());
        left.setRight(root);
        left.setRed(root.isRed());
        root.setRed(true);

        return left;
    }

    private void flipColors(RBTreeNode<E> root) {
        root.setRed(true);
        root.getLeft().setRed(false);
        root.getRight().setRed(false);
    }
}
