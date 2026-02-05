import java.util.Scanner;

public class Data_Types1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for all primitive data types
        System.out.print("Enter a byte value: ");
        byte b = sc.nextByte();

        System.out.print("Enter a short value: ");
        short s = sc.nextShort();

        System.out.print("Enter an int value: ");
        int i = sc.nextInt();

        System.out.print("Enter a long value: ");
        long l = sc.nextLong();

        System.out.print("Enter a float value: ");
        float f = sc.nextFloat();

        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();

        System.out.print("Enter a char value: ");
        char c = sc.next().charAt(0); // take first character of input string

        System.out.print("Enter a boolean value (true/false): ");
        boolean bool = sc.nextBoolean();

        // Displaying values
        System.out.println("\n--- Primitive Data Types ---");
        System.out.println("byte value: " + b);
        System.out.println("short value: " + s);
        System.out.println("int value: " + i);
        System.out.println("long value: " + l);
        System.out.println("float value: " + f);
        System.out.println("double value: " + d);
        System.out.println("char value: " + c);
        System.out.println("boolean value: " + bool);

        sc.close();
    }
}
