import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number2= sc.nextInt();
        System.out.print(eucladianAlgorithm(number, number2));
    }
    public static int eucladianAlgorithm(int n, int m) {

        if (m == 0) {
            return n;//base case
        } else {
            return eucladianAlgorithm(m, n%m);//recursion case
        }
    }
}


