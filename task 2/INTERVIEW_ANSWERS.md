# Interview Questions - Task 2

## 1. Difference between primitive and non-primitive types?

**Primitive Types:**
- 8 basic types: byte, short, int, long, float, double, char, boolean
- Stored directly in stack memory
- Have fixed size (e.g., int = 4 bytes)
- Start with lowercase letters
- Default values exist (int = 0, boolean = false)

**Non-Primitive Types:**
- Classes, interfaces, arrays, String
- Stored in heap memory, reference in stack
- Size not fixed, depends on object
- Start with uppercase letters (except String)
- Default value is `null`

Example:
```java
int num = 10;  // Primitive
String text = "Hello";  // Non-primitive

=== JAVA INTERNSHIP TASK 2 ===

1. PRIMITIVE DATA TYPES:
-----------------------
byte: 127 (1 byte)
short: 32000 (2 bytes)
int: 2147483647 (4 bytes)
...

Enter your name: John
Enter your age (integer): 22
...

8. INTERACTIVE CALCULATOR:
--------------------------
--- Calculator Menu ---
1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
Choose operation (1-5): 1
Enter first number: 15
Enter second number: 7

Result: 15.00 + 7.00 = 22.00