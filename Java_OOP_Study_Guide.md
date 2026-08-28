# Java & OOP — Self-Study Guide (Prelim Coverage)
*Covers Chapters 1–3 of the syllabus: Intro to Java & OOP, Java Control Flow, Java Functions & Arrays*

---

## How to use this guide
1. Read each chapter's lesson.
2. Type out and run every code example yourself — don't just read it.
3. Do the Lab Activity at the end of each chapter block before moving on.
4. Once all three chapters are done, attempt the Prelim Lab Exam and Prelim Written Exam at the end **without** looking back at the notes, then check yourself.

---

# CHAPTER 1: Introduction to Java and OOP

### 1.1 What is Java / OOP?
Java is an **Object-Oriented Programming (OOP)** language. OOP organizes code around **objects** — bundles of data (properties) and behavior (methods) — instead of just a list of instructions. The four pillars of OOP you'll build toward across the semester are Encapsulation, Inheritance, Polymorphism, and Abstraction, but for now we focus on the foundation: **classes, objects, methods, and properties**.

### 1.2 Classes, Objects, Methods, and Properties
- A **class** is a blueprint. It defines what an object will look like and what it can do.
- An **object** is an actual instance created from that blueprint.
- **Properties** (a.k.a. fields/attributes) are variables that hold an object's data.
- **Methods** are functions defined inside a class that describe an object's behavior.

```java
public class Dog {
    // properties
    String name;
    int age;

    // method
    void bark() {
        System.out.println(name + " says Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();   // creating an object
        myDog.name = "Rex";
        myDog.age = 3;
        myDog.bark();            // calling a method
    }
}
```
`myDog` is an **object** (an instance of the `Dog` class). `name` and `age` are its **properties**. `bark()` is a **method**.

### 1.3 The Java `main` Method
Every runnable Java program needs exactly one entry point:
```java
public class Main {
    public static void main(String[] args) {
        // program starts here
    }
}
```
- `public` — accessible from anywhere.
- `static` — belongs to the class itself, not an object, so the JVM can call it without creating an instance first.
- `void` — returns nothing.
- `String[] args` — command-line arguments (an array of text).

### 1.4 Primitive Data Types
Java has 8 primitive (built-in, non-object) types:

| Type | Stores | Example |
|---|---|---|
| `byte` | small whole number (-128 to 127) | `byte b = 100;` |
| `short` | whole number | `short s = 5000;` |
| `int` | whole number (most common) | `int x = 25;` |
| `long` | large whole number | `long l = 15000000000L;` |
| `float` | decimal number | `float f = 5.75f;` |
| `double` | decimal number (most common) | `double d = 19.99;` |
| `char` | single character | `char c = 'A';` |
| `boolean` | true/false | `boolean isDone = true;` |

### 1.5 Operators in Java
- **Arithmetic:** `+  -  *  /  %` (`%` is modulus/remainder)
- **Assignment:** `=  +=  -=  *=  /=  %=`
- **Relational (comparison):** `==  !=  >  <  >=  <=` (return a boolean)
- **Logical:** `&&` (AND), `||` (OR), `!` (NOT)
- **Increment/Decrement:** `++`, `--`

```java
int a = 10, b = 3;
System.out.println(a + b);   // 13
System.out.println(a % b);   // 1
System.out.println(a > b);   // true
a++;                          // a is now 11
```

### 1.6 Taking Input
Use the `Scanner` class to read user input from the keyboard.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}
```
Common Scanner methods: `nextInt()`, `nextDouble()`, `nextLine()` (full line of text), `next()` (single word).

> ⚠️ Common gotcha: calling `nextInt()` then `nextLine()` right after will grab a leftover newline as an empty string. Add an extra `sc.nextLine();` to clear the buffer if this happens.

---

# CHAPTER 2: Java Control Flow

### 2.1 Conditional Statements
```java
int score = 78;

