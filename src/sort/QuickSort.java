package sort;

import java.util.ArrayList;

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
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Integer> r = new ArrayList<>();
        for (int ele : arr) {
            if (ele <= mid) {
                l.add(ele);
            } else {
                r.add(ele);
            }
        }
        int[] ll = new int[l.size()];
        int[] rr = new int[r.size()];
        for (int i = 0; i < l.size(); i++) {
            ll[i] = l.get(i);
        }
        for (int i = 0; i < r.size(); i++) {
            rr[i] = r.get(i);
        }
        swap(ll, 0, ll.length - 1); // key point!
        ll = qsort(ll);
        rr = qsort(rr);

        System.arraycopy(ll, 0, arr, 0, ll.length);
        System.arraycopy(rr, 0, arr, ll.length, rr.length);
        return arr;
    }
}
