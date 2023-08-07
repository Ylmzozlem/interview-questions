import java.util.Scanner;

public class Question01 {
    // Write a program to reverse an integer in Java.
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please give a number: ");
        int num=input.nextInt();

        int reverse=0;

        while(num!=0){

            reverse= reverse*10 + num%10;

            num=num/10;

        }
        System.out.println(String.format("Number after reverse: %s",reverse));

    }
}
