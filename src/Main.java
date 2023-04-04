import java.util.Scanner;

public class Main {
    //main part of taking data from user
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        int counter = number.length() - 1;//counter to stop the recursion and make a base case
        System.out.println(isDigit(number, counter));
    }

    //using data to make function for solution
    public static String isDigit(String number, int counter) {
        char c = number.charAt(counter);
        if (counter == 0) {//base case
            return "Yes";
        }
        if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {//checker if the function will found letter witout
            return "No";
        } else { //recursion case
            return isDigit(number, counter - 1);//recursion for making easier problem
        }
    }
}


