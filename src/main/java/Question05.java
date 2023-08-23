import java.util.Scanner;

public class Question05 {
    // Write a program in Java to check whether a number is Palindrome or not using iteration.
    public static void main(String[] args) {
        int cloneNum, reminder ,reverse=0;
        Scanner scn= new Scanner(System.in);
        System.out.println("Please enter your number : ");
        int num=scn.nextInt();
        cloneNum=num;

        while (cloneNum!=0){
            reminder=cloneNum%10;
            reverse=reverse*10+reminder;
            cloneNum/=10 ;// cloneNum= cloneNum/10
        }

        if(num==reverse){
            System.out.println(String.format("Number %s is a Palindrome",num));
        }else {
            System.out.println(String.format("Number %s is not  a Palindrome",num));
        }
    }
}
