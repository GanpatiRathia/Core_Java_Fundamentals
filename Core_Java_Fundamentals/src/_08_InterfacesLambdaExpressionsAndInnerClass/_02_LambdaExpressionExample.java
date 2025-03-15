package _08_InterfacesLambdaExpressionsAndInnerClass;

interface MathOperation {
    int operate(int a, int b);
}

public class _02_LambdaExpressionExample {
    public static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        System.out.println("Sum: " + addition.operate(5, 3));
    }
}
