package practice.searching.linearSearch;

public class Searcher {
    int searcher(int[] number,int key){
        for (int index = 0; index < number.length; index++) {
            if(number[index]==key){
                return index;
            }
        }
        return -1;
    }

}
