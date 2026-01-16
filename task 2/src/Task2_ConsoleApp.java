import java.util.Scanner;

public class Task2_ConsoleApp {

    // Instance variable - each object gets its own copy
    int instanceNumber = 50;

    // Static variable - shared across all objects
    static String appName = "JavaInternApp";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== JAVA INTERNSHIP TASK 2 ===\n");

        // 1. PRIMITIVE DATA TYPES WITH MEMORY INFO
        System.out.println("1. PRIMITIVE DATA TYPES:");
        System.out.println("-----------------------");

        byte byteVal = 127;  // 1 byte (-128 to 127)
        short shortVal = 32000;  // 2 bytes (-32,768 to 32,767)
        int intVal = 2147483647;  // 4 bytes (-2^31 to 2^31-1)
        long longVal = 9223372036854775807L;  // 8 bytes, L suffix for long
        float floatVal = 3.14159f;  // 4 bytes, f suffix for float
        double doubleVal = 3.141592653589793;  // 8 bytes
        char charVal = 'J';  // 2 bytes (Unicode)
        boolean boolVal = true;  // 1 bit (but JVM uses 1 byte)

        System.out.println("byte: " + byteVal + " (1 byte)");
        System.out.println("short: " + shortVal + " (2 bytes)");
        System.out.println("int: " + intVal + " (4 bytes)");
        System.out.println("long: " + longVal + " (8 bytes)");
        System.out.println("float: " + floatVal + " (4 bytes)");
        System.out.println("double: " + doubleVal + " (8 bytes)");
        System.out.println("char: " + charVal + " (2 bytes)");
        System.out.println("boolean: " + boolVal + " (1 bit)\n");

        // 2. SCANNER INPUT FOR MULTIPLE DATA TYPES
        System.out.println("2. USER INPUT EXAMPLES:");
        System.out.println("-----------------------");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age (integer): ");
        int age = input.nextInt();

        System.out.print("Enter your height in meters (decimal): ");
        double height = input.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = input.nextBoolean();

        input.nextLine(); // Clear buffer

        // 3. ARITHMETIC OPERATIONS WITH USER INPUT
        System.out.println("\n3. ARITHMETIC OPERATIONS:");
        System.out.println("-------------------------");

        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.println("\nResults:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));

        // Division with zero check
        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println(num1 + " / " + num2 + " = Cannot divide by zero!");
        }

        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));

        // 4. TYPE CASTING DEMONSTRATION
        System.out.println("\n4. TYPE CASTING:");
        System.out.println("----------------");

        // Compatible casting (widening)
        int smallNum = 100;
        double largeNum = smallNum; // Automatic casting int → double
        System.out.println("int to double (auto): " + smallNum + " → " + largeNum);

        // Incompatible casting (narrowing)
        double price = 99.99;
        int intPrice = (int) price; // Manual casting double → int
        System.out.println("double to int (manual): " + price + " → " + intPrice);

        // Char to int and vice versa
        char grade = 'A';
        int asciiValue = grade;
        System.out.println("char to int: '" + grade + "' → " + asciiValue);

        // 5. INVALID INPUT HANDLING
        System.out.println("\n5. INPUT VALIDATION:");
        System.out.println("--------------------");

        System.out.print("Enter a number between 1-100: ");

        if (input.hasNextInt()) {
            int userNum = input.nextInt();

            if (userNum >= 1 && userNum <= 100) {
                System.out.println("Valid input: " + userNum);
            } else {
                System.out.println("Number out of range!");
            }
        } else {
            System.out.println("Invalid input! Please enter an integer.");
            input.next(); // Clear invalid input
        }

        // 6. FORMATTED OUTPUT
        System.out.println("\n6. FORMATTED OUTPUT:");
        System.out.println("--------------------");

        double marks = 85.56789;
        System.out.printf("Name: %s, Age: %d, Height: %.2f meters\n", name, age, height);
        System.out.printf("Marks: %.2f (formatted to 2 decimals)\n", marks);
        System.out.printf("Hex of 255: %x, Octal of 255: %o\n", 255, 255);

        // 7. VARIABLE SCOPE DEMONSTRATION
        System.out.println("\n7. VARIABLE SCOPE:");
        System.out.println("-------------------");

        Task2_ConsoleApp obj = new Task2_ConsoleApp();

        // Local variable - only in main method
        int localVar = 10;
        System.out.println("Local variable: " + localVar);
        System.out.println("Instance variable: " + obj.instanceNumber);
        System.out.println("Static variable: " + appName);

        // Modify and show
        obj.instanceNumber = 75;
        appName = "ModifiedApp";
        System.out.println("\nAfter modification:");
        System.out.println("Instance variable: " + obj.instanceNumber);
        System.out.println("Static variable: " + appName);

        // 8. INTERACTIVE CALCULATOR
        System.out.println("\n8. INTERACTIVE CALCULATOR:");
        System.out.println("--------------------------");

        boolean continueCalc = true;

        while (continueCalc) {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose operation (1-5): ");

            int choice = input.nextInt();

            if (choice == 5) {
                continueCalc = false;
                System.out.println("Calculator closed.");
                continue;
            }

            System.out.print("Enter first number: ");
            double a = input.nextDouble();
            System.out.print("Enter second number: ");
            double b = input.nextDouble();

            double result = 0;
            String operation = "";

            switch (choice) {
                case 1:
                    result = a + b;
                    operation = "+";
                    break;
                case 2:
                    result = a - b;
                    operation = "-";
                    break;
                case 3:
                    result = a * b;
                    operation = "×";
                    break;
                case 4:
                    if (b != 0) {
                        result = a / b;
                        operation = "÷";
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            System.out.printf("\nResult: %.2f %s %.2f = %.2f\n", a, operation, b, result);
        }

        System.out.println("\n=== PROGRAM ENDED ===");
        System.out.println("Thank you for using the application!");
        input.close();
    }
}