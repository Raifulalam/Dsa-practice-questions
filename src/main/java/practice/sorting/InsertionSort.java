package practice.sorting;

public class InsertionSort {
    void sorter(int[] array){
        for (int i = 0; i < array.length; i++) {
            int currentElement=array[i];
            int comparingIndex=i-1;
            while (comparingIndex>= 0 && array[comparingIndex] > currentElement){
                array[comparingIndex+1]=array[comparingIndex];
                comparingIndex--;
            }
            array[comparingIndex+1]=currentElement;
        }
    }
    void printSortedArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr= {12, 11, 13, 5, 6};
        InsertionSort insertionSort=new InsertionSort();
        insertionSort.sorter(arr);
        insertionSort.printSortedArray(arr);
    }
}
//arr[]: {12, 11, 13, 5, 6}
