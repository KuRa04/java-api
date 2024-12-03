package lang.ClassExample;

public class MathExample {

  public static void main(String[] args) {
    System.out.println("Math.abs(-10): " + Math.abs(-10));
    System.out.println("Math.abs(-10.5): " + Math.abs(-10.5));
    System.out.println("Math.max(10, 20): " + Math.max(10, 20));
    System.out.println("Math.min(10, 20): " + Math.min(10, 20));
    System.out.println("Math.addExact(10, 20): " + Math.addExact(10, 20));
    System.out.println("Math.subtractExact(20, 10): " + Math.subtractExact(20, 10));
    System.out.println("Math.multiplyExact(10, 20): " + Math.multiplyExact(10, 20));
    System.out.println("Math.incrementExact(10): " + Math.incrementExact(10));
    System.out.println("Math.decrementExact(10): " + Math.decrementExact(10));
    System.out.println("Math.negateExact(10): " + Math.negateExact(10));
    System.out.println("Math.floorDiv(20, 3): " + Math.floorDiv(20, 3));
    System.out.println("Math.floorMod(20, 3): " + Math.floorMod(20, 3));

    System.out.println("Math.exp(1): " + Math.exp(1));
    System.out.println("Math.expm1(1): " + Math.expm1(1));
    System.out.println("Math.log(10): " + Math.log(10));
    System.out.println("Math.log10(10): " + Math.log10(10));
    System.out.println("Math.log1p(10): " + Math.log1p(10));
    System.out.println("Math.pow(2, 3): " + Math.pow(2, 3));
    System.out.println("Math.sqrt(16): " + Math.sqrt(16));
    System.out.println("Math.cbrt(27): " + Math.cbrt(27));
    System.out.println("Math.hypot(3, 4): " + Math.hypot(3, 4));

    System.out.println("Math.sin(Math.PI / 2): " + Math.sin(Math.PI / 2));
    System.out.println("Math.cos(Math.PI / 2): " + Math.cos(Math.PI / 2));
    System.out.println("Math.tan(Math.PI / 4): " + Math.tan(Math.PI / 4));
    System.out.println("Math.asin(1): " + Math.asin(1));
    System.out.println("Math.acos(1): " + Math.acos(1));
    System.out.println("Math.atan(1): " + Math.atan(1));
    System.out.println("Math.atan2(1, 1): " + Math.atan2(1, 1));
    System.out.println("Math.sinh(1): " + Math.sinh(1));
    System.out.println("Math.cosh(1): " + Math.cosh(1));
    System.out.println("Math.tanh(1): " + Math.tanh(1));

    System.out.println("Math.toDegrees(Math.PI): " + Math.toDegrees(Math.PI));
    System.out.println("Math.toRadians(180): " + Math.toRadians(180));

    System.out.println("Math.random(): " + Math.random());

    System.out.println("Math.ceil(10.5): " + Math.ceil(10.5));
    System.out.println("Math.floor(10.5): " + Math.floor(10.5));
    System.out.println("Math.rint(10.5): " + Math.rint(10.5));
    System.out.println("Math.round(10.5): " + Math.round(10.5));
    System.out.println("Math.round(10.4f): " + Math.round(10.4f));

    System.out.println("Math.copySign(10, -1): " + Math.copySign(10, -1));
    System.out.println("Math.signum(-10): " + Math.signum(-10));

    System.out
        .println("Math.multiplyHigh(10000000000L, 10000000000L): " + Math.multiplyHigh(10000000000L, 10000000000L));
    System.out
        .println("Math.multiplyFull(1000000000, 1000000000): " + Math.multiplyFull(1000000000, 1000000000));

    System.out.println("Math.PI: " + Math.PI);
    System.out.println("Math.E: " + Math.E);
  }
}