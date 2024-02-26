import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        maxLongSqr();
    }
    public static void maxLongSqr() {
      System.out.println( BigInteger.valueOf(Long.MAX_VALUE).multiply(BigInteger.valueOf(Long.MAX_VALUE)));
    }
}
