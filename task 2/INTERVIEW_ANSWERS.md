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

2. What is type casting?
Type casting is converting one data type to another.

Two Types:

Implicit Casting (Widening):

Automatic conversion

Smaller type → Larger type

No data loss
int a = 100;
double b = a;  // Automatic

Explicit Casting (Narrowing):

Manual conversion

Larger type → Smaller type

Possible data loss
double x = 9.78;
int y = (int) x;  // y = 9 (0.78 lost)


3. Why is Scanner preferred over BufferedReader?
Scanner Advantages:

Easier to use for beginners

Built-in methods like nextInt(), nextDouble()

Can parse different data types directly

More readable code

BufferedReader Advantages:

Faster for large input

More efficient memory usage

For beginners/tasks: Scanner is preferred because:

Less code required

Automatic parsing

Better error messages

Suitable for console-based applications


4. What is default value of variables?
Default values depend on variable type:

Instance & Static Variables:

byte, short, int, long → 0

float → 0.0f

double → 0.0d

char → '\u0000' (null character)

boolean → false

Object types → null

Local Variables:

No default values

Must be initialized before use

Compiler error if used uninitialized

Example:
class Test {
    int instanceVar;  // Default = 0
    static String name;  // Default = null
    
    void method() {
        int localVar;  // No default, must initialize
        // System.out.println(localVar); // ERROR
    }
}

5. Explain scope of variables.
Scope = Where a variable can be accessed

Local Variables:

Declared inside method/block

Accessible only within that block

Destroyed when block ends

Instance Variables:

Declared in class (outside methods)

Accessible with object reference

Each object gets its own copy

Lives as long as object exists

Static Variables:

Declared with static keyword

Shared by all objects

Accessible with class name

Lives for entire program execution

Example:
class Example {
    static int classVar = 10;  // Static - shared
    int objectVar = 20;        // Instance - per object
    
    void demo() {
        int methodVar = 30;    // Local - only here
        System.out.println(methodVar);
    }
}
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