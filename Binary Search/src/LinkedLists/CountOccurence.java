package LinkedLists;

public class CountOccurence {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,2,3};
        int target = 4;
        System.out.println(countOccurence(arr, target));
    }

    static int countOccurence(int[] arr, int x) {

        int n = arr.length;

        int firstOcc = search(arr,x,n,true);
        if (firstOcc == -1) return 0;
        int secondOcc = search(arr,x,n,false);
        int count = (secondOcc - firstOcc) + 1;

        return count;
    }

    static int search(int[] arr, int target, int n, boolean firstOcc){
        int ans = -1;

        int start = 0;
        int end = n - 1;

        while (start <= end){



            int mid = start + (end - start) / 2;

            if (target > arr[mid]){
                start = mid + 1;
            }else if(target < arr[mid]){
                end = mid - 1;
            }else {
                ans = mid;
                if (firstOcc){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}
