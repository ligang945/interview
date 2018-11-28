package tree;

public class Node<T> {
    public T data;
    public Node<T> left;
    public Node<T> right;
    public int state;


    public Node(T d) {
        this.data = d;
    }

    @Override
    public String toString() {
        return "{" + data + "}";
    }
}
