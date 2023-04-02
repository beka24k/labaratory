import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("sum of fibonacci numbers- "+sumFibanacci(number+1));
        System.out.println("5 problem solution- "+fibanacci(number));
    }


public static int sumFibanacci(int number){
        if (number==0){
            return 0;
        }else{
            return fibanacci(number)+fibanacci(number-1);
        }
}
    public static int fibanacci(int number) {
        if (number <= 1) {
            return number;
        }else{
                return fibanacci(number - 1) + fibanacci(number - 2);
            }
        }
    }


