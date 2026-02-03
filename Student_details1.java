import java.util.Scanner;

class Student_details1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.println("Enter Name:");
        String name = sc.nextLine();

        System.out.println("Enter Roll Number:");
        int rollNo = sc.nextInt();

        System.out.println("Enter Marks:");
        double marks = sc.nextDouble();

        System.out.println("Enter Grade:");
        char grade = sc.next().charAt(0);

        // Displaying output
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
