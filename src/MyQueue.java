public class MyQueue {

import java.util.NoSuchElementException;

    public class CustomQueue<T extends Comparable<T>> {
        private final CustomLinkedList<T> linkedList = new CustomLinkedList<T>();

        public void enqueue(T element) {
            linkedList.appendLast(element);
        }

        public T dequeue() {
            if (isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            T element = linkedList.accessFirst();
            linkedList.deleteFirst();
            return element;
        }

        public T peek() {
            if (isEmpty()) {
                throw new NoSuchElementException("Queue is empty");
            }
            return linkedList.accessFirst();
        }

        public boolean isEmpty() {
            return linkedList.getSize() == 0;
        }

        public int getSize() {
            return linkedList.getSize();
        }
    }
```
}
