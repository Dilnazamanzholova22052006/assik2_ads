import java.util.Iterator;
public class MyArrayList<T> implements MyList<T> {
    private T[] elements; // Internal array to hold the list elements.
    private int count; // The number of elements currently in the list.

    // Default constructor that initializes the list with an initial capacity of 10.
    public MyArrayList() {
        elements = (T[]) new Object[10];
        count = 0;
    }

    // Constructor with specified initial capacity; throws IllegalArgumentException if capacity is negative.
    public MyArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        elements = (T[]) new Object[initialCapacity];
        count = 0;
    }

    // Constructor that initializes the list with an existing array of items.
    public MyArrayList(T[] items) {
        elements = items;
        count = items.length;
    }

    // Copy constructor that initializes the list with another MyArrayList instance.
    public MyArrayList(MyArrayList<T> list) {
        elements = list.elements;
        count = list.count;
    }

    // Get the number of items in the list.
    @Override
    public int size() {
        return count;
    }

    // Get the item at the given index. Throws IndexOutOfBoundsException if index is out of bounds.
    @Override
    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    // Set the item at the given index to the given value. Throws IndexOutOfBoundsException if index is out of bounds.
    @Override
    public void set(int index, T item) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        elements[index] = item;
    }

    // Add the given item to the end of the list. Expands the array if necessary.
    @Override
    public void add(T item) {
        if (count == elements.length) {
            T[] newArray = (T[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
        elements[count++] = item;
    }

    // Add the given item at the given index. Shifts subsequent elements to the right. Expands the array if necessary.
    @Override
    public void add(int index, T item) {
        if (index < 0 || index > count) {
            throw new IndexOutOfBoundsException();
        }
        if (count == elements.length) {
            T[] newArray = (T[]) new Object[elements.length * 2];
            System.arraycopy(elements, 0, newArray, 0, elements.length);
            elements = newArray;
        }
        for (int i = count; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = item;
        count++;
    }

    // Convenience method to add an item at the start of the list.
    @Override
    public void addFirst(T item) {
        add(0, item);
    }

    // Convenience method to add an item at the end of the list (same as add(T item)).
    @Override
    public void addLast(T item) {
        add(item);
    }

    // Remove the item at the given index. Throws IndexOutOfBoundsException if index is out of bounds.
    @Override
    public void remove(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < count - 1; i++) {
            elements[i] = elements[i + 1];
        }
        count--;
    }

    // Remove the item at the start of the list. Throws IndexOutOfBoundsException if the list is empty.
    @Override
    public void removeFirst() {
        if (count == 0) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 0; i < count - 1; i++) {
            elements[i] = elements[i + 1];
        }
        count--;
    }

    // Remove the last item in the list. Throws IndexOutOfBoundsException if the list is empty.
    @Override
    public void removeLast() {
        if (count == 0) {
            throw new IndexOutOfBoundsException();
        }
        count--;
    }

    // Get the first item in the list. Throws IndexOutOfBoundsException if the list is empty.
    @Override
    public T getFirst() {
        if (count == 0) {
            throw new IndexOutOfBoundsException();
        }
        return elements[0];
    }

    // Get the last item in the list. Throws IndexOutOfBoundsException if the list is empty.
    @Override
    public T getLast() {
        if (count == 0) {
            throw new IndexOutOfBoundsException();
        }
        return elements[count - 1];
    }

    // Sorts the list using a bubble sort algorithm. Assumes T implements Comparable<T>.
    @Override
    public void sort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (((Comparable<T>) elements[i]).compareTo(elements[j]) > 0) {
                    T temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }
    }

    // Return the index of the first occurrence of the specified object or -1 if not found.
    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    // Return the index of the last occurrence of the specified object or -1 if not found.
    @Override
    public int lastIndexOf(Object object) {
        for (int i = count - 1; i >= 0; i--) {
            if (elements[i].equals(object)) {
                return i;
            }
        }
        return -1;
    }

    // Check if the list contains the specified object.
    @Override
    public boolean exists(Object object) {
        for (int i = 0; i < count; i++) {
            if (elements[i].equals(object)) {
                return true;
            }
        }
        return false;
    }

    // Return an array containing all elements in the list.
    @Override
    public Object[] toArray() {
        Object[] arr = new Object[count];
        System.arraycopy(elements, 0, arr, 0, count);
        return arr;
    }

    // Empty the list.
    @Override
    public void clear() {
        count = 0;
    }

    // Provide an iterator over the elements in the list.
    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < count;
            }

            @Override
            public T next() {
                return elements[currentIndex++];
            }
        };

    }
}