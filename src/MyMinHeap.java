public class MyMinHeap {

import java.util.NoSuchElementException;

    public class CustomMinHeap<T extends Comparable<T>> {
        private final CustomArrayList<T> heap;

        public CustomMinHeap() {
            this.heap = new CustomArrayList<>();
        }

        public void add(T item) {
            heap.append(item);
            int i = heap.getSize() - 1;
            while (i > 0) {
                int parent = (i - 1) / 2;
                if (heap.access(i).compareTo(heap.access(parent)) >= 0) {
                    break;
                }
                swap(i, parent);
                i = parent;
            }
        }

        public T extractMinimum() {
            if (heap.getSize() == 0) {
                throw new NoSuchElementException("Heap is empty");
            }
            T min = heap.access(0);
            T last = heap.access(heap.getSize() - 1);
            heap.modify(0, last);
            heap.delete(heap.getSize() - 1);
            if (heap.getSize() > 0) {
                heapify(0);
            }
            return min;
        }

        public T peek() {
            if (heap.getSize() == 0) {
                throw new NoSuchElementException("Heap is empty");
            }
            return heap.access(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int smallest = i;
            if (left < heap.getSize() && heap.access(left).compareTo(heap.access(smallest)) < 0) {
                smallest = left;
            }
            if (right < heap.getSize() && heap.access(right).compareTo(heap.access(smallest)) < 0) {
                smallest = right;
            }
            if (smallest != i) {
                swap(i, smallest);
                heapify(smallest);
            }
        }

        private void swap(int i, int j) {
            T temp = heap.access(i);
            heap.modify(i, heap.access(j));
            heap.modify(j, temp);
        }

        public int getSize() {
            return heap.getSize();
        }

        public boolean isEmpty() {
            return heap.getSize() == 0;
        }
    }
```
}
