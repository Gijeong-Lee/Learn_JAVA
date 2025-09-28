package stream;

import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public enum Calculator {
    ADD("+", (a, b) -> a + b),
    SUBTRACT("-", (a, b) -> a - b),
    MULTIPLY("*", (a, b) -> a * b),
    DIVIDE("/", (a, b) -> a / b);

    private final String symbol;
    private final DoubleBinaryOperator operator;

    Calculator(String symbol, DoubleBinaryOperator operator) {
        this.symbol = symbol;
        this.operator = operator;
    }

    // '11+11'을 계산하는 클래스입니다.
    // stream 을 이요해서 계산합니다.
    public static double calculate(String query) {
        String operater = query.replaceAll("[0-9.]","");
        String[] numbers = query.split("[+\\-*/]");

        double number1 = Double.parseDouble(numbers[0]);
        double number2 = Double.parseDouble(numbers[1]);

        Calculator cal = Arrays.stream(values())
                .filter(calculator -> calculator.getSymbol().equals(operater))
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("Unknown operator : " + operater));

        return cal.getOperator().applyAsDouble(number1, number2);
    }

    public String getSymbol() {
        return symbol;
    }
    public DoubleBinaryOperator getOperator() {
        return operator;
    }
}
