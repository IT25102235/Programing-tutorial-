public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }


    public int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();


        int mult1 = calc.multiply(3, 4);
        int mult2 = calc.multiply(5, 7);
        int sum1 = calc.add(mult1, mult2);
        int result1 = calc.square(sum1);

        System.out.println("Result of (3 * 4 + 5 * 7)^2 is: " + result1);
        int sumA = calc.add(4, 7);
        int sumB = calc.add(8, 3);
        int sqA = calc.square(sumA);
        int sqB = calc.square(sumB);
        int result2 = calc.add(sqA, sqB);

        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 is: " + result2);
    }
}