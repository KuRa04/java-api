package lang.InterfaceExample;

public class CharSequenceExample implements CharSequence {

  private final String data;

  public CharSequenceExample(String data) {
    this.data = data;
  }

  @Override
  public int length() {
    return data.length();
  }

  @Override
  public char charAt(int index) {
    return data.charAt(index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return data.substring(start, end);
  }

  @Override
  public String toString() {
    return data;
  }

  public static void main(String[] args) {
    CharSequenceExample example = new CharSequenceExample("Hello, CharSequence!");

    System.out.println("Length: " + example.length());
    System.out.println("Character at index 7: " + example.charAt(7));
    System.out.println("Subsequence (7, 18): " + example.subSequence(7, 18));
    System.out.println("String representation: " + example.toString());
    System.out.println("String representation: " + example.chars());
    System.out.println("String representation: " + example.isEmpty());

    // 42行目と43行目は同じ意味
    example.chars().forEach(c -> System.out.println(c));
    example.chars().forEach(System.out::println);

    example.codePoints().forEach(codePoint -> System.out.println("Code point: " +
        codePoint + "Character: " + (char) codePoint));
  }
}
