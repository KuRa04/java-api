package lang.InterfaceExample;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IterableExample implements Iterable<String> {
  private String[] elements;
  private int size;

  public IterableExample(String[] elements) {
    this.elements = elements;
    this.size = elements.length;
  }

  @Override
  public Iterator<String> iterator() {
    return new Iterator<String>() {
      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < size;
      }

      @Override
      public String next() {
        if (!hasNext()) {
          throw new NoSuchElementException();
        }
        return elements[index++];
      }
    };
  }

  public static void main(String[] args) {
    String[] data = { "Alice", "Bob", "Charlie" };
    IterableExample iterableExample = new IterableExample(data);

    for (String element : iterableExample) {
      System.out.println(element);
    }

    // メソッド参照
    iterableExample.forEach(System.out::println);
  }
}