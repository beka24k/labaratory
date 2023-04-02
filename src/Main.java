import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println(degree(number,number2));
    }
public static int degree(int number,int number2){
        if(number2==0){
            return 1;
        }else{
            return number*degree(number,number2-1);
        }
}

}


