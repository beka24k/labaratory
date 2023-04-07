import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] number = {1, 4, 6, 2,};
        int number2 = sc.nextInt();
        reverse(number, 0, number2 - 1);
    }

    /*
     * @findMin()-finding minimum of array
     * @findAvg()-finding average of array
     * @isPrime()-function that checks the number for prime or composite
     * @factorial()-function that solve the problem like n!(factorial)
     * @fibanacci()-finding the fibanacci number of xertain index
     * @sumFibanacci()-determine of sum fibanacci number until certain index
     * @degree(int a ,int b)- function that solve a^b
     * @isDigit()-checks stroke for numeric or not numeric situation
     * @euclideanAlgorithm()-function that find the GCD of 2 integers
     *@reverse(int[] arr,int start, int end)-the function that making array reversive without using array data structure.
     * */
    public static void reverse(int[] arr, int start, int end) {
        if (end <= start) {//base case
            for (int j : arr) {
                System.out.print(j + " ");
            }

        } else {//recursive case
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverse(arr, start + 1, end - 1);
        }
    }
}
