package pl.ttpsc.strategy;

import java.util.List;

public class LinearSearchStrategy<T> implements SearchStrategy<T> {
    @Override
    public int search(List<? extends Comparable<? super T>> collection, T item) {
        for (int i = 0; i < collection.size(); i++) {
            if(collection.get(i).compareTo(item) == 0) {
                return i;
            }
        }
        return -1;
    }
}
