public class MyStack {

import java.util.NoSuchElementException;

    public class CustomStack<T extends Comparable<T>> {
        private CustomLinkedList<T> linkedList = new CustomLinkedList<T>();

        public void push(T element) {
            linkedList.appendLast(element);
        }

        public T pop() {
            if (isEmpty()) {
                throw new NoSuchElementException("Stack is empty");
            }
            T element = linkedList.accessLast();
            linkedList.deleteLast();
            return element;
        }

        public T peek() {
            if (isEmpty()) {
                throw new NoSuchElementException("Stack is empty");
            }
            return linkedList.accessLast();
        }

        public boolean isEmpty() {
            return linkedList.getSize() == 0;
        }

        public int getSize() {
            return linkedList.getSize();
        }
    }
}
