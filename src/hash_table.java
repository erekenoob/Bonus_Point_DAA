public class hash_table {
    hash_node[] hash_table;
    int table_size;

    public hash_table(int s) {
        table_size = s;
        hash_table = new hash_node[table_size];
    }

    int get_hash(int k) {
        return k % table_size;
    }

    public void insert(int k) {
        int idx = get_hash(k);
        hash_node new_node = new hash_node(k);

        if(hash_table[idx] == null) {
            hash_table[idx] = new_node;
        } else {
            hash_node temp_node = hash_table[idx];
            while(temp_node.next_node != null) {
                if(temp_node.key == k) return;
                temp_node = temp_node.next_node;
            }
            if(temp_node.key != k) {
                temp_node.next_node = new_node;
            }
        }
    }

    public boolean search(int k) {
        int idx = get_hash(k);
        hash_node temp_node = hash_table[idx];

        while(temp_node != null) {
            if(temp_node.key == k) {
                return true;
            }
            temp_node = temp_node.next_node;
        }

        return false;
    }
}