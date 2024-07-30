package BSonAnswers;
//https://practice.geeksforgeeks.org/problems/find-nth-root-of-m5843/1
public class NthRootOfM {
    public static void main(String[] args) {
        int n = 9;
        int m = 1953125;
        System.out.println(NthRoot(n,m));
    }

    static int NthRoot(int n, int m)
    {
        // code here
        int start = 1;
        int end = m;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            long power = power(mid,n,m);

            if (power == m){
                ans = mid;
                break;
            }else if(power < m){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }

    static long power(int mid, int n ,int m){
        long power = 1;
        for (int i = 1 ; i<=n; i++){
            if (power > m) break;
            power = power * mid;
        }
        return power;
    }
}
