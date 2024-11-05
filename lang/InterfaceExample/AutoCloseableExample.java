package lang.InterfaceExample;

public class AutoCloseableExample implements AutoCloseable {

  public AutoCloseableExample() {
    System.out.println("Resource opened.");
  }

  public void doSomething() {
    System.out.println("Doing something with the resource.");
  }

  @Override
  public void close() {
    System.out.println("Resource closed.");
  }

  public static void main(String[] args) {
    try (AutoCloseableExample resource = new AutoCloseableExample()) {
      resource.doSomething();
    } catch (Exception e) {
      System.out.println("Exception caught: " + e.getMessage());
    }
  }
}

/*
 * AutoCloseableとCloseableの違い
 *
 * - AutoCloseable:
 *   - パッケージ: java.lang
 *   - try-with-resources文で使用可能な全てのリソースに適用できる汎用インターフェース
 *   - closeメソッドはExceptionをスロー可能で、リソースを解放する際に汎用的な例外をスローする必要がある場合に便利
 *
 * - Closeable:
 *   - パッケージ: java.io
 *   - 主にI/O関連のリソース（例: ファイルやストリーム）に適用されるインターフェース
 *   - closeメソッドはIOExceptionをスローするため、I/O操作に特化しており、入出力エラーに対する例外処理をサポート
 *   - AutoCloseableのサブインターフェースであり、AutoCloseableの機能を含むが、I/O操作に限定されている点が異なる
 */