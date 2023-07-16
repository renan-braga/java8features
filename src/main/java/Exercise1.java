public class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        MathOperation addition = (int a, int b) -> {
            return a + b;
        };

        MathOperation subtraction = (int a, int b) -> {
            return a - b;
        };

        MathOperation division = (int a, int b) -> {
            return a/b;
        };

        MathOperation multiplication = (int a, int b) -> {
            return a*b;
        };
    }
}
