import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        maxLongSqr();
    }

    public static void maxLongSqr() {
        BigInteger maxLongValue = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger square = maxLongValue.multiply(maxLongValue);
        System.out.println("Квадрат максимального значения для long: " + square);
    }
}
