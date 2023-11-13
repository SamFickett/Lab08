//By: Nikan Kadkhodazadeh

package Lab8;

import java.util.ArrayList;
import java.util.List;

public class printTTF<E extends Comparable<E>> extends TwoThreeFourTree<E> {

    @Override
    public void insert(E data) {
        // Your implementation of the insert method goes here
    }

    @Override
    public boolean contains(E data) {
        // Your implementation of the contains method goes here
        return false;
    }

    @Override
    public E[] getSorted() {
        List<E> sortedList = new ArrayList<>();
        getSorted(root, sortedList);
        return sortedList.toArray((E[]) new Comparable[sortedList.size()]);
    }

    // Helper method to perform in-order traversal and populate the sorted list
    private void getSorted(Node<E> node, List<E> sortedList) {
        if (node != null) {
            for (int i = 0; i < node.size; i++) {
                // Recursively traverse left child
                getSorted(node.children[i], sortedList);
                // Add current data item to the sorted list
                sortedList.add(node.data[i]);
            }
            // Recursively traverse rightmost child
            getSorted(node.children[node.size], sortedList);
        }
    }
}
