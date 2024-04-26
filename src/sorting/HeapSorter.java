package sorting;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Stores a max heap for sorting using the heap sort algorithm.
 * @param <T> the types of elements that are being sorted
 *
 * @author Josh Archer
 * @author ... (your name)
 * @version 1.0
 */
public class HeapSorter<T> {
    private T[] heap;
    private int size;
    private Comparator<T> comparator;

    /**
     * Creates a new heap sorter.
     * @param array the array to sort
     * @param comparator a comparator for the elements
     */
    public HeapSorter(T[] array, Comparator<T> comparator) {
        this.heap = array;
        this.size = array.length;
        this.comparator = comparator;
    }

    /**
     * Performs the steps of the heap sort algorithm. This includes
     * the build-heap operation which runs in O(n) time and the
     * sort operation which runs in O(n log n) time.
     */
    public void sort() {
        //TODO perform the build-heap operation (requires a loop)

        //TODO remove all elements from the heap and place them back in the array

    }

    /*
     * Removes the largest element from the heap in O(log n) time.
     * @return the element at the root of the heap
     */
    private T remove() {
        T saved = heap[0];
        heap[0] = heap[size - 1];
        heap[size - 1] = null;

        size--;
        sink(0);

        return saved;
    }

    /*
     * Performs the "sink" operation on the heap in O(log n) time.
     */
    private void sink(int index) {
        int highIndexWithChild = (size / 2) - 1;

        while (index <= highIndexWithChild) {
            int leftIndex = 2 * index + 1;
            int rightIndex = 2 * index + 2;

            //which is the larger child
            int largestIndex = leftIndex;
            if (rightIndex < size && comparator.compare(heap[rightIndex], heap[leftIndex]) > 0) {
                largestIndex = rightIndex;
            }

            //swap if out of order
            if (comparator.compare(heap[index], heap[largestIndex]) < 0) {
                swap(index, largestIndex);
                index = largestIndex;
            } else {
                break; //stop - short circuit
            }
        }
    }

    /*
     * Swaps two elements in the heap
     */
    private void swap(int indexOne, int indexTwo) {
        T temp = heap[indexOne];
        heap[indexOne] = heap[indexTwo];
        heap[indexTwo] = temp;
    }

    @Override
    public String toString() {
        return "HeapSorter (toSort=" + Arrays.toString(heap) + ")";
    }
}