if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else if (score >= 70) {
    System.out.println("C");
} else {
    System.out.println("Failed");
}
```
`switch` statement (good for a single variable with many exact values):
```java
int day = 3;
switch (day) {
    case 1: System.out.println("Monday"); break;
    case 2: System.out.println("Tuesday"); break;
    case 3: System.out.println("Wednesday"); break;
    default: System.out.println("Invalid day");
}
```

### 2.2 Compound Conditions & Logical Operators
Combine multiple conditions using `&&`, `||`, `!`:
```java
int age = 20;
boolean hasID = true;

if (age >= 18 && hasID) {
    System.out.println("Entry allowed");
}

if (age < 13 || age > 65) {
    System.out.println("Discount applies");
}

if (!hasID) {
    System.out.println("ID required");
}
```
- `&&` → **both** conditions must be true.
- `||` → **at least one** condition must be true.
- `!` → flips true/false.

### 2.3 Iteration Constructs (Loops)
**`for` loop** — best when you know how many times to repeat:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}
```
**`while` loop** — repeats while a condition is true (check first):
```java
int i = 1;
while (i <= 5) {
    System.out.println("Count: " + i);
    i++;
}
```
**`do-while` loop** — runs the body at least once (check after):
```java
int i = 1;
do {
    System.out.println("Count: " + i);
    i++;
} while (i <= 5);
```

### 2.4 Break and Continue
- `break` — exits the loop immediately.
- `continue` — skips the rest of the current iteration and moves to the next one.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 6) break;         // stop looping entirely at 6
    if (i % 2 == 0) continue;  // skip even numbers
    System.out.println(i);     // prints 1, 3, 5
}
```

---

## LAB ACTIVITY 1 — Chapters 1 & 2 (OOP Basics + Control Flow)

Complete all three tasks in a single Java project. Test each before moving to the next.

**Task 1 — Student Grade Checker**
Create a class `Student` with properties `name` (String) and `grade` (double). Use `Scanner` to ask the user for a student's name and numeric grade, store them in a `Student` object, then print a remark using if/else-if:
- 90–100 → "Excellent"
- 80–89 → "Good"
- 75–79 → "Passed"
- below 75 → "Failed"

**Task 2 — Even/Odd Counter with Loops**
Ask the user how many numbers they want to check (`int n`). Using a `for` loop from 1 to `n`, count and print how many numbers are even and how many are odd.

**Task 3 — Number Guessing Loop**
Set a secret number (e.g. `int secret = 7;`). Using a `while` loop, keep asking the user to guess the number. Print "Too high" / "Too low" as hints, and `break` out of the loop with a "Correct!" message once they guess it.

*Self-check:* Does your code compile with no errors? Did you test both branches of every if/else? Did you test at least 3 different inputs per task?

---

# CHAPTER 3: Java Functions and Arrays

### 3.1 Functions (Methods) in Java
A function/method lets you reuse a block of code. It can take parameters and return a value.
```java
public class Main {

    // function definition
    static int add(int a, int b) {
        return a + b;
    }

    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        int sum = add(5, 3);       // calling a function that returns a value
        System.out.println(sum);   // 8
        greet("Shann");            // calling a void function
    }
}
```
- **Return type** (`int`, `void`, `String`, etc.) declares what the method gives back.
- **Parameters** are the inputs the method needs to do its job.
- Breaking a program into functions avoids repeating code and makes logic easier to test.

### 3.2 Arrays and Accessing Array Elements
An array stores multiple values of the **same type** under one variable name.
```java
int[] scores = {85, 90, 78, 92, 66};

System.out.println(scores[0]);   // 85 (first element — arrays start at index 0)
System.out.println(scores[4]);   // 66 (last element)
System.out.println(scores.length); // 5 (size of the array)

scores[2] = 100;   // updating an element
```
Declaring an empty array with a fixed size:
```java
int[] numbers = new int[5];   // 5 slots, all default to 0
numbers[0] = 10;
```
Looping through an array with a regular `for` loop:
```java
for (int i = 0; i < scores.length; i++) {
    System.out.println("Score " + i + ": " + scores[i]);
}
```

### 3.3 For-Each Array Traversal
The **enhanced for loop** (for-each) is a cleaner way to go through every element when you don't need the index:
```java
int[] scores = {85, 90, 78, 92, 66};

