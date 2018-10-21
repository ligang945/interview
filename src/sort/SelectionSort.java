package sort;

public class SelectionSort implements ISort {

    int getIndexOfMax(int[] arr, int begin, int end) {
        int max = Integer.MIN_VALUE;
        int indexOfMax = -1;
        for (int i = begin; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    @Override
    public void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int indexOfMax = getIndexOfMax(arr, 0, i);
            swap(arr, indexOfMax, i);
        }
    }
}
