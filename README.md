Exceptional Handling in Java 🚦

This repository contains 8 practice problems that demonstrate different ways of handling exceptions in Java.
Each problem includes the problem statement, approach, and example code.

📂 Problems Covered
1. Division with Exception Handling

Problem: Take an integer input from the user and divide 100 by the input.
Exception: Handle ArithmeticException when input = 0
Concepts: Try-catch, safe division.

2. Multiple Catch Blocks

Problem: Take two integers as input.
Exceptions:
ArithmeticException if the second number = 0.
InputMismatchException if non-integer values are entered.
Concepts: Multiple catch blocks for different exception types.

3. Custom Checked Exception – InvalidAgeException

Problem: Validate age input from the user.
Exception: Throw InvalidAgeException if age < 18.
Concepts: Custom checked exception, throw & throws.

4. Custom Unchecked Exception – NegativeNumberException

Problem: Take an integer input from the user.
Exception: Throw NegativeNumberException if input < 0.
Concepts: Custom unchecked exceptions, runtime validation.

5. Exception Hierarchy

Problem: Demonstrate how different exceptions are caught.
Exceptions:
ArithmeticException
NullPointerException
Generic Exception
Concepts: Exception hierarchy, order of catch blocks.

6. Finally Block

Problem: Divide 100 by user input.
Exception: Handle ArithmeticException.
Concepts: Use finally block to always print “Operation Completed”.

7. Throwing Exceptions – Banking Example

Problem: Implement a banking system with withdraw(amount).
Exception: Throw InsufficientFundsException if amount > balance.
Concepts: Custom checked exception, business logic validation.

8. Exception Chaining

Problem: Demonstrate chaining exceptions.
Exception: Throw a generic Exception caused by an IOException.
Concepts: Exception chaining (initCause), debugging
