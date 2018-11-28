package tree;

public class BinarySearchTree<T extends Comparable<T>> {
    public Node root;

    public boolean insert(T i) {
        if (root == null) {
            root = new Node(i);
            return true;
        }

        Node current = root;
        while (true) {
            // 如果 i 比当前结点的值小
            if (i.compareTo((T) current.data) < 0) {
                if (current.left != null) {
                    current = current.left;
                } else {
                    current.left = new Node(i);
                    break;
                }
            } else {
                if (current.right != null)
                    current = current.right;
                else {
                    current.right = new Node(i);
                    break;
                }
            }
        }
        return true;
    }

    public boolean contains(T t) {
        if (t == null) {
            return false;
        }
        Node current = this.root;
        while (true) {
            if (t.compareTo((T) current.data) < 0) {
                if (current.left == null) {
                    return false;
                }
                current = current.left;
            } else if (t.compareTo((T) current.data) > 0) {
                if (current.right == null) {
                    return false;
                }
                current = current.right;
            } else {
                return true;
            }
        }
    }

    public void preOrder(Node<T> n) {
        if (n == null) {
            return;
        }
        System.out.println(n.data);
        if (n.left != null)
            preOrder(n.left);
        if (n.right != null)
            preOrder(n.right);
    }

    public void midOrder(Node n) {
        if (n == null) {
            return;
        }
        if (n.left != null)
            midOrder(n.left);
        System.out.println(n.data);
        if (n.right != null)
            midOrder(n.right);
    }

    public void sufOrder(Node n) {
        if (n == null) {
            return;
        }
        if (n.left != null)
            sufOrder(n.left);
        if (n.right != null)
            sufOrder(n.right);
        System.out.println(n.data);
    }
}
