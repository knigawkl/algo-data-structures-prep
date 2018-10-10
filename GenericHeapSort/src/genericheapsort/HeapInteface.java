package genericheapsort;

public interface HeapInteface <T extends Comparable<T>> {
    public void put(T item);
    public T pop();
}