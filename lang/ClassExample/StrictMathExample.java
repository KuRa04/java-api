package lang.ClassExample;

public class StrictMathExample {
  public static void main(String[] args) {
    double x = 9.0;
    double y = 45.0;

    System.out.println("sqrt(x): " + StrictMath.sqrt(x));
    System.out.println("sin(y): " + StrictMath.sin(Math.toRadians(y)));
    System.out.println("cos(y): " + StrictMath.cos(Math.toRadians(y)));
    System.out.println("tan(y): " + StrictMath.tan(Math.toRadians(y)));
    System.out.println("exp(x): " + StrictMath.exp(x));
    System.out.println("log(x): " + StrictMath.log(x));
    System.out.println("log10(x): " + StrictMath.log10(x));
    System.out.println("pow(x, y): " + StrictMath.pow(x, y));
    System.out.println("random(): " + StrictMath.random());
    System.out.println("abs(x): " + StrictMath.abs(x));
    System.out.println("ceil(x): " + StrictMath.ceil(x));
    System.out.println("floor(x): " + StrictMath.floor(x));
    System.out.println("max(x, y): " + StrictMath.max(x, y));
    System.out.println("min(x, y): " + StrictMath.min(x, y));
    System.out.println("atan2(x, y): " + StrictMath.atan2(x, y));
    System.out.println("toDegrees(PI): " + StrictMath.toDegrees(Math.PI));
    System.out.println("toRadians(45): " + StrictMath.toRadians(45));
  }
}
