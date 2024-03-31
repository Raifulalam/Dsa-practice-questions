package practice.stack.recursion.factorial;

public class Factorial {
    int factorialCalculator(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n* factorialCalculator(n-1);
    }

    public static void main(String[] args) {
        Factorial factorial=new Factorial();
        System.out.println("factorial.factorialFinder(20) = " + factorial.factorialCalculator(10));
    }
}
