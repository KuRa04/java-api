package io.InterfaceExample;

import java.io.Closeable;
import java.io.IOException;

public class CloseableExample {

  // Closeable インターフェースを実装したクラス
  static class MyResource implements Closeable {
    private boolean isClosed = false;

    @Override
    public void close() throws IOException {
      if (isClosed) {
        System.out.println("Resource is already closed.");
      } else {
        System.out.println("Closing the resource...");
        // リソースの解放処理（実際のリソース解放処理がここに書かれる）
        isClosed = true;
      }
    }

    public void useResource() throws IOException {
      if (isClosed) {
        throw new IOException("Resource is already closed and cannot be used.");
      }
      System.out.println("Using the resource...");
    }
  }

  public static void main(String[] args) {
    // try-with-resources 文で自動的にリソースを閉じる
    try (MyResource resource = new MyResource()) {
      resource.useResource(); // リソースを使用する
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }

    // 手動でclose()を呼び出す場合
    MyResource manualResource = new MyResource();
    try {
      manualResource.useResource(); // リソースを使用する
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      try {
        manualResource.close(); // 明示的にclose()を呼び出す
      } catch (IOException e) {
        System.out.println("Error while closing: " + e.getMessage());
      }
    }
  }
}
