import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();

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
        Iterator<Integer> it = list.iterator();
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
