package practice.sorting;

public class BubbleSort {
    void bubbleSort(int[] array){
        int length=array.length;
        boolean isSwapped;
        for (int i = 0; i < length-1;i++) {
            isSwapped=false;
            for (int j=0;j<length-1-i;j++){
                if (array[j]>array[j+1]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                    isSwapped=true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
    }
    void printSortedArray(int[] array){
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{64, 34, 25, 12, 22, 11, 90};
        BubbleSort bubbleSort=new BubbleSort();
        bubbleSort.bubbleSort(arr);
        bubbleSort.printSortedArray(arr);
    }
}
//int arr[] = { 64, 34, 25, 12, 22, 11, 90 };