package home.android1.mycalculator;

public class Calculator {
    double intermediateResult;
    double firstNumber;
    double secondNumber;
    String inputString;
    char operation;

    public Calculator(String inputString, double firstNumber, double secondNumber, char operation, double intermediateResult) {
        this.inputString = inputString;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operation = operation;
        this.intermediateResult = intermediateResult;
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
