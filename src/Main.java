import java.util.Iterator;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {
        System.out.println("DEMO OF CUSTOM ARRAY LIST\n\n");
        MyArrayList<Integer> arrayList = new MyArrayList<>();

        // Adding elements
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        System.out.println("After adding: " + arrayList.get(0) + ", " + arrayList.get(1) + ", " + arrayList.get(2));

        // Adding at index
        arrayList.add(1, 15);
        System.out.println("After adding at index 1: " + arrayList.get(1));

        // Removing elements
        arrayList.remove(0);
        System.out.println("After removing index 0: " + arrayList.get(0));

        // Setting an element
        arrayList.set(0, 100);
        System.out.println("After setting index 0 to 100: " + arrayList.get(0));

        // Clearing the list
        arrayList.clear();
        System.out.println("After clearing the list: " + arrayList.size());

        // Checking size
        arrayList.add(10);
        arrayList.add(20);
        System.out.println("Size of list: " + arrayList.size());

        // IndexOutOfBoundsException - Add
        try {
            arrayList.add(3, 100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException when trying to add at an out-of-bounds index");
        }

        // IndexOutOfBoundsException - Get
        try {
            System.out.println(arrayList.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException when trying to get from an out-of-bounds index");
        }

        // IndexOutOfBoundsException - Set
        try {
            arrayList.set(5, 500);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException when trying to set an out-of-bounds index");
        }

        // IndexOutOfBoundsException - Remove
        try {
            arrayList.remove(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException when trying to remove an out-of-bounds index");
        }

        // Iterator
        arrayList.add(10);  // reset list for iterator
        arrayList.add(20);
        Iterator<Integer> it = arrayList.iterator();
        System.out.print("Iterator output: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Sorting
        arrayList.add(30);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.sort();
        System.out.println("After sorting: " + arrayList.get(0) + ", " + arrayList.get(1) + ", " + arrayList.get(2));

        // Add First and Last
        arrayList.addFirst(5);
        arrayList.addLast(35);
        System.out.println("First element: " + arrayList.getFirst() + ", Last element: " + arrayList.getLast());

        // Remove First and Last
        arrayList.removeFirst();
        arrayList.removeLast();
        System.out.println("After removing first and last: First element: " + arrayList.getFirst() + ", Last element: " + arrayList.getLast());

        System.out.println("DEMO OF DOUBLY LINKED LIST\n\n");
        MyDoublyLinkedList<Integer> list = new MyDoublyLinkedList<>();

        // Adding elements
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("After adding: " + list.get(0) + ", " + list.get(1) + ", " + list.get(2));

        // Adding at index
        list.add(1, 15);
        System.out.println("After adding at index 1: " + list.get(1));

        // Removing elements
        list.remove(0);
        System.out.println("After removing index 0: " + list.get(0));

        // Setting an element
        list.set(0, 100);
        System.out.println("After setting index 0 to 100: " + list.get(0));

        // Clearing the list
        list.clear();
        System.out.println("After clearing the list: " + list.size());

        // Checking size
        list.add(10);
        list.add(20);
        System.out.println("Size of list: " + list.size());

        // IndexOutOfBoundsException - Add
        try {
            list.add(3, 100);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException when trying to add at an out-of-bounds index");
        }

        // IndexOutOfBoundsException - Get
        try {
            System.out.println(list.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException when trying to get from an out-of-bounds index");
        }

        // IndexOutOfBoundsException - Set
        try {
            list.set(5, 500);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException when trying to set an out-of-bounds index");
        }

        // IndexOutOfBoundsException - Remove
        try {
            list.remove(5);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught IndexOutOfBoundsException when trying to remove an out-of-bounds index");
        }

        // Iterator
        list.add(10);  // reset list for iterator
        list.add(20);
        it = list.iterator();
        System.out.print("Iterator output: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // Sorting
        list.add(30);
        list.add(10);
        list.add(20);
        list.sort();
        System.out.println("After sorting: " + list.get(0) + ", " + list.get(1) + ", " + list.get(2));

        // Add First and Last
        list.addFirst(5);
        list.addLast(35);
        System.out.println("First element: " + list.getFirst() + ", Last element: " + list.getLast());

        // Remove First and Last
        list.removeFirst();
        list.removeLast();
        System.out.println("After removing first and last: First element: " + list.getFirst() + ", Last element: " + list.getLast());

    CustomMinHeap<Integer> minHeap = new CustomMinHeap<>();

    // Test add and peek
        minHeap.add(10);
        System.out.println("Peek after adding 10: " + minHeap.peek());
        minHeap.add(5);
        System.out.println("Peek after adding 5: " + minHeap.peek());

    // Test extractMin
        minHeap.add(5);
        minHeap.add(10);
        System.out.println("Extracted min: " + minHeap.extractMin());
        System.out.println("Peek after extraction: " + minHeap.peek());
        System.out.println("Extracted min again: " + minHeap.extractMin());
        System.out.println("Is heap empty after extraction? " + minHeap.isEmpty());

    // Test heap property
        minHeap.add(50);
        minHeap.add(30);
        minHeap.add(20);
        minHeap.add(15);
        minHeap.add(10);
        minHeap.add(5);
        minHeap.add(1);
        System.out.println("Extracted min: " + minHeap.extractMin());
        System.out.println("Extracted min: " + minHeap.extractMin());
        System.out.println("Extracted min: " + minHeap.extractMin());

    // Test size
        System.out.println("Heap size: " + minHeap.size());
        minHeap.add(5);
        minHeap.add(10);
        System.out.println("Heap size after adding elements: " + minHeap.size());

    // Test isEmpty
        System.out.println("Is heap empty initially? " + minHeap.isEmpty());
        minHeap.extractMin();
        System.out.println("Is heap empty after extraction? " + minHeap.isEmpty());

    // Test peek on empty heap
        try {
        minHeap.peek();
    } catch (NoSuchElementException e) {
        System.out.println("Peek on empty heap throws NoSuchElementException");
    }

    // Test extractMin on empty heap
        try {
        minHeap.extractMin();
    } catch (NoSuchElementException e) {
            System.out.println("ExtractMin on empty heap throws NoSuchElementException");
        }
        CustomQueue<Integer> queue = new CustomQueue<>();

        // Test enqueue
        queue.enqueue(10);
        System.out.println("Queue is empty after enqueue: " + queue.isEmpty());
        System.out.println("Queue size after one enqueue: " + queue.size());

        // Test dequeue
        queue.enqueue(10);
        queue.enqueue(20);
        int dequeued = queue.dequeue();
        System.out.println("Dequeued element: " + dequeued);
        System.out.println("Queue size after dequeue: " + queue.size());
        System.out.println("Peek after dequeue: " + queue.peek());

        // Test peek
        queue.enqueue(10);
        queue.enqueue(20);
        int front = queue.peek();
        System.out.println("Peeked element: " + front);
        System.out.println("Queue size after peek: " + queue.size());

        // Test isEmpty
        System.out.println("Is queue empty initially? " + queue.isEmpty());
        queue.enqueue(10);
        System.out.println("Is queue empty after enqueue? " + queue.isEmpty());
        queue.dequeue();
        System.out.println("Is queue empty after dequeue? " + queue.isEmpty());

        // Test size
        System.out.println("Queue size initially: " + queue.size());
        queue.enqueue(10);
        queue.enqueue(20);
        System.out.println("Queue size after enqueuing elements: " + queue.size());

        // Test dequeue on empty queue
        try {
            queue.dequeue();
        } catch (NoSuchElementException e) {
            System.out.println("Dequeue on empty queue throws NoSuchElementException");
        }

        // Test peek on empty queue
        try {
            queue.peek();
        } catch (NoSuchElementException e) {
            System.out.println("Peek on empty queue throws NoSuchElementException");
        }
        CustomStack<Integer> stack = new CustomStack<>();

        // Test push
        stack.push(10);
        System.out.println("Is stack empty after push? " + stack.isEmpty());
        System.out.println("Top element after push: " + stack.peek());

        // Test pop
        stack.push(10);
        stack.push(20);
        int popped = stack.pop();
        System.out.println("Popped element: " + popped);
        System.out.println("Size after pop: " + stack.size());

        // Test peek
        stack.push(10);
        stack.push(20);
        int topItem = stack.peek();
        System.out.println("Top item after peek: " + topItem);
        System.out.println("Size after peek: " + stack.size());

        // Test isEmpty
        System.out.println("Is stack empty initially? " + stack.isEmpty());
        stack.push(10);
        System.out.println("Is stack empty after pushing an item? " + stack.isEmpty());
        stack.pop();
        System.out.println("Is stack empty after popping the only item? " + stack.isEmpty());

        // Test size
        System.out.println("Stack size initially: " + stack.size());
        stack.push(10);
        stack.push(20);
        System.out.println("Stack size after pushing elements: " + stack.size());

        // Test pop on empty stack
        try {
            stack.pop();
        } catch (NoSuchElementException e) {
            System.out.println("Pop on empty stack throws NoSuchElementException");
        }

        // Test peek on empty stack
        try {
            stack.peek();
        } catch (NoSuchElementException e) {
            System.out.println("Peek on empty stack throws NoSuchElementException");
        }}}