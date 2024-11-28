package lang.ClassExample;

public class FloatExample {

  public static void main(String[] args) {
    Float float1 = Float.valueOf(10.5f);
    Float float2 = Float.valueOf(20.5f);

    System.out.println("float1: " + float1);
    System.out.println("float2: " + float2);

    System.out.println("float1.equals(float2): " + float1.equals(float2));
    System.out.println("Float.compare(float1, float2): " + Float.compare(float1, float2));
    System.out.println("float1.compareTo(float2): " + float1.compareTo(float2));

    Float float3 = Float.parseFloat("30.5");
    Float float4 = Float.parseFloat("40.5");
    System.out.println("float3: " + float3);
    System.out.println("float4: " + float4);

    Float float5 = Float.valueOf("50.5");
    Float float6 = Float.valueOf("60.5");
    System.out.println("float5: " + float5);
    System.out.println("float6: " + float6);

    int bits = Float.floatToIntBits(float1);
    System.out.println("Float.floatToIntBits(float1): " + bits);
    System.out.println("Float.intBitsToFloat(bits): " + Float.intBitsToFloat(bits));

    System.out.println("Float.toString(float1): " + Float.toString(float1));
    System.out.println("Float.toHexString(float1): " + Float.toHexString(float1));

    float primitiveFloat1 = float1.floatValue();
    float primitiveFloat2 = float2.floatValue();
    System.out.println("primitiveFloat1: " + primitiveFloat1);
    System.out.println("primitiveFloat2: " + primitiveFloat2);

    System.out.println("float1.hashCode(): " + float1.hashCode());
    System.out.println("float2.hashCode(): " + float2.hashCode());

    System.out.println("Float.TYPE: " + Float.TYPE);

    System.out.println("Float.MAX_VALUE: " + Float.MAX_VALUE);
    System.out.println("Float.MIN_VALUE: " + Float.MIN_VALUE);

    System.out.println("Float.NaN: " + Float.NaN);
    System.out.println("Float.POSITIVE_INFINITY: " + Float.POSITIVE_INFINITY);
    System.out.println("Float.NEGATIVE_INFINITY: " + Float.NEGATIVE_INFINITY);

    System.out.println("Float.BYTES: " + Float.BYTES);
    System.out.println("Float.SIZE: " + Float.SIZE);

    // Floatの特殊値判定
    System.out.println("Float.isNaN(float1): " + Float.isNaN(float1));
    System.out.println("Float.isInfinite(float1): " + Float.isInfinite(float1));
    System.out.println("Float.isFinite(float1): " + Float.isFinite(float1));
  }
}