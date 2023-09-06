import java.util.Scanner;

public class Question07 {
  //   Write a program in Java to find greatest among three integers.
  public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.print("Enter your first num: ");
      int a= scn.nextInt();
      System.out.print("Enter your second num: ");
      int b= scn.nextInt();
      System.out.print("Enter your third num: ");
      int c=scn.nextInt();

      findGreatestNumber(a,b,c);

      /*
      if(a>b && a>c){
          System.out.println(String.format("%s is greatest", a));
      }

      if(b>a && b>c){
          System.out.println(String.format("%s is greatest", b));
      }
      if(c>a && c>b){
          System.out.println(String.format("%s is greatest", c));
      }

       */
  }

    private static void findGreatestNumber(int x, int y, int z) {
        if(x>y && x>z){
            System.out.println(String.format("%s is greatest", x));
        }

        if(y>x && y>z){
            System.out.println(String.format("%s is greatest", y));
        }
        if(z>x && z>y){
            System.out.println(String.format("%s is greatest", z));
        }
    }


}
