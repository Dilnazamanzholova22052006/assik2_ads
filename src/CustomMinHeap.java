import java.util.NoSuchElementException;
    public class CustomMinHeap<T extends Comparable<T>> {
        private final MyArrayList<T> customHeap;

        public CustomMinHeap() {
            this.customHeap = new MyArrayList<>();
        }

        public void insert(T item) {
            customHeap.add(item);  // Add at the end
            int index = customHeap.size() - 1;
            while (index > 0) {
                int parentIndex = (index - 1) / 2;
                if (customHeap.get(index).compareTo(customHeap.get(parentIndex)) >= 0) {
                    break;
                }
                swap(index, parentIndex);
                index = parentIndex;
            }
        }

        public T removeMin() {
            if (customHeap.size() == 0) {
                throw new NoSuchElementException("Heap is empty");
            }
            T min = customHeap.get(0);
            T last = customHeap.get(customHeap.size() - 1);
            customHeap.set(0, last);
            customHeap.remove(customHeap.size() - 1);
            if (customHeap.size() > 0) {
                heapify(0);
            }
            return min;
        }

        public T peekMin() {
            if (customHeap.size() == 0) {
                throw new NoSuchElementException("Heap is empty");
            }
            return customHeap.get(0);
        }

        private void heapify(int index) {
            int left = 2 * index + 1;
            int right = 2 * index + 2;
            int smallest = index;
            if (left < customHeap.size() && customHeap.get(left).compareTo(customHeap.get(smallest)) < 0) {
                smallest = left;
            }
            if (right < customHeap.size() && customHeap.get(right).compareTo(customHeap.get(smallest)) < 0) {
                smallest = right;
            }
            if (smallest != index) {
                swap(index, smallest);
                heapify(smallest);
            }
        }

        private void swap(int i, int j) {
            T temp = customHeap.get(i);
            customHeap.set(i, customHeap.get(j));
            customHeap.set(j, temp);
        }

        public int getSize() {
            return customHeap.size();
        }

        public boolean isEmpty() {
            return customHeap.size() == 0;
        }
    }


