import java.util.Scanner;

public class Question04 {
    // Write a program in Java to print the Fibonacci series using iteration
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scn.nextInt();

        int first = 0;
        int second = 1;
        int result;

        System.out.println("Fibonacci series :  ");
        for (int i = 0; i < num; i++) {
            if(i<=1){
                result=i;
            }else{
                result=first+second;
                first=second;
                second=result;
            }
            System.out.println(result);

        }

    }
}
