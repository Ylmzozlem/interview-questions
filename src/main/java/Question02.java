import java.util.Scanner;

public class Question02 {
    // Write a program in Java to check whether an integer is Armstrong number or not.
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Please give me a number for checking : ");
        int number=scn.nextInt();

        if(isAmstrongNumber(number)) {
            System.out.println(number+ " is an Amstrong Number");
        }else{
            System.out.println(number+ " is not an Amstrong Number");
        }


    }

    private static boolean isAmstrongNumber(int number) {
        int orginalNumber=number;
        int numDigits= String.valueOf(number).length();
        int sum=0;

        while(number>0){
            int digits=number%10;
            sum+=Math.pow(digits,numDigits);
            number /=10;
        }

        return sum ==orginalNumber;
    }


}
