package monotonicStack;
//https://www.geeksforgeeks.org/problems/number-of-nges-to-the-right/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=number-of-nges-to-the-right
import java.util.Arrays;

public class NGEsToRight {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 7, 5, 8, 10, 6};
        int N = arr.length;
        int queries = 2;
        int[] indices = {0, 5};

        System.out.println(Arrays.toString(count_NGEs(N, arr, queries, indices)));

    }

    static int[] count_NGEs(int N, int arr[], int queries, int indices[]) {
        // code here
        int[] ans = new int[queries];

        for (int i = 0 ; i < queries;i++){
            int index = indices[i];
            int count = 0;
            for (int j = index+1; j < N; j++) {
                if (arr[j] > arr[index]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
