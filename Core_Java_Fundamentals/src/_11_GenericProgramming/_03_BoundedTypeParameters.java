// _03_BoundedTypeParameters.java
package _11_GenericProgramming;

class MathOperations<T extends Number> {
    private T num;

    public MathOperations(T num) {
        this.num = num;
    }

    public double square() {
        return num.doubleValue() * num.doubleValue();
    }
}

public class _03_BoundedTypeParameters {
    public static void main(String[] args) {
        MathOperations<Integer> intMath = new MathOperations<>(5);
        System.out.println("Square of 5: " + intMath.square());

        MathOperations<Double> doubleMath = new MathOperations<>(4.5);
        System.out.println("Square of 4.5: " + doubleMath.square());
    }
}