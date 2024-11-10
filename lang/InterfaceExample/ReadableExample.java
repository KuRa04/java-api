package lang.InterfaceExample;

import java.nio.CharBuffer;

public class ReadableExample implements Readable {
  private String content;
  private int currentIndex;

  public ReadableExample(String content) {
    this.content = content;
    this.currentIndex = 0;
  }

  @Override
  public int read(CharBuffer cb) {
    if (currentIndex >= content.length()) {
      return -1;
    }
    cb.append(content.charAt(currentIndex));
    currentIndex++;
    return 1;
  }

  public static void main(String[] args) {
    ReadableExample readableExample = new ReadableExample("Hello, World!");
    CharBuffer charBuffer = CharBuffer.allocate(50);

    while (readableExample.read(charBuffer) != -1) {
      charBuffer.flip();
      System.out.println(charBuffer.toString());
      charBuffer.clear();
    }

    charBuffer.flip();
    System.out.println(charBuffer.toString());
  }
}