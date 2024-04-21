public class MyList {
    public interface CustomList<T> extends Iterable<T> {
        void append(T item);
        void modify(int index, T item);
        void insert(int index, T item);
        void prepend(T item);
        void appendLast(T item);
        T access(int index);
        T accessFirst();
        T accessLast();
        void delete(int index);
        void deleteFirst();
        void deleteLast();
        void sort();
        int findIndex(Object object);
        int findLastIndex(Object object);
        boolean contains(Object object);
        Object[] convertToArray();
        void clearAll();
        int getSize();
    }
```
}
