package sort;

public class SortTest {
    public static void main(String[] args) {
        int[] array = {10, 8, 6, 5, 7, 9, 2, 1, 3, 4, 2};
//        ISort sort = new BubbleSort();
//        ISort sort = new SelectionSort();
//        ISort sort = new InsertSort();
//        ISort sort = new MergeSort();
//        ISort sort = new QuickSort();
//        ISort sort = new CountSort();
        ISort sort = new ShellSort();

        sort.sort(array);
        for (int ele : array) {
            System.out.print(ele + " ");
        }
    }
}
