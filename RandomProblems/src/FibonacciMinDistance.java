import java.util.Arrays;

public class FibonacciMinDistance {
    public static void main(String[] args) {
        int n = 10;
        int target = 7;
        System.out.println(findMinDistance(target));
    }

    // Brute force solution


//    static int findMinDistance(int n, int target){
//        int [] fibo = new int[n];
//        int first = 0;
//        int second = 1;
//        for (int i = 0; i < n ; i++) {
//            fibo[i] = first;
//            int next = first + second;
//            first = second;
//            second= next;
//        }
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < fibo.length; i++) {
//            if (target < fibo[i]){
//                int currentDistance = Math.abs(fibo[i] - target);
//                int previousDistance = Math.abs(fibo[i - 1] - target);
//                min = Math.min(currentDistance,previousDistance);
//                break;
//            }
//        }
//        return min;
//    }

//    optimal
    static int findMinDistance(int target){
        int first = 1;
        int second = 1;
        int next = first + second;
        while (next < target){
            first = second;
            second = next;
            next = first + second;
        }
        return Math.min(target - second, next - target);
    }
}

