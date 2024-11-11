package lang.InterfaceExample;

import java.lang.StackWalker.StackFrame;
import java.util.List;

public class StackFlameExample {
  public static void main(String[] args) {
    // スタックウォーカーを使用して現在のスレッドのスタックフレームを取得
    StackWalker walker = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);
    List<StackFrame> stackFrames = walker.walk(stream -> stream.toList());

    // スタックフレームの情報を表示
    stackFrames.forEach(frame -> {
      System.out.println("Class Name: " + frame.getByteCodeIndex());
      System.out.println("Class Name: " + frame.getClassName());
      System.out.println("Class Name: " + frame.getDeclaringClass());
      System.out.println("Class Name: " + frame.getDescriptor());
      System.out.println("File Name: " + frame.getFileName());
      System.out.println("Line Number: " + frame.getLineNumber());
      System.out.println("Method Name: " + frame.getMethodType());
      System.out.println("Method Name: " + frame.getMethodName());
      System.out.println("Method Name: " + frame.isNativeMethod());
      System.out.println("Method Name: " + frame.toStackTraceElement());
      System.out.println("---------------------------");
    });
  }
}
