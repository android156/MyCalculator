package home.android1.mycalculator;

import java.io.Serializable;

public class Calculator implements Serializable {
    double intermediateResult;
    double firstNumber;
    double secondNumber;
    String currentResultString;
    char operation;
    int operationCounter;
    boolean isDotInCurrentNumber;
    String lastPressedButtonType;
    String lastPressedButton;
    double memoryNumber;

    public Calculator(double intermediateResult, double firstNumber, double secondNumber, String currentResultString, char operation, int operationCounter, boolean isDotInCurrentNumber, String lastPressedButtonType, String lastPressedButton, double memoryNumber) {
        this.intermediateResult = intermediateResult;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.currentResultString = currentResultString;
        this.operation = operation;
        this.operationCounter = operationCounter;
        this.isDotInCurrentNumber = isDotInCurrentNumber;
        this.lastPressedButtonType = lastPressedButtonType;
        this.lastPressedButtonType = lastPressedButton;
        this.memoryNumber = memoryNumber;
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
