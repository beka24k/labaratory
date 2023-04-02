public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1};
        double sum=findAvg(arr,arr.length);
        double nofn=arr.length;
        System.out.println(sum/nofn);
    }

    public static int findAvg(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            int sum;
            sum=arr[n-1]+findAvg(arr,n-1);
            return sum;
        }
    }
}
