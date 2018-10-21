package sort;

//for (int i = 0; i < arr.length; i++)

public interface ISort {
    void sort(int[] arr);

    default void swap(int[] arr, int m, int n) {
        int t = arr[m];
        arr[m] = arr[n];
        arr[n] = t;
    }
}
