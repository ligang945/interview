package leetcode;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversal {

    public List<Integer> preorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        list.add(root.val);
        if (root.children != null && root.children.size() != 0) {
            for (Node node : root.children) {
                list.addAll(preorder(node));
            }
        }
        return list;
    }

    public List<Integer> postorder(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        if (root.children != null && root.children.size() != 0) {
            for (Node node : root.children) {
                list.addAll(postorder(node));
            }
        }
        list.add(root.val);
        return list;
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) return root;
        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}

