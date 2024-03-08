package HomeTask7;

import java.util.Scanner;

public class UserInterface {
    private Calculator calculator;

    public UserInterface() {
        this.calculator = new Calculator();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите первый операнд: ");
            double operand1 = scanner.nextDouble();
            System.out.print("Введите операцию (+, *, /): ");
            String operation = scanner.next();
            System.out.print("Введите второй операнд: ");
            double operand2 = scanner.nextDouble();

            double result;
            try {
                switch (operation) {
                    case "+":
                        result = calculator.add(operand1, operand2);
                        break;
                    case "*":
                        result = calculator.multiply(operand1, operand2);
                        break;
                    case "/":
                        result = calculator.divide(operand1, operand2);
                        break;
                    default:
                        System.out.println("Неверная операция. Попробуйте еще раз.");
                        continue;
                }

                System.out.println("Результат: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Произошла ошибка: " + e.getMessage());
            }
        }
    }
}

