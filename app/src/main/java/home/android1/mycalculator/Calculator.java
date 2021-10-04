package home.android1.mycalculator;

public class Calculator {
    double intermediateResult;
    double firstNumber;
    double secondNumber;
    String currentResultString;
    char operation;
    int operationCounter;
    int dotCounter;
    String lastPressedButtonType;
    String lastPressedButton;
    boolean isFirstNumberEmpty;
    boolean isSecondNumberEmpty;

    public Calculator(double intermediateResult, double firstNumber, double secondNumber, String currentResultString, char operation, int operationCounter, int dotCounter, String lastPressedButtonType, String lastPressedButton, boolean isFirstNumberEmpty, boolean isSecondNumberEmpty) {
        this.intermediateResult = intermediateResult;
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.currentResultString = currentResultString;
        this.operation = operation;
        this.operationCounter = operationCounter;
        this.dotCounter = dotCounter;
        this.lastPressedButtonType = lastPressedButtonType;
        this.lastPressedButtonType = lastPressedButton;
        this.isFirstNumberEmpty = isFirstNumberEmpty;
        this.isSecondNumberEmpty = isSecondNumberEmpty;
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
