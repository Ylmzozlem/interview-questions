import java.util.Scanner;

public class Question08 {
   // Write a program in Java to find sum of digits of a number using recursion.
   public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.print("Please enter your number: ");
       int num=scn.nextInt();

       System.out.println(sumOfDigitds(num));
   }

   static int sum=0;
   static int rem;
    private static int sumOfDigitds(int num) {
       while (num!=0) {
           rem = num % 10;
           sum = sum + rem;
           num /= 10; // num=num/10;
       }
        return sum;
    }



}
