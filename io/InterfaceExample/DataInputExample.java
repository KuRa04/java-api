package io.InterfaceExample;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputExample {
  public static void main(String[] args) {
    // サンプルデータを書き込むファイル
    String fileName = "data_example.dat";

    // ファイルにデータを書き込む
    try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream(fileName))) {
      outputStream.writeInt(42);
      outputStream.writeDouble(3.14159);
      outputStream.writeBoolean(true);
      outputStream.writeUTF("Hello, DataInput!");
    } catch (IOException e) {
      e.printStackTrace();
    }

    // ファイルからデータを読み取る
    try (DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName))) {
      // 各種データ型を読み取る
      int intValue = inputStream.readInt();
      double doubleValue = inputStream.readDouble();
      boolean booleanValue = inputStream.readBoolean();
      String stringValue = inputStream.readUTF();

      // 読み取った値を表示
      System.out.println("Read int: " + intValue);
      System.out.println("Read double: " + doubleValue);
      System.out.println("Read boolean: " + booleanValue);
      System.out.println("Read String: " + stringValue);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
