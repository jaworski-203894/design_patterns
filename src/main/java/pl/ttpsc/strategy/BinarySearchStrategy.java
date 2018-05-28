package pl.ttpsc.strategy;

import java.util.Collections;
import java.util.List;

public class BinarySearchStrategy<T> implements SearchStrategy<T> {
    @Override
    public int search(List<? extends Comparable<? super T>> collection, T item) {
        return Collections.binarySearch(collection, item);
    }
}
