package geeksforgeeks;

public class EuclideanAlgorithm {
    //Euclidean Algorithm  to calculate gcd/hcf
    public static void main(String[] args) {
        int A = 24;
        int B = 52;
        System.out.println(gcdEA(A, B));
    }

    static int gcdEA(int a, int b) {
        while (a>0 && b>0){
            //instead of swaping I am using if else
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }
        }

        if(a==0) return b;
        return a;
    }
}
