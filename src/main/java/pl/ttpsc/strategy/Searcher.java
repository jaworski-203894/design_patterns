package pl.ttpsc.strategy;

import java.util.List;

public class Searcher<T> {
    List<? extends Comparable<? super T>> collection;
    SearchStrategy strategy;

    public Searcher(List<? extends Comparable<? super T>> collection, SearchStrategy strategy) {
        this.collection = collection;
        this.strategy = strategy;
    }
    public boolean find(T item) {
        return strategy.search(collection, item) != -1;
    }
}
