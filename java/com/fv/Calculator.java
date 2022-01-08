import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        simpleCalculator.start();
    }
}

class SimpleCalculator {
    private Operation plus = (number) -> {
        int secondNumber = this.getNumber();
        int res = number + secondNumber;
        return res;
    }; 

    private Operation subtraction = (number) -> {
        int secondNumber = this.getNumber();
        int res = number - secondNumber;
        return res;
    }; 

    public void start() {
        int firs = this.getNumber();
        this.handleResult(firs);
        this.start();
    }


    private int getNumber() {
        System.out.print("Enter number: ");
        int number = new Scanner(System.in).nextInt();
        return number;
    }

    private void handleResult(int firstNumber) {
        System.out.print("Enter operator: ");
        String operator = new Scanner(System.in).nextLine();

        int result;
        switch(operator){
            case "+":
                result = this.plus.run(firstNumber);
                break;
            case "-":
                result = this.subtraction.run(firstNumber);
                break;
            default:
                String message = String.format("Don't known operator %s", operator);
                System.out.println(message);
                return;
        }
        String messageSumma = String.format("Result is: %s", result);
        System.out.println(messageSumma);
    }
}

interface Operation {
    public int run(int value);
}