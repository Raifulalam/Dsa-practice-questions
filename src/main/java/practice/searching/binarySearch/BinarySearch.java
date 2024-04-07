package practice.searching.binarySearch;

public class BinarySearch {
    public int searcher(int[] array,int key){
        int firstIndex=0;
        int lastIndex=array.length-1;
        while(firstIndex<lastIndex){
            int middleIndex=firstIndex+((lastIndex-firstIndex)/2);
            if (array[middleIndex]==key){
                return middleIndex;
            }
            else if(array[middleIndex]>key){
                lastIndex=middleIndex-1;
            } else if (array[middleIndex] < key) {
                firstIndex=middleIndex+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers=new int[]{1,2,4,6,8,9,20,40,60,64,69,78,85,89,92};
        BinarySearch binarySearch=new BinarySearch();
        System.out.println("binarySearch.searcher(numbers,64) = " + binarySearch.searcher(numbers, 64));
    }
}
