import java.util.Scanner;

public class Question03 {
    //Write a program in Java to check given number is prime or not.
    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int number=scn.nextInt();
        int flag=0;
        for(int i=2;i<(number/2);i++){
            if(number%i==0){
                flag++;
                break;
            }
        }
        if(flag==1){
            System.out.println(String.format(" Number %s is not a prime", number));
        }else{
            System.out.println(String.format(" Number %s is a prime", number));
        }

    }
}
