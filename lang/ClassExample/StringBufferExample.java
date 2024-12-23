package lang.ClassExample;

public class StringBufferExample {
  public static void main(String[] args) {
    StringBuffer buffer = new StringBuffer("Hello, World!");

    buffer.append(" How are you?");
    System.out.println("After append: " + buffer);

    buffer.insert(13, "Beautiful ");
    System.out.println("After insert: " + buffer);

    buffer.replace(0, 5, "Hi");
    System.out.println("After replace: " + buffer);

    buffer.delete(13, 23);
    System.out.println("After delete: " + buffer);

    buffer.deleteCharAt(2);
    System.out.println("After deleteCharAt: " + buffer);

    buffer.reverse();
    System.out.println("After reverse: " + buffer);

    System.out.println("Capacity: " + buffer.capacity());

    buffer.ensureCapacity(50);
    System.out.println("Capacity after ensureCapacity(50): " + buffer.capacity());

    buffer.setLength(5);
    System.out.println("After setLength(5): " + buffer);

    System.out.println("Char at index 1: " + buffer.charAt(1));

    System.out.println("Index of 'o': " + buffer.indexOf("o"));

    System.out.println("Last index of 'o': " + buffer.lastIndexOf("o"));

    System.out.println("Substring (1, 4): " + buffer.substring(1, 4));

    System.out.println("SubSequence (1, 4): " + buffer.subSequence(1, 4));

    System.out.println("To String: " + buffer.toString());

    buffer.appendCodePoint(65); // ASCII value of 'A'
    System.out.println("After appendCodePoint(65): " + buffer);

    buffer.setCharAt(0, 'M');
    System.out.println("After setCharAt: " + buffer);

    buffer.trimToSize();
    System.out.println("After trimToSize, capacity: " + buffer.capacity());
  }
}
