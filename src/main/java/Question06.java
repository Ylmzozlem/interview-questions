import java.util.Scanner;

public class Question06 {
    // Write a program in Java to check whether a number is Palindrome or not using recursive method
    static String isPalindrom(int num2) {
        if (num2== reverse(num2)) {
            return "Given number is a Palindrom";
        }
        return "Given number is not a Palindrom";
    }

    static int reverse = 0;
    static int reminder;

    static int reverse(int number) {
        while (number != 0) {
            reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your number : ");
        int num = scn.nextInt();
        System.out.println(isPalindrom(num));

    }
}
