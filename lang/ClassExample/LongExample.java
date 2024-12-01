package lang.ClassExample;

public class LongExample {

  public static void main(String[] args) {
    Long long1 = Long.valueOf(100L);
    Long long2 = Long.valueOf(200L);

    System.out.println("long1: " + long1);
    System.out.println("long2: " + long2);

    System.out.println("long1.equals(long2): " + long1.equals(long2));
    System.out.println("Long.compare(long1, long2): " + Long.compare(long1, long2));
    System.out.println("long1.compareTo(long2): " + long1.compareTo(long2));

    Long long3 = Long.parseLong("300");
    Long long4 = Long.parseLong("400");
    System.out.println("long3: " + long3);
    System.out.println("long4: " + long4);

    Long long5 = Long.valueOf("500");
    Long long6 = Long.valueOf("600");
    System.out.println("long5: " + long5);
    System.out.println("long6: " + long6);

    System.out.println("Long.bitCount(long1): " + Long.bitCount(long1));
    System.out.println("Long.highestOneBit(long1): " + Long.highestOneBit(long1));
    System.out.println("Long.lowestOneBit(long1): " + Long.lowestOneBit(long1));
    System.out.println("Long.numberOfLeadingZeros(long1): " + Long.numberOfLeadingZeros(long1));
    System.out.println("Long.numberOfTrailingZeros(long1): " + Long.numberOfTrailingZeros(long1));
    System.out.println("Long.reverse(long1): " + Long.reverse(long1));
    System.out.println("Long.reverseBytes(long1): " + Long.reverseBytes(long1));
    System.out.println("Long.rotateLeft(long1, 2): " + Long.rotateLeft(long1, 2));
    System.out.println("Long.rotateRight(long1, 2): " + Long.rotateRight(long1, 2));
    System.out.println("Long.signum(long1): " + Long.signum(long1));
    System.out.println("Long.sum(long1, long2): " + Long.sum(long1, long2));

    System.out.println("Long.toString(long1): " + Long.toString(long1));
    System.out.println("Long.toHexString(long1): " + Long.toHexString(long1));
    System.out.println("Long.toOctalString(long1): " + Long.toOctalString(long1));
    System.out.println("Long.toBinaryString(long1): " + Long.toBinaryString(long1));

    long primitiveLong1 = long1.longValue();
    long primitiveLong2 = long2.longValue();
    System.out.println("primitiveLong1: " + primitiveLong1);
    System.out.println("primitiveLong2: " + primitiveLong2);

    System.out.println("long1.hashCode(): " + long1.hashCode());
    System.out.println("long2.hashCode(): " + long2.hashCode());

    System.out.println("Long.TYPE: " + Long.TYPE);

    System.out.println("Long.MAX_VALUE: " + Long.MAX_VALUE);
    System.out.println("Long.MIN_VALUE: " + Long.MIN_VALUE);

    System.out.println("Long.BYTES: " + Long.BYTES);
    System.out.println("Long.SIZE: " + Long.SIZE);

    Long long7 = Long.decode("0x1E");
    System.out.println("long7: " + long7);

    Long long8 = Long.parseLong("7F", 16);
    System.out.println("long8: " + long8);

    System.out.println("Long.toUnsignedString(long1): " + Long.toUnsignedString(long1));
    System.out.println("Long.toUnsignedString(long1, 16): " + Long.toUnsignedString(long1, 16));
    System.out.println("Long.divideUnsigned(long1, long2): " + Long.divideUnsigned(long1, long2));
    System.out.println("Long.remainderUnsigned(long1, long2): " + Long.remainderUnsigned(long1, long2));
  }
}