package lang.ClassExample;

public class IntegerExample {

  public static void main(String[] args) {
    Integer int1 = Integer.valueOf(10);
    Integer int2 = Integer.valueOf(20);

    System.out.println("int1: " + int1);
    System.out.println("int2: " + int2);

    System.out.println("int1.equals(int2): " + int1.equals(int2));
    System.out.println("Integer.compare(int1, int2): " + Integer.compare(int1, int2));
    System.out.println("int1.compareTo(int2): " + int1.compareTo(int2));

    Integer int3 = Integer.parseInt("30");
    Integer int4 = Integer.parseInt("40");
    System.out.println("int3: " + int3);
    System.out.println("int4: " + int4);

    Integer int5 = Integer.valueOf("50");
    Integer int6 = Integer.valueOf("60");
    System.out.println("int5: " + int5);
    System.out.println("int6: " + int6);

    System.out.println("Integer.bitCount(int1): " + Integer.bitCount(int1));
    System.out.println("Integer.highestOneBit(int1): " + Integer.highestOneBit(int1));
    System.out.println("Integer.lowestOneBit(int1): " + Integer.lowestOneBit(int1));
    System.out.println("Integer.numberOfLeadingZeros(int1): " + Integer.numberOfLeadingZeros(int1));
    System.out.println("Integer.numberOfTrailingZeros(int1): " + Integer.numberOfTrailingZeros(int1));
    System.out.println("Integer.reverse(int1): " + Integer.reverse(int1));
    System.out.println("Integer.reverseBytes(int1): " + Integer.reverseBytes(int1));
    System.out.println("Integer.rotateLeft(int1, 2): " + Integer.rotateLeft(int1, 2));
    System.out.println("Integer.rotateRight(int1, 2): " + Integer.rotateRight(int1, 2));
    System.out.println("Integer.signum(int1): " + Integer.signum(int1));
    System.out.println("Integer.sum(int1, int2): " + Integer.sum(int1, int2));

    System.out.println("Integer.toString(int1): " + Integer.toString(int1));
    System.out.println("Integer.toHexString(int1): " + Integer.toHexString(int1));
    System.out.println("Integer.toOctalString(int1): " + Integer.toOctalString(int1));
    System.out.println("Integer.toBinaryString(int1): " + Integer.toBinaryString(int1));

    int primitiveInt1 = int1.intValue();
    int primitiveInt2 = int2.intValue();
    System.out.println("primitiveInt1: " + primitiveInt1);
    System.out.println("primitiveInt2: " + primitiveInt2);

    System.out.println("int1.hashCode(): " + int1.hashCode());
    System.out.println("int2.hashCode(): " + int2.hashCode());

    System.out.println("Integer.TYPE: " + Integer.TYPE);

    System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
    System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);

    System.out.println("Integer.BYTES: " + Integer.BYTES);
    System.out.println("Integer.SIZE: " + Integer.SIZE);

    Integer int7 = Integer.decode("0x1E");
    System.out.println("int7: " + int7);

    Integer int8 = Integer.parseInt("7F", 16);
    System.out.println("int8: " + int8);

    System.out.println("Integer.toUnsignedString(int1): " + Integer.toUnsignedString(int1));
    System.out.println("Integer.toUnsignedLong(int1): " + Integer.toUnsignedLong(int1));
    System.out.println("Integer.divideUnsigned(int1, int2): " + Integer.divideUnsigned(int1, int2));
    System.out.println("Integer.remainderUnsigned(int1, int2): " + Integer.remainderUnsigned(int1, int2));
  }
}