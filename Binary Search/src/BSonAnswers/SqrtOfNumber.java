package BSonAnswers;

public class SqrtOfNumber {
    public static void main(String[] args) {
        int x = 9;
        System.out.println(floorSqrt(x));
    }

    static long floorSqrt(long x)
    {
        // Your code here
        long start = 1;
        long end = x;
        long ans = -1;

        while (start <= end){
            long mid = start + (end - start) / 2;

            if(mid * mid <= x){
                ans = mid;
                start = mid + 1;
            }else{
                end = mid - 1;
            }

        }

        return ans;

    }
}
