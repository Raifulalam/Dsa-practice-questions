package practice.sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {64, 25, 12, 22, 11};
        int[] arr = {10, 25, 8, 42, 17, 30, 5, 19, 33, 12, 7, 28, 14, 21, 48, 3, 36, 22, 9, 41, 16, 31, 6, 20, 35, 11, 27, 13, 18, 32, 4, 37, 23, 1, 38, 24, 2, 39, 15, 29, 43, 26, 40, 34, 49, 44, 47, 46, 45};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(array);
        selectionSort.printSortedArray(array);
        System.out.println(" ");
        selectionSort.selectionSort(arr);
        selectionSort.printSortedArray(arr);
    }

    public void selectionSort(int[] array) {
//        int length=array.length;
        for (int i = 0; i < array.length; i++) {
            int minAdd = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minAdd] > array[j]) {
                    minAdd = j;
                }
            }
            int temp = array[i];
            array[i] = array[minAdd];
            array[minAdd] = temp;
        }
    }

    void printSortedArray(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }

}
//arr[] = {64, 25, 12, 22, 11}