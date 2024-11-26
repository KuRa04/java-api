package lang.ClassExample;

public class DoubleExample {

    public static void main(String[] args) {
        Double double1 = Double.valueOf(10.5);
        Double double2 = Double.valueOf(20.5);

        System.out.println("double1: " + double1);
        System.out.println("double2: " + double2);

        System.out.println("double1.equals(double2): " + double1.equals(double2));
        System.out.println("Double.compare(double1, double2): " + Double.compare(double1, double2));
        System.out.println("double1.compareTo(double2): " + double1.compareTo(double2));

        Double double3 = Double.parseDouble("30.5");
        Double double4 = Double.parseDouble("40.5");
        System.out.println("double3: " + double3);
        System.out.println("double4: " + double4);

        Double double5 = Double.valueOf("50.5");
        Double double6 = Double.valueOf("60.5");
        System.out.println("double5: " + double5);
        System.out.println("double6: " + double6);

        long bits = Double.doubleToLongBits(double1);
        System.out.println("Double.doubleToLongBits(double1): " + bits);
        System.out.println("Double.longBitsToDouble(bits): " + Double.longBitsToDouble(bits));

        System.out.println("Double.toString(double1): " + Double.toString(double1));
        System.out.println("Double.toHexString(double1): " + Double.toHexString(double1));

        double primitiveDouble1 = double1.doubleValue();
        double primitiveDouble2 = double2.doubleValue();
        System.out.println("primitiveDouble1: " + primitiveDouble1);
        System.out.println("primitiveDouble2: " + primitiveDouble2);

        System.out.println("double1.hashCode(): " + double1.hashCode());
        System.out.println("double2.hashCode(): " + double2.hashCode());

        System.out.println("Double.TYPE: " + Double.TYPE);

        System.out.println("Double.MAX_VALUE: " + Double.MAX_VALUE);
        System.out.println("Double.MIN_VALUE: " + Double.MIN_VALUE);

        System.out.println("Double.NaN: " + Double.NaN);
        System.out.println("Double.POSITIVE_INFINITY: " + Double.POSITIVE_INFINITY);
        System.out.println("Double.NEGATIVE_INFINITY: " + Double.NEGATIVE_INFINITY);

        System.out.println("Double.BYTES: " + Double.BYTES);
        System.out.println("Double.SIZE: " + Double.SIZE);

        System.out.println("Double.isNaN(double1): " + Double.isNaN(double1));
        System.out.println("Double.isInfinite(double1): " + Double.isInfinite(double1));
        System.out.println("Double.isFinite(double1): " + Double.isFinite(double1));
    }
}