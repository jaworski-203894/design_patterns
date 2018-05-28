package pl.ttpsc.strategy;

import java.util.Collection;
import java.util.List;

public interface SearchStrategy <T> {
    int search(List<? extends Comparable<? super T>> collection, T item);
}
