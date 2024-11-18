package lang.ClassExample;

public class ByteExample {

  public static void main(String[] args) {
    Byte byte1 = Byte.valueOf((byte) 10);
    Byte byte2 = Byte.valueOf((byte) 20);

    System.out.println("byte1: " + byte1);
    System.out.println("byte2: " + byte2);

    System.out.println("byte1.equals(byte2): " + byte1.equals(byte2));
    System.out.println("Byte.compare(byte1, byte2): " + Byte.compare(byte1, byte2));
    System.out.println("byte1.compareTo(byte2): " + byte1.compareTo(byte2));

    Byte byte3 = Byte.parseByte("30");
    Byte byte4 = Byte.parseByte("40");
    System.out.println("byte3: " + byte3);
    System.out.println("byte4: " + byte4);

    Byte byte5 = Byte.valueOf("50");
    Byte byte6 = Byte.valueOf("60");
    System.out.println("byte5: " + byte5);
    System.out.println("byte6: " + byte6);

    System.out.println("Byte.toUnsignedInt(byte1): " + Byte.toUnsignedInt(byte1));
    System.out.println("Byte.toUnsignedLong(byte1): " + Byte.toUnsignedLong(byte1));

    System.out.println("Byte.toString(byte1): " + Byte.toString(byte1));
    System.out.println("Byte.toString(byte2): " + Byte.toString(byte2));

    byte primitiveByte1 = byte1.byteValue();
    byte primitiveByte2 = byte2.byteValue();
    System.out.println("primitiveByte1: " + primitiveByte1);
    System.out.println("primitiveByte2: " + primitiveByte2);

    System.out.println("byte1.hashCode(): " + byte1.hashCode());
    System.out.println("byte2.hashCode(): " + byte2.hashCode());

    System.out.println("Byte.TYPE: " + Byte.TYPE);

    System.out.println("Byte.MAX_VALUE: " + Byte.MAX_VALUE);
    System.out.println("Byte.MIN_VALUE: " + Byte.MIN_VALUE);

    System.out.println("Byte.BYTES: " + Byte.BYTES);
    System.out.println("Byte.SIZE: " + Byte.SIZE);

    Byte byte7 = Byte.decode("0x1E");
    System.out.println("byte7: " + byte7);

    Byte byte8 = Byte.parseByte("7F", 16);
    System.out.println("byte8: " + byte8);
  }
}
