package simpleProblems;
//https://leetcode.com/problems/powx-n/
public class PowerXN {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow(x, n));
    }
    public static double myPow(double x, int n) {
       return Math.pow(x,n);
    }
}
