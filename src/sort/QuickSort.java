package sort;

import java.util.Arrays;

public class QuickSort implements ISort {
    @Override
    public void sort(int[] arr) {
        int[] sortedArr = qsort(arr);
        System.arraycopy(sortedArr, 0, arr, 0, arr.length);
    }

    private int[] qsort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        if (arr[0] == arr[arr.length - 1]) {
            return arr;
        }

        int mid = arr[0];
        int[] ll = Arrays.stream(arr).filter(x -> x <= mid).toArray();
        int[] rr = Arrays.stream(arr).filter(x -> x > mid).toArray();

        swap(ll, 0, ll.length - 1); // key point!
        ll = qsort(ll);
        rr = qsort(rr);

        System.arraycopy(ll, 0, arr, 0, ll.length);
        System.arraycopy(rr, 0, arr, ll.length, rr.length);
        return arr;
    }
}
