import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isPrime(number, number/2));
    }

    public static int isPrime(int number, int i) {
        if (i == 1) {
            System.out.println("Prime");
            return 1;
        }
        else if (number % i == 0) {
            System.out.println("Composite");
            return 0;
        }
        else {
            return isPrime(number, i-1);
        }
    }
}
