public class Factorial {

    public static long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Число не должно быть отрицательным");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 4;
        System.out.println("Факториал числа " + number + " равен " + calculateFactorial(number));
    }
}
