import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.print(euclideanAlgorithm(number, number2));
    }

    public static int euclideanAlgorithm(int n, int m) {
        if (m == 0) {
            return n;
        } else {
            return euclideanAlgorithm(m, n % m);
        }
    }
}
