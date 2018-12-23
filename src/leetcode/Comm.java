package leetcode;

public class Comm {

    public static int findMax(int[] arr, int start, int end) {
        if (start == end) return arr[start - 1];
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++)
            if (arr[i] > max) max = arr[i];
        return max;
    }

    public static int findIndexOfMax(int[] arr, int start, int end) {
        if (start == end) return arr[start - 1];
        int max = Integer.MIN_VALUE;
        int indexOfMax = -1;
        for (int i = start; i < end; i++)
            if (arr[i] > max) {
                max = arr[i];
                indexOfMax = i;
            }
        return indexOfMax;
    }


    public static int findMin(int[] arr, int start, int end) {
        if (start == end) return arr[start - 1];
        int min = Integer.MAX_VALUE;
        for (int i = start; i < end; i++)
            if (arr[i] < min) min = arr[i];
        return min;
    }

    public static int findIndexOfMin(int[] arr, int start, int end) {
        if (start == end) return arr[start - 1];
        int min = Integer.MAX_VALUE;
        int indexOfMin = -1;
        for (int i = start; i < end; i++)
            if (arr[i] < min) {
                min = arr[i];
                indexOfMin = i;
            }
        return indexOfMin;
    }

    public static void swap(int[] arr, int i, int j) {
        if (i != j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
    }
}
