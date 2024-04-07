package practice.searching.linearSearch;

public class ContainsElement {
    boolean checkElement(int[] numbers,int key){
        for (int index = 0; index < numbers.length; index++) {
            if(numbers[index]==key){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers=new int[]{20,35,45,78,98,64,45,78,35,9,5,45,6,3,5,64,6,7,64,9,243,1,53,1};
        ContainsElement containsElement=new ContainsElement();
        System.out.println("containsElement.checkElement(numbers,64) = " + containsElement.checkElement(numbers, 64));
    }
}
