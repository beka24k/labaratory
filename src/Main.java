import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factorial(number));
    }
public static int factorial(int number){
        if(number==0){
            return 1;
        }else{
            return number*factorial(number-1);
        }
}
}
