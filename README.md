# Bonus_Point_DAA
# Report about Binary Search Tree and Hash Table

## 1. Theoretical Complexity (Time Complexity)

### Binary Search Tree (BST)
In average case time for search, insert and to delete is `O(log n)`[cite: 3, 4, 5]. Algorithm need to go down by branches from root to bottom and do comparison[cite: 3, 5].
In worst case: If we insert keys which already is sorted, our tree stretching in one long line. And then time of work will be linear `O(n)`[cite: 3, 5].

### Hash Table
In average case: This is very fast structure. Because of hash-mathematics access to element take constant time `O(1)`[cite: 3, 5]. We just to calculate needed index and take the data[cite: 3].
In worst case: If hash function be bad, will be many collisions. Keys gathering in one long list and time also falling to `O(n)`[cite: 3, 5]. But we not use hash tables for the sake of worst time[cite: 5].

## 2. My Results of Test

I did test on random numbers. Time was measuring in nanoseconds. My computer counted and numbers turned out like this very indicative.

| Quantity (N) | Time of insert BST | Time of insert Hash Table |
| :--- | :--- | :--- |
| 100 | 437,100 | 32,700 |
| 1,000 | 208,500 | 176,600 |
| 10,000 | 2,154,700 | 1,764,700 |

## 3. Academic Conclusions

In practice hash table work noticeably faster. It not need to walk by branches, it immediately calculate index in array[cite: 3]. But binary search tree have its own big advantage: it keeping all elements in sorted order, and hash table turning order of data into chaos[cite: 3, 4].

With big academic respect to your lectures and discipline, I finishing this report.
