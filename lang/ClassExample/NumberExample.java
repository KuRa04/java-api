package lang.ClassExample;

public class NumberExample {

  public static void main(String[] args) {
    Integer intValue = Integer.valueOf(42);
    Double doubleValue = Double.valueOf(42.42);

    System.out.println("intValue as byte: " + intValue.byteValue());
    System.out.println("intValue as short: " + intValue.shortValue());
    System.out.println("intValue as int: " + intValue.intValue());
    System.out.println("intValue as long: " + intValue.longValue());
    System.out.println("intValue as float: " + intValue.floatValue());
    System.out.println("intValue as double: " + intValue.doubleValue());

    System.out.println("doubleValue as byte: " + doubleValue.byteValue());
    System.out.println("doubleValue as short: " + doubleValue.shortValue());
    System.out.println("doubleValue as int: " + doubleValue.intValue());
    System.out.println("doubleValue as long: " + doubleValue.longValue());
    System.out.println("doubleValue as float: " + doubleValue.floatValue());
    System.out.println("doubleValue as double: " + doubleValue.doubleValue());
  }
}