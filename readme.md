# Java 8 Features

This repository focuses on showcasing several useful features introduced in Java 8. Each feature is covered in a distinct package and named accordingly:

1. Lambda Expressions
2. Streams
3. Default Methods
4. Optional
5. Functional Interfaces
6. Parallel Streams
7. Date and Time API

## 1. Lambda Expressions
Under the `LambdaExpressions` package, you'll find the `MathOperation` interface. Implementations of this interface will demonstrate how to use lambda expressions to carry out different mathematical operations like addition, subtraction, multiplication, and division.

## 2. Streams
In the `Streams` package, there's an example of how to use Java 8's Stream API. Given a list of strings, the task is to filter out all strings that start with a lowercase letter and collect the remaining strings into a list.

## 3. Default Methods
Check out the `DefaultMethods` package for an introduction to default methods in interfaces. There, we have the `Person` interface with a default method `greet()` which prints a greeting message that includes the person's name.

## 4. Optional
Explore the `Optional` package to see how to use the `Optional` class for better null handling. The `findString()` method returns an `Optional` that may or may not contain a string, depending on whether a match is found in a given list of strings.

## 5. Functional Interfaces
In the `FunctionalInterfaces` package, there are examples that use the `java.util.function` package. A `Predicate` filters all numbers greater than 5 from a list of integers. A `Function` maps a list of strings into their lengths. A `Consumer` iterates over a list of numbers and prints them.

## 6. Parallel Streams
The `ParallelStreams` package shows how to use parallel streams. Given a list of integers, the goal is to use a parallel stream to calculate the sum of the squares of each number.

## 7. Date and Time API
Finally, in the `DateTimeAPI` package, we use the `java.time` package to calculate the number of days between two dates and to add an arbitrary number of days to a given date.

Feel free to dive into each package and explore these features further. Happy coding!

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)
