package BSonAnswers;
//https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
import java.util.Arrays;

public class AllocateMinimumPages {
    public static void main(String[] args) {
        int[] arr = {15,10,19,10,5,18,7};
        int students = 5;
        int n = 7;
        System.out.println(findPages(n,arr,students));
    }

    public static long findPages(int n, int[] arr, int m) {
        // Your code here


        int start = Arrays.stream(arr).max().getAsInt();
        int end = sum(arr);

        int ans = -1;

        if(m > n){
            return ans;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;

            int students = countStudents(arr,mid);

            if (students <= m){
                ans = mid;
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int countStudents(int[] arr, int pages){
        int students = 1;
        int pagesOfStudent = 0;

        for (int i = 0; i < arr.length; i++){
            if (pagesOfStudent + arr[i] <= pages){
                pagesOfStudent += arr[i];
            }else{
                students++;
                pagesOfStudent = arr[i];
            }
        }
        return students;
    }

    public static int sum(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}
