package tree;

public class BinarySearchTreeTest {
    public static void main(String[] args) {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(3);
        tree.insert(2);
        tree.insert(1);
        tree.insert(5);
        tree.insert(4);
        tree.insert(6);

        System.out.println(tree.contains(0));
        System.out.println(tree.contains(7));
        System.out.println(tree.contains(null));
        System.out.println(tree.contains(1));
        System.out.println(tree.contains(4));

        tree.preOrder(tree.root);
        System.out.println("------");
        tree.midOrder(tree.root);
        System.out.println("------");
        tree.sufOrder(tree.root);
        System.out.println("------");

        System.out.println("前序:" + AllInOneTraverse.traverse(tree.root, AllInOneTraverse.STATE_NONE));
        System.out.println("中序:" + AllInOneTraverse.traverse(tree.root, AllInOneTraverse.STATE_LEFT_DONE));
        System.out.println("后序:" + AllInOneTraverse.traverse(tree.root, AllInOneTraverse.STATE_LEFT_RIGHT_DONE));

    }
}
