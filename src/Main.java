import java.util.Iterator;

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
    }
}
