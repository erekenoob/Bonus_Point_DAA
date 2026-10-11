public class tree {
    node root_node;

    public tree() {
        root_node = null;
    }


    public void insert(int k) {
        root_node = insert_rec(root_node, k);
    }

    node insert_rec(node current_root, int k) {
        if (current_root == null) {
            current_root = new node(k);
            return current_root;
        }

        if (k < current_root.key)
            current_root.left = insert_rec(current_root.left, k);
        else if (k > current_root.key)
            current_root.right = insert_rec(current_root.right, k);

        return current_root;
    }

    public boolean search(int k) {
        node curr_node = root_node;

        while (curr_node != null) {
            if (curr_node.key == k) {
                return true;
            } else if (curr_node.key > k) {
                curr_node = curr_node.left;
            } else {
                curr_node = curr_node.right;
            }
        }
        return false;
    }
}