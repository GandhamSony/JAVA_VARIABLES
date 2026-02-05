import java.util.Scanner;

public class Product_three1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num1:");
        int num1 = sc.nextInt();
        System.out.println("enter num2:");
        int num2 = sc.nextInt();
        System.out.println("enter num3");
        int num3 = sc.nextInt();

        int product = num1*num2*num3;
        System.out.println("product:"+product);
        sc.close();
    }
}
