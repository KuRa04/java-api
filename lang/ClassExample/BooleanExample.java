package lang.ClassExample;

public class BooleanExample {
  public static void main(String[] args) {
    Boolean bool1 = Boolean.TRUE;
    Boolean bool2 = Boolean.FALSE;

    System.out.println("bool1: " + bool1);
    System.out.println("bool2: " + bool2);

    System.out.println("bool1.equals(bool2): " + bool1.equals(bool2));
    System.out.println("Boolean.compare(bool1, bool2): " + Boolean.compare(bool1, bool2));
    System.out.println("bool1.compareTo(bool2): " + bool1.compareTo(bool2));

    Boolean bool3 = Boolean.parseBoolean("true");
    Boolean bool4 = Boolean.parseBoolean("false");
    System.out.println("bool3: " + bool3);
    System.out.println("bool4: " + bool4);

    Boolean bool5 = Boolean.valueOf("true");
    Boolean bool6 = Boolean.valueOf("false");
    System.out.println("bool5: " + bool5);
    System.out.println("bool6: " + bool6);

    Boolean bool7 = Boolean.valueOf(true);
    Boolean bool8 = Boolean.valueOf(false);
    System.out.println("bool7: " + bool7);
    System.out.println("bool8: " + bool8);

    System.out.println("Boolean.logicalAnd(bool1, bool3): " + Boolean.logicalAnd(bool1, bool3));
    System.out.println("Boolean.logicalOr(bool1, bool4): " + Boolean.logicalOr(bool1, bool4));
    System.out.println("Boolean.logicalXor(bool1, bool4): " + Boolean.logicalXor(bool1, bool4));

    System.out.println("Boolean.toString(bool1): " + Boolean.toString(bool1));
    System.out.println("Boolean.toString(bool2): " + Boolean.toString(bool2));

    boolean primitiveBool1 = bool1.booleanValue();
    boolean primitiveBool2 = bool2.booleanValue();
    System.out.println("primitiveBool1: " + primitiveBool1);
    System.out.println("primitiveBool2: " + primitiveBool2);

    System.out.println("bool1.hashCode(): " + bool1.hashCode());
    System.out.println("bool2.hashCode(): " + bool2.hashCode());

    System.out.println("Boolean.TYPE: " + Boolean.TYPE);
}
}
