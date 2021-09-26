package home.android1.mycalculator;

public class Calculator {
    double calculateResult;
    double firstNumber;
    double secondNumber;
    char operation;

    public Calculator(String inputString, double firstNumber, double secondNumber, char operation, double calculateResult) {

        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
        this.calculateResult = calculate(this.firstNumber, this.secondNumber, this.operation);
    }

    double calculate (double firstNumber, double secondNumber, char operation){
        double calculateResult = 0;
        switch (operation){
            case '+':
                calculateResult =  firstNumber + secondNumber;
                break;
            case '-':
                calculateResult = firstNumber - secondNumber;
                break;
            case '/':
                calculateResult = firstNumber / secondNumber;
                break;
            case '*':
                calculateResult = firstNumber * secondNumber;
                break;
        }
        return calculateResult;
    }
}
