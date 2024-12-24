package lang.ClassExample;

public class StringBuilderExample {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");

    sb.append(", World!");
    System.out.println("After append: " + sb);

    sb.insert(5, " Beautiful");
    System.out.println("After insert: " + sb);

    sb.replace(6, 15, "Java");
    System.out.println("After replace: " + sb);

    sb.delete(6, 10);
    System.out.println("After delete: " + sb);

    sb.deleteCharAt(5);
    System.out.println("After deleteCharAt: " + sb);

    sb.reverse();
    System.out.println("After reverse: " + sb);

    System.out.println("Capacity: " + sb.capacity());

    sb.ensureCapacity(100);
    System.out.println("Capacity after ensureCapacity(100): " + sb.capacity());

    sb.setLength(5);
    System.out.println("After setLength(5): " + sb);

    System.out.println("Char at index 1: " + sb.charAt(1));

    System.out.println("Index of 'o': " + sb.indexOf("o"));

    System.out.println("Last index of 'l': " + sb.lastIndexOf("l"));

    System.out.println("Substring (1, 4): " + sb.substring(1, 4));

    System.out.println("SubSequence (1, 4): " + sb.subSequence(1, 4));

    String result = sb.toString();
    System.out.println("To String: " + result);

    sb.appendCodePoint(65); // ASCIIの'A'を追加
    System.out.println("After appendCodePoint(65): " + sb);

    sb.setCharAt(0, 'M');
    System.out.println("After setCharAt: " + sb);

    sb.trimToSize();
    System.out.println("After trimToSize, capacity: " + sb.capacity());
  }
}
