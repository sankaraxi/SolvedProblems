package basicProblems;

public class imediateSmallerElement {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,3};
        immediateSmaller(arr);
        for (int re : arr) {
            System.out.print(re + " ");
        }

    }
    static void immediateSmaller(int arr[]) {
        // code here
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                arr[i] = -1;
                break;
            }

            if (arr[i + 1] < arr[i]) {
                arr[i] = arr[i + 1];
            } else {
                arr[i] = -1;
            }
        }
    }
}