for (int score : scores) {
    System.out.println("Score: " + score);
}
```
Read it as: "for each `score` in `scores`." Use a regular `for` loop instead when you need the index (e.g. to modify elements or track position).

---

## LAB ACTIVITY 2 — Chapter 3 (Functions & Arrays)

**Task 1 — Simple Calculator with Functions**
Write four functions: `add(int a, int b)`, `subtract(int a, int b)`, `multiply(int a, int b)`, `divide(int a, int b)`, each returning the result. In `main`, take two numbers from the user via `Scanner` and print the result of all four operations by calling your functions.

**Task 2 — Array Statistics**
Create an array of at least 6 `int` grades (hardcoded or from user input). Write separate functions:
- `int findMax(int[] arr)` — returns the highest value
- `int findMin(int[] arr)` — returns the lowest value
- `double findAverage(int[] arr)` — returns the average
Call each function from `main` and print the results.

**Task 3 — For-Each Search**
Given an array of names (`String[]`), use a **for-each loop** to print every name that starts with a specific letter chosen by the user (e.g. all names starting with "A").

*Self-check:* Did you use functions instead of repeating logic? Did you use for-each at least once as required? Do your functions have the correct return type?

---

# PRELIM EXAMINATION PREP (Chapters 1–3, cumulative)

## Prelim Written Exam — Practice Set
Answer these without your notes, then check against the lessons above.

1. Define: class, object, method, property. Give one example of each.
2. What is the purpose of the `main` method's signature (`public static void main(String[] args)`)? Explain each keyword.
3. List all 8 Java primitive data types and give one real-world example value for each.
4. What is the difference between `=` and `==`?
5. Write the boolean output of: `(5 > 3) && (2 == 2)` and `(5 > 3) || (1 > 2) && (4 < 1)`.
6. Explain the difference between `for`, `while`, and `do-while` loops. When would you choose each?
7. What does `break` do differently from `continue`? Write a short code snippet showing each.
8. What is the index of the first and last element of an array of size 10?
9. Write a function signature (not the body) for a method that takes an array of doubles and returns their sum.
10. Explain the difference between a regular `for` loop and a for-each loop when traversing an array. When is for-each *not* a good choice?
11. Trace this code and give the final output:
```java
int total = 0;
for (int i = 1; i <= 5; i++) {
    if (i % 2 == 0) continue;
    total += i;
}
System.out.println(total);
```
12. Trace this code and give the final output:
```java
int[] nums = {4, 8, 15, 16, 23, 42};
int max = nums[0];
for (int n : nums) {
    if (n > max) max = n;
}
System.out.println(max);
```

## Prelim Laboratory Exam — Practice Program
Build this as one complete program to simulate the real lab exam:

**"Class Record System"**
1. Create a `Student` class with properties: `name` (String), and an `int[]` array of 5 quiz scores.
2. Write a method `double computeAverage(int[] scores)` that returns the average of the scores.
3. Write a method `String getRemark(double average)` that returns "Passed" if average ≥ 75, otherwise "Failed".
4. In `main`:
   - Use `Scanner` to ask for the student's name and their 5 quiz scores (loop input using a `for` loop).
   - Store the scores in the array.
   - Call `computeAverage()` and `getRemark()`.
   - Use a for-each loop to print all 5 scores individually.
   - Print a final summary: name, average (formatted to 2 decimal places), and remark.
5. Bonus: use `break`/`continue` logic to skip printing any score below 60 as "N/A" in the for-each loop instead of the actual number.

**Grading checklist to self-assess:**
- [ ] Program compiles and runs with no errors
- [ ] Correct use of a class with properties (Ch. 1)
- [ ] Correct input handling with Scanner (Ch. 1)
- [ ] At least one conditional/logical operator used correctly (Ch. 2)
- [ ] At least one loop used correctly (Ch. 2)
- [ ] Array declared and accessed correctly (Ch. 3)
- [ ] At least one custom function with a return value (Ch. 3)
- [ ] For-each loop used to traverse the array (Ch. 3)

---

*Study tip: Since you haven't met your professor yet, treat this guide as a first pass only — once class starts, double-check terminology and expected code style against what your professor actually teaches, since course-specific conventions can vary.*
