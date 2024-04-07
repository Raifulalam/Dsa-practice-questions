package practice.searching.linearSearch;

public class LinearSearcher {
    int searcher(int[] number,int key){
        for (int index = 0; index < number.length; index++) {
            if(number[index]==key){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers=new int[]{20,35,45,78,98,64,45,78,35,9,5,45,6,3,5,64,6,7,64,9,243,1,53,1};
        LinearSearcher linearSearcher=new LinearSearcher();
        System.out.println("linearSearcher.searcher(numbers,37) = " + linearSearcher.searcher(numbers, 35));
    }
}
