package geeksforgeeks;

import java.util.ArrayList;

public class AllFactorialNumbers {
    public static void main(String[] args) {
        long n = 9;
        ArrayList<Long> result = factorialNumbers(n);
        System.out.println(result);
    }

    static ArrayList<Long> factorialNumbers(long n) {
       ArrayList<Long> arr = new ArrayList<>();
       factorialHelper(1, 1, n, arr);
       return arr;
    }

    static void factorialHelper(long current, long fact, long n, ArrayList<Long> arr) {
        if (fact > n) {
            return;
        }
        arr.add(fact);
        factorialHelper(current + 1, fact * (current + 1), n, arr);

    }
}

