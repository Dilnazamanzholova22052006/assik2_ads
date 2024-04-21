public class MyLinkedList {
import java.util.Iterator;
import java.util.NoSuchElementException;

    public class MyLinkedList<T extends Comparable<T>> implements MyList<T> {
        private static class Node<T extends Comparable<T>> implements Comparable<Node<T>> {
            T value;
            Node<T> next;
            Node<T> prev;

            Node(T value) {
                this.value = value;
                this.next = null;
                this.prev = null;
            }

            Node(T value, Node<T> next, Node<T> prev) {
                this.value = value;
                this.next = next;
                this.prev = prev;
            }

            @Override
            public int compareTo(Node<T> other) {
                return this.value.compareTo(other.value);
            }
        }


        private Node<T> head;
        private Node<T> tail;
        private int size;

        @Override
        public void append(T item) {
            if (head == null) {
                head = new Node<>(item);
                tail = head;
            } else {
                Node<T> newNode = new Node<>(item, null, tail);
                tail.next = newNode;
                tail = newNode;
            }
            size++;
        }

        @Override
        public void set(int index, T item) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }

            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            current.value = item;
        }

        @Override
        public void insert(int index, T item) {
            if (index < 0 || index > size) {
                throw new IndexOutOfBoundsException();
            }
            if (index == 0) {
                prepend(item);
            } else if (index == size) {
                append(item);
            } else {
                Node<T> current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
                Node<T> newNode = new Node<>(item, current, current.prev);
                current.prev.next = newNode;
                current.prev = newNode;
                size++;
            }
        }

        @Override
        public void prepend(T item) {
            Node<T> newNode = new Node<>(item, head, null);
            if (head == null) {
                tail = newNode;
            } else {
                head.prev = newNode;
            }
            head = newNode;
            size++;
        }

        @Override
        public void appendLast(T item) {
            append(item);
        }

        @Override
        public T get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }

            Node<T> current;
            if (index < size / 2) {
                current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
            } else {
                current = tail;
                for (int i = size - 1; i > index; i--) {
                    current = current.prev;
                }
            }
            return current.value;
        }

        @Override
        public T getFirst() {
            if (head == null) {
                throw new NoSuchElementException();
            }
            return head.value;
        }

        @Override
        public T getLast() {
            if (tail == null) {
                throw new NoSuchElementException();
            }
            return tail.value;
        }

        @Override
        public void remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            if (index == 0) {
                removeFirst();
                return;
            } else if (index == size - 1) {
                removeLast();
                return;
            }

            Node<T> current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;
            current.next = null;
            current.prev = null;

            size--;
        }

        @Override
        public void removeFirst() {
            if (head == null) {
                throw new NoSuchElementException();
            }

            Node<T> nextNode = head.next;

            if (nextNode != null) {
                nextNode.prev = null;
            } else {
                tail = null;
            }

            head.next = null;
            head = nextNode;

            size--;
        }

        @Override
        public void removeLast() {
            if (tail == null) {
                throw new NoSuchElementException();
            }

            Node<T> prevNode = tail.prev;

            if (prevNode != null) {
                prevNode.next = null;
            } else {
                head = null;
            }

            tail.prev = null;
            tail = prevNode;

            size--;
        }

        @Override
        public void sort() {
            if (head == null || head.next == null) {
                return;
            }

            Node<T> sorted = new Node<>(null);

            while (head != null) {
                Node<T> current = head;
                head = head.next;

                Node<T> sortedCurrent = sorted;
                while (sortedCurrent.next != null && sortedCurrent.next.value.compareTo(current.value) < 0) {
                    sortedCurrent = sortedCurrent.next;
                }

                current.next = sortedCurrent.next;
                if (sortedCurrent.next != null) {
                    sortedCurrent.next.prev = current;
                }
                sortedCurrent.next = current;
                current.prev = sortedCurrent;

                if (sortedCurrent == tail || tail == null) {
                    tail = current;
                }
            }

            head = sorted.next;
            if (head != null) {
                head.prev = null;
            }
        }

        @Override
        public int indexOf(Object object) {
            int index = 0;
            Node<T> current = head;

            if (object == null) {
                while (current != null) {
                    if (current.value == null) {
                        return index;
                    }
                    current = current.next;
                    index++;
                }
            } else {
                while (current != null) {
                    if (object.equals(current.value)) {
                        return index;
                    }
                    current = current.next;
                    index++;
                }
            }
            return -1;
        }

        @Override
        public int lastIndexOf(Object object) {
            int index = size - 1;
            Node<T> current = tail;

            if (object == null) {
                while (current != null) {
                    if (current.value == null) {
                        return index;
                    }
                    current = current.prev;
                    index--;
                }
            } else {
                while (current != null) {
                    if (object.equals(current.value)) {
                        return index;
                    }
                    current = current.prev;
                    index--;
                }
            }
            return -1;
        }

        @Override
        public boolean contains(Object object) {
            Node<T> current = head;

            if (object == null) {
                while (current != null) {
                    if (current.value == null) {
                        return true;
                    }
                    current = current.next;
                }
            } else {
                while (current != null) {
                    if (object.equals(current.value)) {
                        return true;
                    }
                    current
}
