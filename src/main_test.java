import java.util.Random;

public class main_test {

    public static void main(String[] args) {

        int[] array_sizes = {100, 1000, 10000};
        Random rand_gen = new Random();

        System.out.println("N      Tree time     Hash time");
        System.out.println("-----------------------------");

        for (int i = 0; i < array_sizes.length; i++) {

            int curr_n = array_sizes[i];

            tree test_tree = new tree();

            hash_table test_hash = new hash_table(1000);

            int[] random_arr = new int[curr_n];

            for (int j = 0; j < curr_n; j++) {
                random_arr[j] = rand_gen.nextInt(100000);
            }

            long start_tree = System.nanoTime();
            for (int j = 0; j < curr_n; j++) {
                test_tree.insert(random_arr[j]);}

            long end_tree = System.nanoTime();
            long tree_time_result = end_tree - start_tree;


            long start_hash = System.nanoTime();
            for (int j = 0; j < curr_n; j++) {
                test_hash.insert(random_arr[j]);}

            long end_hash = System.nanoTime();
            long hash_time_result = end_hash - start_hash;

            System.out.println(curr_n + "    " + tree_time_result + "        " + hash_time_result);

        }

    }
}