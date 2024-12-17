package lang.ClassExample;

public class ShortExample {
  public static void main(String[] args) {
    short value = 10;
    Short shortObj = Short.valueOf(value);

    System.out.println("Max Value: " + Short.MAX_VALUE);
    System.out.println("Min Value: " + Short.MIN_VALUE);

    String numberStr = "123";
    Short parsedShort = Short.parseShort(numberStr);
    System.out.println("Parsed Short: " + parsedShort);
    System.out.println("shortVaule: " + shortObj.shortValue());
  }
}
