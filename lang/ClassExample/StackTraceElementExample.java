package lang.ClassExample;

public class StackTraceElementExample {
  public static void main(String[] args) {
    try {
      throw new Exception("Example exception");
    } catch (Exception e) {
      StackTraceElement[] stackTrace = e.getStackTrace();

      // スタックトレースを表示
      for (StackTraceElement element : stackTrace) {
        System.out.println("Class: " + element.getClassName());
        System.out.println("Method: " + element.getMethodName());
        System.out.println("Line: " + element.getLineNumber());
        System.out.println("File: " + element.getFileName());
      }
    }
  }
}
