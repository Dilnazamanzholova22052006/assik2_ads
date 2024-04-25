import java.util.NoSuchElementException;
    public class CustomStack<T extends Comparable<T>> {
        private MyDoublyLinkedList<T> customList = new MyDoublyLinkedList<T>();

        // Check if the stack is empty
        public boolean isEmpty() {
            return customList.size() == 0;
        }

        // Peek at the top element of the stack without removing it
        public T peek() {
            if (isEmpty()) {
                throw new NoSuchElementException("Stack is empty");
            }
            return customList.getLast();
        }

        // Get the size of the stack
        public int size() {
            return customList.size();
        }

        // Push an element onto the stack
        public void push(T element) {
            customList.addLast(element);  // Elements are added to the end for LIFO
        }

        // Pop the top element from the stack
        public T pop() {
            if (isEmpty()) {
                throw new NoSuchElementException("Stack is empty");
            }
            T element = customList.getLast();  // Get the last element
            customList.removeLast();           // Remove the last element
            return element;
        }
    }

