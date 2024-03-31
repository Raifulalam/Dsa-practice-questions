package practice.stack.recursion.fibonacciSeries;


import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    int fibonacciSeries(int number){
        if (number == 0 || number==1) {
            return number;
        }
        return fibonacciSeries(number-1)+fibonacciSeries(number-2);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci();
        System.out.println("fibonacci.fibonacciSeries(10) = " + fibonacci.fibonacciSeries(10));
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci.fibonacciSeries(i)+"  ");
            array[i]=fibonacci.fibonacciSeries(i);
        }
        System.out.println(" ");
        System.out.println(Arrays.toString(array));
    }
}
